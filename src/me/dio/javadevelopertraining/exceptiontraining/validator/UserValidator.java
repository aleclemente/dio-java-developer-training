package me.dio.javadevelopertraining.exceptiontraining.validator;

import me.dio.javadevelopertraining.exceptiontraining.exception.ValidatorException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UserValidator {

    public UserValidator() {
    }

    public static void validateName(final String name) throws ValidatorException {
        if (name == null || name.isBlank()) throw new ValidatorException("Name cannot be null or blank");
    }

    public static void validateEmail(final String email) throws ValidatorException  {
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new ValidatorException("Email must be a valid email address");
        }
    }

    public static void validateBirthDate(final String birthDate) throws ValidatorException {
        if (birthDate == null || birthDate.isBlank()) {
            throw new ValidatorException("Birth date cannot be null or blank");
        }
        try {
            // Assuming the date format is "dd/MM/yyyy"
            LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            throw new ValidatorException("Birth date must be in the format dd/MM/yyyy");
        }
    }
}
