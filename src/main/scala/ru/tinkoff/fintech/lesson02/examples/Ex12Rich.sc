-10.abs
10 max 20
14 to 42

"bob".capitalize
"robert" drop 2
"robert" take 4



(33 to 66).map{x => x.toChar}.mkString("")
(33 to 66).foldLeft(1){(acc, x) => acc * x} // WHY???
