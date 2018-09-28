package ru.tinkoff.fintech.lesson02.examples

object Ex10EqualsImpl extends App {
  class Point(val x: Int, val y: Int) {

/*
    //try 1
    def equals(other: Point): Boolean =
      other.x == this.x && other.y == this.y
*/

/*
    //try 2
    override def equals(other: Any): Boolean = other match {
      case that: Point => that.x == this.x && that.y == this.y
      case _           => false
    }
*/

/*
    //try 3
    override def hashCode = (x, y).hashCode()
*/
  }

  import scala.collection.mutable

  val p1, p2 = new Point(1, 2)
  println(mutable.HashSet(p1).contains(p2))
}
