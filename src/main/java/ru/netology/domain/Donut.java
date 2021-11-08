package ru.netology.domain;

public class Donut {
    private boolean isDonut; // запись доступна только платным подписчикам VK Donut
    private int paidDuration;
    private Placeholder placeholder; // заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
    private boolean canPublishFreeCopy;
    private String editMode;
}
