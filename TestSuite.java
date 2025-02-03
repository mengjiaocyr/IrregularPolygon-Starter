import java.awt.geom.*; // for Point2D.Double
import java.util.Arrays;

public class TestSuite {
    // Run a bunch of basic tests on IrregularPolygon
    public static void run()
    {
        System.out.println("Starting TestSuite");
        boolean pass = true;

        double[][] singlePoint = { { 0, 0 } };
        pass &= basicTest("Single Point", singlePoint, 0, 0);

        double[][] parallelogramPoints = { { 20, 10 }, { 70, 20 }, { 50, 50 }, { 0, 40 } };
        pass &= basicTest("Parallelogram", parallelogramPoints, 174.1, 1700);

        if (pass == true)
        {
            System.out.println("--- TEST PASSED! Congrats! ---");
        }
        else
        {
            System.out.println("--- TEST FAILED! :( ---");
        }
    }

    public static boolean basicTest(String description, double[][] points, double perimeter, double area)
    {
        System.out.println("Test: " + description);
        IrregularPolygon poly = new IrregularPolygon();
        for (double[] point : points)
        {
            System.out.println("  Adding point: " + Arrays.toString(point));
            poly.add(new Point2D.Double(point[0], point[1]));
        }

        if (1 == 2)
        {
            System.out.println(" PASS: ...");
            return true;
        }
        else
        {
            System.out.println(" FAIL: ...");
            return false;
        }
    }
}
