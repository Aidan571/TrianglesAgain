public class TriangleTester{
  public static void main(String[]args){
  Triangle t1 = new Triangle(0,0,3,2,5,0);
  System.out.println(t1.getPerimeter());
  System.out.println(t1.getArea());
  Triangle t2 = new Triangle(0,0,1,0,0,1);
  Triangle t3 = new Triangle(0,0,6,0,3,Math.sqrt(27));
  Point p1 = new Point(2,3);
  System.out.println(t1.classify());
  System.out.println(t2.classify());
  System.out.println(t3.classify());
  System.out.println(t1.toString());
  t1.setVertex(1,p1);
  System.out.println(t1.toString());
  System.out.println(t2.toString());
  t2.setVertex(0,p1);
  System.out.println(t2.toString());
  System.out.println(t3.toString());
  t3.setVertex(2,p1);
  System.out.println(t3.toString());
  }
}
