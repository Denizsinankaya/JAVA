package com.javashop.webapps.inventory.service;

import com.javashop.webapps.inventory.domain.Item;
import com.javashop.webapps.inventory.domain.User;

import java.util.List;
import java.util.Map;



public interface UserService {
    User getUserById(long id);

    User getUserByUsername(String username);

    User addUser(User user);

    Iterable<User> getUsers();

    Map<String, List<Item>> numberOfItemsByType(long userId);

    List<String> getUsernames();
}
