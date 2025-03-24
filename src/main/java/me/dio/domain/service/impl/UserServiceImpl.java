package me.dio.domain.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepo;
import me.dio.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    /**
     * @param userRepo
     */
    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElseThrow(NoSuchElementException::new);
    }

    /**
     * @param userToCreate
     * @return
     */
    @Override
    public User create(User userToCreate) {
        if(userRepo.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepo.save(userToCreate);
    }
}
