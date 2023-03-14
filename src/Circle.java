public class Circle {
    private static final double PI=3.14d;
    private static int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void circumFerence(){
        System.out.println(PI*2*radius);
    }
    public static void area(){
        System.out.println(PI*(radius*radius));
    }

}
