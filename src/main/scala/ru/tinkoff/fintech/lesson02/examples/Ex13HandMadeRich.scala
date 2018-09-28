package ru.tinkoff.fintech.lesson02.examples

object EnrichMyInt {
  implicit class CoolOps(private val x: Int) extends AnyVal {
    def *:(str: String): String = str * x
  }
}

object Ex13HandMadeRich extends App {
  import EnrichMyInt._


  println("kek" *: 42)
  println(42.*:("kek"))
}
