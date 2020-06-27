package homework3_sda_OPP;

public class Circle implements Figure {

    private int radius;


    public Circle(int radius){
        this.radius = radius;

    }

    @Override
    public Double getArea() {
        return (double) radius * radius * Math.PI;
    }
}


