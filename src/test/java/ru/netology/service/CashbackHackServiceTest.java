package ru.netology.service;

import org.testng.Assert;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemainWitCashback() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 100;
        Assert.assertEquals(service.remain(900), expected);
    }

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        Assert.assertEquals(service.remain(1000), expected);
    }

}