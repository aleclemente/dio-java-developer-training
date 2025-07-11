package me.dio.javadevelopertraining.exceptiontraining.exception;

public class NoUserException extends RuntimeException {
    public NoUserException(final String message) {
        super(message);
    }
}
