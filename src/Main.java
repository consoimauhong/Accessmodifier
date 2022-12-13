public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        System.out.println(p.toString());

        MoveablePoint mp = new MoveablePoint();
        mp.setSpeed(10.5f,10.5f);
        System.out.println(mp.toString());
        System.out.println(mp.move());
    }
}