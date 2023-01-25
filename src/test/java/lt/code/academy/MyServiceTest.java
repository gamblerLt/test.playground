package lt.code.academy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//tokia klase sikurti galima su ctrl +shift +t
class MyServiceTest {

    private MyService service;

    @BeforeEach
    void setUp() {
        service = new MyService();
    }

    @Test
    void testSum() {
        int sum = service.sum(50, 50);
        assertEquals(100, sum);
    }

    @Test
    void testSum2() {
        int sum = service.sum(null, 50);
        assertEquals(0, sum);

    }
    @Test
    void testSum3() {
        int sum = service.sum(50, null);
        assertEquals(0, sum);

    }
}