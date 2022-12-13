import java.util.Arrays;
public class Point2D {
    private float x = 0.0F;
    private float y = 0.0F;

    public Point2D(){
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
    public  float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }
    public  void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {

        float[] xy = {this.x, this.y};
        return xy;
    }

    public String toString() {
        return "x: " + this.getX()
                + "\nY: " + this.getY()
                + "\nXY: " + Arrays.toString(this.getXY());
    }
}
