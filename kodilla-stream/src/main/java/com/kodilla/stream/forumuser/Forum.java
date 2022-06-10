package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "Maria", 'F', "1999-11-02", 565));
        forumUsers.add(new ForumUser(2, "Sylwek", 'M', "2000-02-13", 1243));
        forumUsers.add(new ForumUser(3, "Mariusz", 'M', "2010-04-08", 91));
        forumUsers.add(new ForumUser(4, "Daria", 'F', "1992-11-02", 321));
        forumUsers.add(new ForumUser(5, "Edward", 'M', "1986-12-05", 123));
        forumUsers.add(new ForumUser(6, "Adam", 'M', "1986-12-05", 0));
    }

    public List<ForumUser> getForumUsers() {
        return forumUsers;
    }
}
