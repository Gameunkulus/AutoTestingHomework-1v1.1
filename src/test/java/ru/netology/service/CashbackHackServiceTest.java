package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    @Test
    public void testRemainWitCashback() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected = 100;
        Assertions.assertEquals(service.remain(900), expected);
    }

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        Assertions.assertEquals(service.remain(1000), expected);
    }

}