package com.shrimay.socialmedia.service;

import com.shrimay.socialmedia.dtos.JSONPlaceholderDTO;
import com.shrimay.socialmedia.models.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Service
public class JSONplaceholderUserService implements UserService{
    RestTemplate restTemplate = new RestTemplate(); //helps to consume talking to api

    @Override
    public List<User> getAllUser() {
        JSONPlaceholderDTO[] users = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/users",
                JSONPlaceholderDTO[].class);
        if(users != null){
            List<User> userList = new ArrayList<>();
            for(JSONPlaceholderDTO dto: users){
                User user = new User();
                user.setId(dto.getId());
                user.setName(dto.getName());
                user.setUsername(dto.getUsername());
                user.setEmail(dto.getEmail());
                userList.add(user);
            }
            return userList;
        }
        return null;
    }
    public User getUserById(long id){
        JSONPlaceholderDTO user = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/users/"+id,
                JSONPlaceholderDTO.class);
        if(user != null){
            User user1 = new User();
            user1.setId(user.getId());
            user1.setName(user.getName());
            user1.setUsername(user.getUsername());
            user1.setEmail(user.getEmail());
            return user1;
        }
        return null;
    }
}
