import Entity._
// import the names define in Entity package
// same as numpy import *


import scala.collection.mutable

object main {
	// Similar to Kotlin

	val addition = (x: Int, y: Int) => x + y // seems like lambda in JAVA but JAVA use ->
	def multiplication(x: Int, y: Int): Int = { // Unit is subtype of AnyVar
		x * y // we don't need return keyword!
	}

	val log = (text: String) => println(s"${this.getClass.getSimpleName}/${text}")
	val fact: Int => Int = (x: Int) => {
		if (x == 1) x
		else x * fact(x - 1)
	}

	def main(args: Array[String]): Unit = {
		FunctionalProgramming()
	}

	def ClassTest(): Unit = {
		val e: Entity = new Entity();
		e.vel = Array(0, 1, 0)

		val a: Animal = new Animal(Type.ANIMAL.PIG)
		a.animalType = Type.ANIMAL.SHEEP
		a.pos = Array(1, 2, 3)
		log(a.toString)
	}

	def IfTest(): Unit = {
		val x = if (1 == 2) 50 else 10
		println(x)
	}

	def ListTest(): Unit = {
		// List
		val empty = List()
		val two: List[Int] = List(1, 2)
		//		val test = List(1, "Hello World") // error
		println(two)
		println(two.apply(1))
		println(two(1))
	}

	def TupleTest(): Unit = {
		val tuple = ("number", 1)
		println(tuple)
		println(s"tuple index 1 : ${tuple._1}")
		println(s"tuple index 2 : ${tuple._2}")

//		val a, b = ("number", 1)
//		println(s"${a}, ${b}") // both a and b are ("number", 1)
	}

	def MapTest(): Unit = {
		val a = Map(1 -> "John", 2 -> "Marry")
		val b = Map()
		println(a(1)) // "John"

		mutable.HashMap
	}

	sealed trait IntList
	case class Nil() extends IntList
	case class Cons(head: Int, tail: IntList) extends IntList

	def FunctionalProgramming(): Unit = {
		println(sum(10))
		val test = Cons(10, Cons(9, Nil())) // 10::9::nil
		val test2 = Cons(1, Cons(2, Cons(3, Nil()))) // 1,2,3
		val test3 = Cons(4, Cons(5, Cons(6, Nil()))) // 4,5,6
		println(s"test1 : ${toString(test)}")
		println(s"test2 : ${toString(test2)}")
		println(s"test3 : ${toString(test3)}")
		println(length(test))

		println(s"test3 : ${toString(remove(test3, 2))}")
		println(s"test3 : ${toString(add(test3, 2, 100))}")
	}


	def sum(num: Int): Int =
		if (num == 0)
			0
		else
			num + sum(num - 1)

	def length(list: IntList): Int =
		list match {
			case Nil() => 0
			case Cons(head, tail) => 1 + length(tail)
		}

	def map(list: IntList, func: Int => Int): IntList =
		list match {
			case Nil() => Nil()
			case Cons(head, tail) => Cons(func(head), map(tail, func))
		}

	def toString(list: IntList, str: String = ""): String =
		list match {
			case Nil() => str.substring(0, str.length - 2)
			case Cons(head, tail) => toString(tail, str + head.toString + ", ")
		}

	def concat(first: IntList, second: IntList): IntList =
		first match {
			case Nil() => second
			case Cons(head, tail) => Cons(head, concat(tail, second))
		}

	def add(list: IntList, index: Int, element: Int): IntList =
		list match {
			case Nil() => Nil()
			case Cons(head, tail) =>
				if (index == 0)
					Cons(element, list)
				else
					Cons(head, add(tail, index - 1, element))
		}

	def remove(list: IntList, index: Int): IntList =
		list match {
			case Nil() => Nil()
			case Cons(head, tail) =>
				if (index == 0)
					remove(tail, index - 1)
				else
					Cons(head, remove(tail, index - 1))
		}
}