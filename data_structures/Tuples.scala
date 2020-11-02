package data_structures

object Tuples {

  def main(args: Array[String]): Unit = {
    val tuple = ("Vivek", 30)
    println(tuple._1)
    println(tuple._2)

    tuple match {
      case ("localhost", 1) => println("Localhost")
      case ("Vivek", 30) => println("Vivek")
    }
  }
}
