;; Adjustable filtering and analysis parameters
(ns snp-assess.config)

(def default-config
  {:kmer-range [1e-5 1e-1]
   :qual-range [4.0 35.0]
   :map-score-range [0.0 250.0]
   :random-coverage-step 100
   :random-coverage-sample 50
   :min-score 1.2
   :min-freq 0.0035
   :allowed-freq-diff 2.0
   :verbose false
   :classification {:max-pos-pct 10.0
                    :max-neg-pct 0.75
                    :naive-min-score 0.5
                    :pass-thresh 0.8}})
