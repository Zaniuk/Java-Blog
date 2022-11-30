package com.example.demo.controllers;

import com.example.demo.dao.PostsDao;
import com.example.demo.models.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class PostController {
    private final PostsDao postsDao;

    public PostController(PostsDao postsDao) {
        this.postsDao = postsDao;
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Post> getAllPosts() {
        return postsDao.getAllPosts();
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public Post getPostById(@PathVariable String id) {
        return postsDao.getPostById(id);
    }
}
