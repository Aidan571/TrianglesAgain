public class Triangle{
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea(){
    double s = this.getPerimeter() / 2;
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
  }

  public String classify(){
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    if(a == b && b == c){
    return "equilateral";
    }
    if((a == b && b != c) || (a == c && b != a) || (c == b && c != a)){
     return "isosceles";
    }
    if((a != b) && (a != c) && (c != b)){
     return "scalene";
    }
    return "scalene";
  }

  public String toString(){
    return "v1" + "(" + this.v1.getX() + "," + this.v1.getY() + ") " +
    "v2" + "(" + this.v2.getX() + "," + this.v2.getY() + ") " +
    "v3" + "(" + this.v3.getX() + "," + this.v3.getY() + ") ";
  }

  public void setVertex(int index, Point newP){
    if(index <= 2 && index >= 0){
    if(index == 0){
      this.v1 = newP;
    }
    if(index == 1){
      this.v2 = newP;
    }
    if(index == 2){
      this.v3 = newP;
    }
  }
}
}
