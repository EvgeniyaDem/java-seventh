package ru.netology.services;

public class PlansService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - ((money - expenses) / 3) * 2;
                //System.out.println(money); проверила по месяцам
            } else {
                money = money + income - expenses;
                //System.out.println(money); проверила по месяцам
            }
        }
        return count;
    }
}
