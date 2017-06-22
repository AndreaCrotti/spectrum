(ns spectrum.examples.good.if-no-else
  (:require [clojure.spec.alpha :as s]))

(s/fdef foo :args (s/cat :x string?) :ret string?)
(defn foo [x]
  (if (string? x)
    "truthy"))
