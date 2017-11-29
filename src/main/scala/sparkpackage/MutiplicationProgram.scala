package sparkpackage

object MutiplicationProgram {
def main(args: Array[String]): Unit = {
  println("Hello World")
  println("The product of a and b is: " + mul(7, 9))
}
def mul( a:Int, b: Int): Int = {
val mult = a*b
return mult
}
}