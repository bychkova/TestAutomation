package ru.netology;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @org.junit.Test
    public void testRemainBottomBorder() {
        int testAmount = 0;
        int expected = 1000;
        int actual = cashback.remain(testAmount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainTopBorder() {
        int testAmount = 1000;
        int expected = 0;
        int actual = cashback.remain(testAmount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainSmallSum() {
        int testAmount = 1;
        int expected = 999;
        int actual = cashback.remain(testAmount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainAmountBelow1000() {
        int testAmount = 777;
        int expected = 223;
        int actual = cashback.remain(testAmount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainAmountAbove1000() {
        int testAmount = 1345;
        int expected = 655;
        int actual = cashback.remain(testAmount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainAmountIsDivisibleBy1000() {
        int testAmount = 3000;
        int expected = 0;
        int actual = cashback.remain(testAmount);

        assertEquals(expected, actual);
    }
}