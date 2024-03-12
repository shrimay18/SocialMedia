package com.shrimay.socialmedia.service;

import com.shrimay.socialmedia.models.Posts;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface Postinterface {
    public List<Posts> getAllPost();
    public Posts getPostById(long id);
}
