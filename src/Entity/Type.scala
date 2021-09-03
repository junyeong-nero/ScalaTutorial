package Entity

import scala.collection.mutable

object Type {
	object ANIMAL {
		val NONE = 0
		val PIG = 1
		val COW = 2
		val SHEEP = 3
	}

	val id2name: Map[Int, String] = Map(
		0 -> "NONE",
		1 -> "PIG",
		2 -> "COW",
		3 -> "SHEEP",
	)

	val name2id: Map[String, Int] = Map(
		"NONE" -> 0,
		"PIG" -> 1,
		"COW" -> 2,
		"SHEEP" -> 3,
	)
}
