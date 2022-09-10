package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testLess1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual,expected);

    }

    @org.testng.annotations.Test
    public void test1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual,expected);

    }

    @org.testng.annotations.Test
    public void testMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual,expected);

    }
}
