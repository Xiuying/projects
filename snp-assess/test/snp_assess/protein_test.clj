(ns snp-assess.reference-test
  (:use [midje.sweet]
        [snp-assess.protein])
  (:require [fs.core :as fs]))

(fact "Convert reference sequence into map of codons and know amino acid changes"
  (let [ref-file (str (fs/file "test" "data" "protein" "hxb2-ref.fa"))
        mut-file (str (fs/file "test" "data" "protein" "known_integrase_mutations.csv"))
        prot-map (prep-protein-map {:files ref-file :known mut-file
                                    :frame-offset 0 :aa-offset 49})]
    (get prot-map 0) => {:offset 0 :codon [\G \C \C] :aa-pos 49 :known {}}
    (get prot-map 2) => {:offset 2, :codon [\G \C \C] :aa-pos 49 :known {}}
    ;;prot-map => nil
    (-> prot-map (get 319) :known (get "S")) => ["EVG30" "RAL15"]
    (-> prot-map (get 313) :known) => {"Y" ["EVG15"]}))