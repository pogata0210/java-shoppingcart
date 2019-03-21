package com.lambdaschool.shoppingcart.service.impl;

import com.lambdaschool.shoppingcart.models.User;
import com.lambdaschool.shoppingcart.repo.UserRepo;
import com.lambdaschool.shoppingcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService
{

    @Autowired
    private UserRepo userRepo;

    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException
    {
        User user = userRepo.findByUsername(userId);
        if (user == null)
        {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getAuthority());
    }

    public List<User> findAll()
    {
        List<User> list = new ArrayList<>();
        userRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(long id)
    {
        userRepo.deleteById(id);
    }

    @Override
    public User save(User user)
    {
        return userRepo.save(user);
    }
}