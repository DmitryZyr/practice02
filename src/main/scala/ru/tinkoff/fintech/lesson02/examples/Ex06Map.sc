val map = Map(1 -> "one", 2 -> "two",
  3 -> "three", 4 -> "four",5 -> "five")

1 -> "one" // it's not syntax!

val mapStrange = Map(1 -> "one", 2 -> "two",
  3 -> "three", 4 -> "four", 5 -> "five",
  6.0D -> "Here walks your rabbit")

val map1 =  map + (12 -> 12.0)
val mapStrange1 =
  mapStrange.+(42.0F -> mapStrange)


map.map{case (k, v) => (k + 1 -> v * 2)}
map.foldLeft((0, "")){(acc, kv) =>
  (acc._1 + kv._1, acc._2 + kv._2)
}
