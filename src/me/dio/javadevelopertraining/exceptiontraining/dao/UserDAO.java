package me.dio.javadevelopertraining.exceptiontraining.dao;

import me.dio.javadevelopertraining.exceptiontraining.exception.NoUserException;
import me.dio.javadevelopertraining.exceptiontraining.exception.UserNotFoundException;
import me.dio.javadevelopertraining.exceptiontraining.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        UserModel existingModel = findById(model.getId());
        models.remove(existingModel);
        models.add(model);
        return model;
    }

    public void deleteById(final long id) {
        UserModel existingModel = findById(id);
        models.remove(existingModel);
    }


    public UserModel findById(final long id) {
        var message = String.format("User with id '%s' not found", id);
        return models.stream()
                .filter(model -> model.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> findAll() {

        return models;
    }
}
