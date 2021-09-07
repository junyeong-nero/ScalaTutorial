package Entity

class Entity(var vel: Array[Double] = Array(0, 0, 0),
			 var pos: Array[Double] = Array(0, 0, 0),
			 var tag: String = "none",
			 var height: Float = 1F,
			 var width: Float = 1F) {

	def entity(vel: Array[Double], pos: Array[Double], tag: String): Unit = {
		this.vel = vel
		this.pos = pos
		this.tag = tag
	}

	override def toString: String = {
		s"${this.tag} : ${this.pos.mkString("pos(", ", ", ")")} / ${this.vel.mkString("vel(", ", ", ")")}"
	}
}
