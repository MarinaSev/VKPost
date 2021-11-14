package ru.netology.domain;

public class Like {
    private int count;
    private boolean userLikes; //наличие отметки «Мне нравится» от текущего пользователя
    private boolean canLike; //информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может)
    private boolean canPublish;
}

// + get / set на всё
