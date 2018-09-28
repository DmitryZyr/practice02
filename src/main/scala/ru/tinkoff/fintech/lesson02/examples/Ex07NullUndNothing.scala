package ru.tinkoff.fintech.lesson02.examples

object Ex07NullUndNothing extends App {

  // null compatible only with AnyRef
  //val x01null: Int = null
  val x02null: String = null

  // no "nothing" instance
  //err// val x03: Int = nothing
  //err// val x04: String = nothing


  //nothing
  def error(msg: String): Nothing = {
    throw new RuntimeException("badaboom")
  }

  val intint42: Int =
    if (2 == 2) 42
    else error("2 eq 2")

  // null ops

  println(null == null)
  println(null.toString)
//  println(null.hashCode)
}
