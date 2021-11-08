package ru.netology.domain;

public class CommentsText {
    private int commentCount;
    private String commentText;
    private int commentsLikeNumber;
    private String commetsImageUrl;
    private String commetsVideoUrl;
    private String commetsAudioUrl;
    private boolean letPostComment;
    private boolean groups_can_post;
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи.
}

// + get / set на всё
