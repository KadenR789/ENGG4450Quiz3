import com.jwetherell.algorithms.mathematics.Distance; // Import the Distance class
import org.junit.jupiter.api.Test; // JUnit 5 Test annotation
import static org.junit.jupiter.api.Assertions.*; // JUnit Assertions

class DistanceTest {

    @Test
    void testChebyshevDistance() {
        long[] point1 = {3, 5};
        long[] point2 = {6, 1};
        assertEquals(4, Distance.chebyshevDistance(point1, point2)); // Expected: 4
    }

    @Test
    void testSquaredDistance() {
        double x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        assertEquals(25.0, Distance.squaredDistance(x1, y1, x2, y2)); // Expected: 25.0
    }

    @Test
    void testEuclideanDistance() {
        double x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        assertEquals(5.0, Distance.euclideanDistance(x1, y1, x2, y2)); // Expected: 5.0
    }
}