package Entity

class Animal(var animalType: Int = Entity.Type.ANIMAL.NONE) extends Entity {
	override def toString: String = {
		s"${this.tag}(${Entity.Type.id2name(animalType)}) : ${this.pos.mkString("pos(", ", ", ")")} / ${this.vel.mkString("vel(", ", ", ")")}"
	}
}
