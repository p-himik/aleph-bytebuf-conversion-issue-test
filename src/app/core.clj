(ns app.core
  (:require [aleph.netty]
            [byte-streams]
            [byte-streams.graph :as g])
  (:import (io.netty.buffer PooledSlicedByteBuf)))

(defn -main [& _]
  (println (some? (g/conversion-fn @byte-streams/conversions
                                   (g/type PooledSlicedByteBuf)
                                   (g/type (class (byte-array 0)))))))
