package ru.netology.domain;

public class Like {
    private int count;
    private int userLikes; //наличие отметки «Мне нравится» от текущего пользователя
    private int canLike; //информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может)
    private int canPublish;
}

// + get / set на всё
