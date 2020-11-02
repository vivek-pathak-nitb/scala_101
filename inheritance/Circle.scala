package inheritance

class Circle(radius: Int) extends Shape {

  private val r = radius;

  def getArea: Int = {
    3 * r * r;
  }
}
