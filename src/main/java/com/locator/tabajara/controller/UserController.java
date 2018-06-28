package com.locator.tabajara.controller;

import com.locator.tabajara.Service.UserService;
import com.locator.tabajara.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> index() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User show(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @PatchMapping("/{id}")
    public User update(@PathVariable("id") Long id, @RequestBody Map<String, String> changes) {
        User user = service.getById(id);
        return service.update(user, changes);
    }

    @DeleteMapping("/{id}")
    public User delete(@PathVariable("id") Long id) {
        User user = service.getById(id);
        service.delete(user);
        return user;
    }
}
