package com.example.firebaseinstagramclone.model;

public class Post {
    public String email;
    public String comment;
    public String image;

    public Post(String email,String comment,String image){
        this.comment=comment;
        this.email=email;
        this.image=image;
    }
}
