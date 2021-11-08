package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private int createdby; // Идентификатор администратора, который опубликовал записm (для сообществ)
    private int date;
    private int replyOwnerId; // Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId;
    private boolean frendsOnly; //если запись была создана с опцией «Только для друзей».
    private int postNumber;
    private String postText;
    private String imageUrl;
    private String videoUrl;
    private String audioUrl;
    private Repost repost;
    private View view;
    private  CommentsText comment;
    private boolean letPost;
    private Copyright copyright;
    private Like like;
    private String type; // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private PostSource postSource; // Информация о способе размещения записи. Описание объекта находится на отдельной странице.
    private Geo geo;
    private int signerId; // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int copyHistory; // Массив, содержащий историю репостов для записи.
    private int canPin; // Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int canDelite;
    private int isPinned; // Информация о том, что запись закреплена.
    private int markedAsAds; // Информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite;
    private Donut donut;
    private int postonedId; // Идентификатор отложенной записи.
}

// + get / set на всё
