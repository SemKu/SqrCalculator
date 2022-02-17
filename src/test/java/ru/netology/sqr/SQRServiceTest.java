package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldSqrCalculatorThreeSquareNumberGetInRange() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.sqrCalculator(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCalculatorZeroSquareNumberGetInRange() {
        SQRService service = new SQRService();
        int min = 0;
        int max = 99;
        int expected = 0;
        int actual = service.sqrCalculator(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCalculatorOneSquareNumberGetInRange() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 120;
        int expected = 1;
        int actual = service.sqrCalculator(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCalculatorTwoSquareNumberGetInRange() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 256;
        int expected = 2;
        int actual = service.sqrCalculator(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCalculatorAllSquareNumberGetInRange() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 9801;
        int expected = 90;
        int actual = service.sqrCalculator(min, max);
        assertEquals(expected, actual);
    }
}