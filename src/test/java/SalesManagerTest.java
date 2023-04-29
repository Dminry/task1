import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesManagerTest {

    @Test
    public void max() {
        long[] sales = {1, 2, 3, 4, 5};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        assertEquals(5, max);
    }

    @Test
    public void min() {
        long[] sales = {2, 3, 4, 5, 6};
        long expectedMin = 2;
        SalesManager salesManager = new SalesManager(sales);
        long actualMin = salesManager.min();
        assertEquals(expectedMin, actualMin);

    }

    @Test
    public void average() {
        long[] sales = {4, 6, 4, 6, 5};
        SalesManager salesManager = new SalesManager(sales);
        long expected = (4 + 6 + 4 + 6 + 5) / sales.length;
        long actual = salesManager.average();
        Assertions.assertEquals(expected, actual);
    }
}