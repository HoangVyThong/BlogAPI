package com.example.blogapi.service;

import com.example.blogapi.model.Role;

public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);
}
