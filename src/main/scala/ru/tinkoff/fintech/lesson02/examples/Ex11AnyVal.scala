package ru.tinkoff.fintech.lesson02.examples

trait Printable extends Any {
  def print(): Unit = println(this)
}

case class Wrapper(val underlying: Int) extends AnyVal with Printable {
  def plus1 = Wrapper(underlying + 1)
}

object Ex10AnyVal extends App {
  val w = Wrapper(3)
  w.plus1 // the same as 3 + 1

  w.print() // requires instantiating a Wrapper instance
  val array = Array(w) // requires instantiating a Wrapper instance
  w match { // requires instantiating a Wrapper instance
    case Wrapper(2) => println("kek")
    case Wrapper(x) => println("barabek")
  }
}