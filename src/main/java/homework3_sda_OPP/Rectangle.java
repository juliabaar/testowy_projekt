package homework3_sda_OPP;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(int length, int width){
        return  length*width;
    }

}
