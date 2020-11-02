package data_structures

object Maps {

  def main(args: Array[String]): Unit = {
    val map = Map("one"->1, "two"->2);
    val result = map.get("three")
    val output1 = result.getOrElse(0)*2
    println(output1)
    val output2 = result match {
      case Some(n) => n*2;
      case None => 0;
    }
    println(output2)
  }

}
