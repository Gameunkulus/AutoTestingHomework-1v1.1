package ru.netology.service;

import org.junit.Assert;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void remainTest() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 100;
        Assert.assertEquals(service.remain(900), expected);
    }

}