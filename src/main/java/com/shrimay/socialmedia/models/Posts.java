package com.shrimay.socialmedia.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Posts {
    public long userId;
    public long id;
    public String title;
    public String body;
}
