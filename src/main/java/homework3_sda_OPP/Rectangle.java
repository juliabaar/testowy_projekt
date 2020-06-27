package homework3_sda_OPP;

public class Rectangle implements Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getArea() {
        return (double) length*width;
    }
}
