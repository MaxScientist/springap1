package com.max.course;


import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music {
    public String getString() {
        return "Wind cries Mary";
    }
}
