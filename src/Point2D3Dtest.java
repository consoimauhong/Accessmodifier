public class Point2D3Dtest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        point3D.setXYZ(0.1F,0.5F,0.2F);
        System.out.println(point3D.toString());
    }
}
