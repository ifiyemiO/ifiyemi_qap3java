
package MovablePoint;


public class Demo{
    public static void main(String[] args) {
        /*MovablePoint m1 = new MovablePoint();
        System.out.println(m1);
        MovablePoint m2 = new MovablePoint(1, 2);
        System.out.println(m2);
        MovablePoint m3 = new MovablePoint(3, 4, 5, 6);
        System.out.println(m3);
        
        m1.setX(7);
        m1.setY(8);
        m1.setxSpeed(9);
        m1.setySpeed(10);
        System.out.println(m1);
        System.out.println("Move: " + m1.move());*/

        // Create a Point object
        Point p1 = new Point(0.1f, 1.1f);
        System.out.println("Point p1: " + p1);

        // Create a MovablePoint object
        MovablePoint mp1 = new MovablePoint(0.5f, 1.5f, 0.5f, 0.5f);
        System.out.println("MovablePoint mp1: " + mp1);

        // Move the MovablePoint
        mp1.move();
        System.out.println("After moving mp1: " + mp1);

        // Update speed and move again
        mp1.setSpeed(1.0f, 1.0f);
        mp1.move();
        System.out.println("After updating speed and moving mp1: " + mp1);   
    }
}
