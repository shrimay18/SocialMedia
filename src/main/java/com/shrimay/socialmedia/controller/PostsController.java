package com.shrimay.socialmedia.controller;

import com.shrimay.socialmedia.models.Posts;
import com.shrimay.socialmedia.service.Postinterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {
    Postinterface postinterface;
    public PostsController(Postinterface postinterface) {
        this.postinterface = postinterface;
    }
    @GetMapping("/posts")
    public List<Posts> getAllPosts(){
        return postinterface.getAllPost();
    }

    @GetMapping("/posts/{id}")
    public Posts getPostById(@PathVariable("id") long id){
        return postinterface.getPostById(id);
    }



}
