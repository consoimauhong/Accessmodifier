public class Cylinder extends Circle1{
    public double height = 1.0;

    public Cylinder(){
    }
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return this.getArea() * this.height;
    }
    public String toString(){
        return "The tich la" + this.getVolume();
    }

}
