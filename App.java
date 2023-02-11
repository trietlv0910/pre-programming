import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.0f, 2.0f);
        point2D.setXY(3.0f, 4.0f);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(1.0f, 3.0f, 9.0f);
        System.out.println(point3D);
    }
}
