package com.lekcje.testy;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FriendsshipsTestHamcrest {

    private Friendships friendships;

    @Before
    public void before(){
        friendships = new Friendships();
        friendships.makeFriends("Jan", "Michal");
        friendships.makeFriends("Jan","Marcin");
    }

    @Test
    public void krzysztofDoesNotHaveFriend(){
        assertThat(friendships.getFriendsList("Krzysztof"),empty());
    }

    @Test
    public void janHasTwoFriends(){
        assertThat(friendships.getFriendsList("Jan"), hasSize(2));
    }

    @Test
    public void compareTwoList(){
        assertThat(friendships.getFriendsList("Jan"),
                containsInAnyOrder("Michal", "Marcin"));
    }
}
