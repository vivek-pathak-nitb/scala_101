object Calculator {

  def main(args: Array[String]): Unit = {
    val cal = new Calculator;
    print(cal.add(1, 2));
  }
}

class Calculator {

  val brand: String = "HP"

  def add(m: Int, n: Int): Int = m + n;
}
