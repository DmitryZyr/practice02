package ru.tinkoff.fintech.lesson02.examples
import org.scalatest.{FlatSpec, Matchers}


class Ex14Spec
  extends FlatSpec // стиль написания тестов
  with Matchers // нам необходимы матчеры (should be и прочее)
{
  "A Stack" should
    "pop values in last-in-first-out order" in // "стек" должен "то-то" - описание теста
  {
    var stack = List.empty[Int]
    var stack1 =  1 :: stack
    var stack2 =  2 :: stack

    stack2.head should be (2) // проверяем поведение с помощю матчеров
    stack1.head should be (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = List.empty[Int]
    a [NoSuchElementException] should be thrownBy { // проверяем на выброс эксепшена
      emptyStack.head
    }
  }

  it should "some matchers" in {
    var stack = List.empty[Int]

    var stack1 =  1 :: stack
    stack1.head should be (1) // еще матчеры, их много, смотрите в доке
    stack1.head should be < 2
    stack1.head should be > 0
  }
}
