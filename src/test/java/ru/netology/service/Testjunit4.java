package ru.netology.service;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class Testjunit4 {
    @Test
    public void testLess3000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(2999);
        assertEquals(actual, expected);
    }

    @Test
    public void test3000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(3000);
        assertEquals(actual, expected);

    }

    @Test
    public void testMore3000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(3001);
        assertEquals(actual, expected);

    }
}
