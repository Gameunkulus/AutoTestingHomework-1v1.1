package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void remainTest() {
        CashbackHackService service = new CashbackHackService();
        //проверка при обычном числе
        int expected1 = 990;
        Assert.assertEquals(expected1, service.remain(10));
        //проверка при отрицательном числе
        int expected2 = 1010;
        Assert.assertEquals(expected2, service.remain(-10));
        //проверка при нулевом числе
        int expected3 = 1000;
        Assert.assertEquals(expected3, service.remain(0));
    }
    @org.junit.jupiter.api.Test
    public void remainJupiterTest() {
        CashbackHackService service = new CashbackHackService();
        //проверка при обычном числе
        int expected1 = 990;
        Assertions.assertEquals(expected1, service.remain(10));
        //проверка при отрицательном числе
        int expected2 = 1010;
        Assertions.assertEquals(expected2, service.remain(-10));
        //проверка при нулевом числе
        int expected3 = 1000;
        Assertions.assertEquals(expected3, service.remain(0));
    }

}