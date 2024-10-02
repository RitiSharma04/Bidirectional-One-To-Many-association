package com.example.service;

import com.example.entity.Blog;

import java.util.List;

public interface BlogService {

    Blog saveBlog(Blog blog);

    Blog getBlogById(int id);

    List<Blog> getAllBlogs();

    List<Blog> getBlogsByCategory(String category);

    void deleteBlog(int id);
}
