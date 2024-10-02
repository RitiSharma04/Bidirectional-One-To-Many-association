package com.example.serviceImpl;

import com.example.entity.Blog;
import com.example.repository.BlogRepository;
import com.example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;

    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog getBlogById(int id) {
        Optional<Blog> optionalBlog = blogRepository.findById(id);
        return optionalBlog.orElse(null);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> getBlogsByCategory(String category) {
        return blogRepository.findByCategory(category);
    }

    @Override
    public void deleteBlog(int id) {
        blogRepository.deleteById(id);
    }
}
