import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void testDivision() {
        assertEquals(2, Division.division(10, 5));
        assertThrows(ArithmeticException.class, () -> Division.division(10, 0));
    }

    @Test
    void testDivisionUsingLoop() {
        assertEquals(2, Division.divisionUsingLoop(10, 5));
        assertEquals(-2, Division.divisionUsingLoop(-10, 5));
        assertEquals(0, Division.divisionUsingLoop(1, 5));
    }

    @Test
    void testDivisionUsingRecursion() {
        assertEquals(2, Division.divisionUsingRecursion(10, 5));
        assertEquals(-2, Division.divisionUsingRecursion(-10, 5));
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingRecursion(10, 0));
    }
}