package com.lekcje.testy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.Arrays;
import java.util.List;

public class FriendshipsTest {

    private Friendships friendships;

    @BeforeClass
    public static void beforeClass(){

    }

    @Before
    public void before(){
        friendships = new Friendships();
        friendships.makeFriends("Jan", "Michal");
        friendships.makeFriends("Jan","Marcin");


    }

    @Test
    public void krzysztofDoesNotHaveFriends(){
        Assert.assertTrue("Krzysztof does not have friends",
                friendships.getFriendsList("Krzyszof").isEmpty());
    }

    @Test
    public void janHasSevenFriends(){

        Assert.assertEquals("Jan has seven friends",
                7, friendships.getFriendsList("Jan").size());
    }

    @Test
    public void compareTwoFriendsList(){
        List<String> friendsOfJan = Arrays.asList("Michal","Marcin");
        Assert.assertTrue("Both Lists are the same",
                friendships.getFriendsList("Jan").containsAll(friendsOfJan));

        assertThat(friendships.getFriendsList("Jan"),
                containsInAnyOrder("Michal", "Marcin"));

    }


}
