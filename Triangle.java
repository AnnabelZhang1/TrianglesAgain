public class Triangle{

  private Point v1, v2, v2;

//constructors
  public Triangle(Point a, Point b, Point c)
    {
      v1 = a;
      v2 = b;
      v3 = c;
    }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
      v1 = new Point(x1, y1);
      v2 = new Point(x2, y2);
      v3 = new Point(x3, y3);
    }

//accessors
  public double getPerimeter()
    {
      a = v1.distanceTo(v2);
      b = v2.distanceTo(v3);
      c = v3.distanceTo(v1);
      return a + b + c;
    }

  public double getArea()
    {
      a = v1.distanceTo(v2);
      b = v2.distanceTo(v3);
      c = v3.distanceTo(v1);
      s = (a + b + c)/2;
      return Math.sqrt(s(s-a)(s-b)(s-c));
    }

  public String classfiy()
    {
      ~~
    }

  public String toString()
    {
      ~~
    }

//mutator
  public void setVertex(int index, Point newP)
    {
      ~~
    }

}
