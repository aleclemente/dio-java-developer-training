package me.dio.javadevelopertraining.exceptiontraining.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String message) {
        super(message);
    }
}
