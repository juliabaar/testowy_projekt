package homework3_sda_OPP;

public class Traingle implements Figure {

    private int height;
    private int lenght;

    public Traingle(int height, int lenght){
        this.height = height;
        this.lenght = lenght;

    }

    @Override
    public Double getArea() {
        return (double) height*lenght*(1/2d);
    }
}
