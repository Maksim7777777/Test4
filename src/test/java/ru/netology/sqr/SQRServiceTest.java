package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void calcTestWhenFewNumbersFinded() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void calcTestWhenFewNumbersFinded1() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 200);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTestWhenFewNumbersFinded2() {
        SQRService service = new SQRService();
        int actual = service.calc(10000, 20000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}



