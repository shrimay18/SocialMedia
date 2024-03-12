package com.shrimay.socialmedia.service;

import com.shrimay.socialmedia.models.User;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface UserService {
    public List<User> getAllUser();
    public User getUserById(long id);
}
