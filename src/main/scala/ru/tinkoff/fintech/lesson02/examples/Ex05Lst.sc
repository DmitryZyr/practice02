val list = List(1,2,3,4,5)
val listStrange = List(1,2,3,4,5,"Here walks your rabbit")

val list1 = 12.0 :: list
val listStrange1 = 42.0 :: listStrange

list1.head
list1.tail

listStrange1.head
listStrange1.tail


list.map {x => x + "1"}
list.flatMap {x => List(x, x + 1)}
list.foldLeft(0) {(acc, x) => acc + x}