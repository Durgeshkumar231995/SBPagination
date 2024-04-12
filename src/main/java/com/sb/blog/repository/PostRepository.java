package com.sb.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
