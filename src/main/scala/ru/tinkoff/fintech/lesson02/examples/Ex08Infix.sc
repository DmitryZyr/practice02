//normal
1.+(2)

//infix
1 + 2

//normal
"foobar".toCharArray()

//no braces
"foobar".toCharArray

//postfix
"foobar" toCharArray

//infix
"foobar" indexOf 'o'
"foobar" + 'o'
"foobar".+('o')

//unary
1.unary_-
-1

//:

1 :: Nil
Nil.::(1)

1 +: Nil
Nil.+:(1)

// apply
val arraInt1 = Array(1,2,3,4,5)
arraInt1(3)

val arraInt2 = Array.apply(1,2,3,4,5)
arraInt2.apply(3)

"fooobaaaar"(6)
"fooobaaaar".apply(6)

val func = {x: Int => x + 1}
func(2)
func.apply(2)

// ->
1 -> "one"
1.->("one")