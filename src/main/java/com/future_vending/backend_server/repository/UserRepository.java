package com.future_vending.backend_server.repository;

import com.future_vending.backend_server.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(String username);
}
