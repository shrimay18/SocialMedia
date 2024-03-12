package com.shrimay.socialmedia.service;

import com.shrimay.socialmedia.dtos.JSONPlaceholderDTO;
import com.shrimay.socialmedia.dtos.JSONPlaceholderPostDtos;
import com.shrimay.socialmedia.models.Posts;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class JSONPlaceholderPostService implements Postinterface{
    RestTemplate restTemplate = new RestTemplate(); //helps to consume talking to api

    @Override
    public List<Posts> getAllPost() {
        JSONPlaceholderPostDtos[] posts = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/posts",
                JSONPlaceholderPostDtos[].class);
        if(posts != null){
            List<Posts> postList = new ArrayList<>();
            for(JSONPlaceholderPostDtos dto: posts){
                Posts post = new Posts();
                post.setUserId(dto.getUserId());
                post.setId(dto.getId());
                post.setTitle(dto.getTitle());
                post.setBody(dto.getBody());
                postList.add(post);
            }
            return postList;
        }
        return null;
    }
    public Posts getPostById(long id){
        JSONPlaceholderPostDtos post = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/posts/"+id,
                JSONPlaceholderPostDtos.class);
        if(post != null){
            Posts posts = new Posts();
            posts.setUserId(posts.getUserId());
            posts.setId(post.getId());
            posts.setTitle(posts.getTitle());
            posts.setBody(posts.getBody());
            return posts;
        }
        return null;
    }
}
