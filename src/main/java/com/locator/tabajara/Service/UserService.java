package com.locator.tabajara.Service;

import com.locator.tabajara.model.User;
import com.locator.tabajara.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> getAll() {
        return StreamSupport
                .stream(repo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public User getById(Long id) {
        return repo.findById(id).get();
    }

    public User create(User user) {
        return repo.save(user);
    }

    public User update(User user, Map<String, String> changes) {
        if(changes.containsKey("name")) { user.setName(changes.get("name")); }
        if(changes.containsKey("age")) { user.setAge(Integer.parseInt(changes.get("age"))); }

        return repo.save(user);
    }

    public void delete(User user) {
        repo.delete(user);
    }
}
