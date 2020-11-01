public class Triangle{

  private Point v1, v2, v2;

//constructors
  public Triangle(Point a, Point b, Point c)
    {
      v1 = a;
      v2 = b;
      v3 = c;
    }

  public Sides()
    {
      a = v1.distanceTo(v2);
      b = v2.distanceTo(v3);
      c = v3.distanceTo(v1);
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
      Sides();
      return a + b + c;
    }

  public double getArea()
    {
      Sides();
      double s = (a + b + c)/2;
      return Math.sqrt(s(s-a)(s-b)(s-c));
    }

  public double rounded(double n)
    {
      n = Math.round(n*10000)/10000;
    }

  public String classfiy()
    {
      Sides();
      a1 = rounded(a);
      b1 = rounded(b);
      c1 = rounded(c);

      if (a1 == b1 && b1 == c1))
        return "Equilateral";
      else if (a1 == b1 || b1 == c1)
        return "Isosceles";
      else
        return "Scalene";
    }

  public String toString()
    {
      return "v1(" + v1.getX() + ", " + v1.getY() + ") "
           + "v2(" + v2.getX() + ", " + v2.getY() + ") "
           + "v3(" + v3.getX() + ", " + v3.getY() + ")";
    }

//mutator
  public void setVertex(int index, Point newP)
    {
      if index == 0
        v1 = newP;
      if index == 1
        v2 = newP;
      if index == 2
        v3 = newP;
      else
        return "error";
    }

}
