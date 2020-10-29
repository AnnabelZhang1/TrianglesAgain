public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y)
    {
      x=X;
      y=Y;
    }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p)
    {
      x= p.x;  //private access in the same file is allowed!
      y= p.y;
    }

  public double getX()
    {
      return x;
    }

  public double getY()
    {
      return y;
    }

  public Point copy()
    {   //objects need a method to make identical copies of them, since assignment copies the reference, it is redundant in  this case
    //return new Point(x,y); //using this.x and this.y
    //OR
      return new Point(this); //since you have a constructor that does the same thing!
    }

  
}
