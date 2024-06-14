
package MovablePoint;


public class Demo{
    public static void main(String[] args) {
        Point p1 = new Point(0.1f, 1.1f);
        System.out.println("Point p1: " + p1);

        MovablePoint mp1 = new MovablePoint(0.5f, 1.5f, 0.5f, 0.5f);
        System.out.println("MovablePoint mp1: " + mp1);

        mp1.move();
        System.out.println("After moving mp1: " + mp1);

        mp1.setSpeed(1.0f, 1.0f);
        mp1.move();
        System.out.println("After updating speed and moving mp1: " + mp1);   
    }
}
