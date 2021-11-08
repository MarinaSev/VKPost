package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {

    private Post[] post = new Post[0];

    public void deliteByOwnerId (int ownerId) {
        //какой-то код
    }

    public void deliteByPostId (int postId) {
        //какой-то код
    }

    public Post[] searchByOwnerId (int ownerId) {
        //какой-то код
        return null;
    }

    public Post[] searchByOwnersOnly (boolean isOwner) {
        //какой-то код
        return null;
    }

    public Post[] getPosts (int postsCountNumber) {
        //какой-то код
        return null;
    }

    public Post[] searchByQuery (String query) {
        ////какой-то код возвращает посты, соответствующие запросу
        return null;
    }

    public Post[] searchByDomain (String domain) {
        //какой-то код вщзвращает посты по имени пользователя
        return null;
    }

    public Post[] offset (int offset) {
        //какой-то код что-то смещает
        return null;
    }

}
