public class PointTester{
  public static void main(String[]args){
    Point p1 = new Point(0,0);
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    Point p2 = new Point(p1);
    System.out.println(p2.getX());
    System.out.println(p2.getY());
    Point p3 = new Point(3,0);
    Point p4 = new Point(7,5);
    System.out.println(p1.distanceTo(p2));
    System.out.println(p1.distanceTo(p3));
    System.out.println(p1.distanceTo(p4));
  }
}
