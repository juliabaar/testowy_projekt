package homework3_sda_OPP;

public class Circle {

    private int radius;
    private static final double PI = 3.14;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(int radius, double PI){
        return radius*radius*PI;
    }
}


