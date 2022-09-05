package com.javashop.webapps.inventory.repository;

import com.javashop.webapps.inventory.domain.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
