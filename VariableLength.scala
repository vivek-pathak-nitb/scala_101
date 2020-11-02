object VariableLength {

  private def capitalizeAll(args : String*) ={
      args.map{
        arg => arg.capitalize
      }
  }

  def main(args: Array[String]): Unit = {
    val capitalized = capitalizeAll("hello", "world");
    println(capitalized)
  }

}
