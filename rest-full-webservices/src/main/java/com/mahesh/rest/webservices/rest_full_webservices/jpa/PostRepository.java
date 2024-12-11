package com.mahesh.rest.webservices.rest_full_webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.rest.webservices.rest_full_webservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
