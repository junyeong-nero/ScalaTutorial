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
		val e: Entity = new Entity();
		e.vel = Array(0, 1, 0)

		val a: Animal = new Animal(Type.ANIMAL.PIG)
		a.animalType = Type.ANIMAL.SHEEP
		a.pos = Array(1, 2, 3)
		log(a.toString)

		TupleTest()
		MapTest()

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
}