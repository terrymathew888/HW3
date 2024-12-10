import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {

    Average avgCalculator = new Average();

    // Functional Test Cases
    @Test
    void testFunctionalCase1() {
        int[] list = {10, 20, 30, 40, 50};
        assertEquals(30, avgCalculator.average(10, list));
    }

    @Test
    void testFunctionalCase2() {
        int[] list = {};
        assertEquals(0, avgCalculator.average(3, list));
    }

    @Test
    void testFunctionalCase3() {
        int[] list = {10, 20, 30, 40, 50};
        assertEquals(30, avgCalculator.average(5, list));
    }

    @Test
    void testFunctionalCase4() {
        int[] list = {10, 20, 30};
        assertEquals(0, avgCalculator.average(0, list));
    }

    @Test
    void testFunctionalCase5() {
        int[] list = {10, 20, 30, 40};
        assertEquals(20, avgCalculator.average(3, list));
    }
}
