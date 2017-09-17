package com.lekcje.testy;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<String> friends;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void addFriend(String friend){
        if(!friends.contains(friend)){
            friends.add(friend);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }
}
