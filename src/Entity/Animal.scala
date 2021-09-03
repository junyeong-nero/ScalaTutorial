package Entity

class Animal(var animalType: Int = Type.ANIMAL.NONE)
		extends Entity() {

	override def toString: String = {
		s"${this.tag}(${Type.id2name(animalType)}) : ${this.pos.mkString("pos(", ", ", ")")} / ${this.vel.mkString("vel(", ", ", ")")}"
	}
}
