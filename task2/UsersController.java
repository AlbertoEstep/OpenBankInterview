package com.codility.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Map;

@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users/{username}/items/total")
    @ResponseBody
    public Map<String, Integer> totalItemsBought(@PathVariable String username) {
        int numberOfItems = usersService.getNumberOfItemsBought(username);
        return Collections.singletonMap("totalItemsBought", numberOfItems);
    }
}