package com.project.post.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.post.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>  {

}
