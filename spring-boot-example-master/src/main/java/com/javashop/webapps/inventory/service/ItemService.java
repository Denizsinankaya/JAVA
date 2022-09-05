package com.javashop.webapps.inventory.service;

import com.javashop.webapps.inventory.domain.ItemAddForm;
import com.javashop.webapps.inventory.domain.Item;


public interface ItemService {
    Item getItemById(long id);

    void addItem(ItemAddForm form);

    Iterable<Item> getItems();

    Item assignItem(String username, long itemId);

    void deleteItemById(long id);
}
