public class Point{
  private double x,y;

  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
      if(other != null){
    return Math.sqrt(Math.pow((other.getX()-this.getX()),2)+Math.pow((other.getY()-this.getY()),2));
  }
  return 0;
}

  public boolean equals(Point other){
    return other != null && (other.getX() == this.getX() && other.getY() == this.getY());
  }
}
