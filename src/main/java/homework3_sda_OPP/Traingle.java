package homework3_sda_OPP;

public class Traingle {

    private int height;
    private int lenght;

    public Traingle(int height, int lenght){
        this.height = height;
        this.lenght = lenght;
    }

    public double getArea(int height, int lenght){
        return height*lenght*(1/2d);
    }

}
