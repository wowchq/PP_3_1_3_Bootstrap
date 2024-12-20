package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import javax.naming.AuthenticationException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Set;

public interface UserService {

    List<User> getAll();

    void add(User user);

    void update(User user, Set<Role> roles);

    User getUserById(Long id);

    void delete(long id);

    User findById(Long id);

    User findByUsername(String username);

    void saveUser(User user, Set<Role> roles);

}
