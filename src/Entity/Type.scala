package Entity

import scala.collection.mutable

object Type {
	object ANIMAL {
		val NONE = 0
		val PIG = 1
		val COW = 2
		val sheep = 3
	}

	val id2name: mutable.HashMap[Int, String] = mutable.HashMap(
		0 -> "NONE",
		1 -> "PIG",
		2 -> "COW",
		3 -> "SHEEP",
	)

	val name2id: mutable.HashMap[Int, String] = mutable.HashMap(
		"NONE" -> 0,
		"PIG" -> 1,
		"COW" -> 2,
		"SHEEP" -> 3,
	)
}
