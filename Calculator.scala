import inheritance.Calculator

object Calculator {

  def main(args: Array[String]): Unit = {
    val cal = new Calculator("HP");
    println(cal.add(1, 2));
    println(cal.color)
  }
}
