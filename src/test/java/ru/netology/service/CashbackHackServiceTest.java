package ru.netology.service;

import org.junit.Assert;

public class CashbackHackServiceTest {


    @org.junit.Test
    public void testRemainWitCashback() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 100;
        Assert.assertEquals(service.remain(900), expected);
    }

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        Assert.assertEquals(service.remain(1000), expected);
    }

}