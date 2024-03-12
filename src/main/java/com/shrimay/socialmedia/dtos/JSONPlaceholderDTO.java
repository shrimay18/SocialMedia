package com.shrimay.socialmedia.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JSONPlaceholderDTO {
    public long id;
    public String name;
    public String username;
    public String email;
    public Adress address;
    public String phone;
    public String website;
    public Company company;

}
