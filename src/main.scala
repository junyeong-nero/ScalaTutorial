import Entity.{Animal, Entity, Type}

object main {
	// Similar to Kotlin

	val addition = (x: Int, y: Int) => x + y // seems like lambda in JAVA but JAVA use ->
	def multiplication(x: Int, y: Int): Int = { // Unit is subtype of AnyVar
		x * y // we don't need return keyword!
	}

	val log = (text: String) => println(s"${this.getClass.getSimpleName}/${text}")

	def main(args: Array[String]): Unit = {
		//		log("Hello World!")
		//		log(List("Hello", "World").mkString("", ", ", "!"))
		//		log(addition(1, 1023).toString)
		val e: Entity = new Entity();
		e.vel = Array(0, 1, 0)

		val a: Animal = new Animal(Type.ANIMAL.PIG)
		a.animalType = Type.ANIMAL.SHEEP
		a.pos = Array(1, 2, 3)
		log(a.toString)
	}
}