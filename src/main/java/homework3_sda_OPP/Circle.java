package homework3_sda_OPP;

public class Circle implements Figure {

    private int radius;
    private static final double PI = 3.14;

    public Circle(int radius){
        this.radius = radius;

    }

    @Override
    public Double getArea() {
        return radius * radius * PI;
    }
}


