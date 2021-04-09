package Triangle;

public class Triangle extends Shape{
    private double size1=1,size2=1,size3=1;
    public Triangle(){

    }
    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getArea(){
        return size1+size2+size3;
    }
    public double getPerimeter(){
        double p = (size1+size2+size3)/2;
        return Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                '}';
    }
}
