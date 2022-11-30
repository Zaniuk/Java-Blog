package com.example.demo.dao;

import com.example.demo.models.Post;

import java.util.List;

public interface PostsDao {
    List<Post> getAllPosts();
    Post getPostById(String id);
    void addPost(Post post);
    void updatePost(Post post);
    void deletePost(String id);
}
