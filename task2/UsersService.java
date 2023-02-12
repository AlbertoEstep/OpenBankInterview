package com.codility.app;

import org.springframework.beans.factory.annotation.Autowired;
import com.codility.external.OrdersService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.codility.external.Item;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private OrdersService ordersService;

    public int getNumberOfItemsBought(String username) {
        List<Item> items = ordersService.itemsBought(username);
        return items.size();
    }
}