package com.lekcje.testy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void testGetFriends() throws Exception{
        Person person = new Person("Marcin");
        assertThat(person.getFriends()).isEmpty();
    }

    @Test
    public void testAddFriend() throws Exception{
        Person person = new Person("Marcin");
        person.addFriend("Marcel");
        person.addFriend("Janek");
        assertThat(person.getFriends()).hasSize(2);
    }

    @Test
    public void testAddSecondFriend() throws Exception{
        Person person = new Person("Marcin");
        person.addFriend("Michał");
        assertThat(person.getFriends()).containsExactly("Michał");
    }

    @AfterClass
    public static void afterClass(){

    }

    @After
    public void after(){

    }
}