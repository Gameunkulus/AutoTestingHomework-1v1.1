package ru.netology.service;

import org.testng.Assert;


class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 100;
        Assert.assertEquals(service.remain(900), expected);
    }
}