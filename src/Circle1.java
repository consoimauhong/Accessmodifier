public class Circle1 {
    public double radius = 1.0;
    public String color = "red";


    public Circle1(){
    }
    public Circle1(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return this.radius * radius * Math.PI;
    }
    public  String toString(){
        return "Dien tich hinh tron" + getArea();
    }
}
