package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWitCashback() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 100;
        Assert.assertEquals(expected, service.remain(900));
    }

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        Assert.assertEquals(expected, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void remainJupiterTestWithCashback() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 100;
        Assertions.assertEquals(service.remain(900), expected);
    }

    @org.junit.jupiter.api.Test
    public void remainJupiterTest() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 0;
        Assertions.assertEquals(service.remain(1000), expected);
    }

}