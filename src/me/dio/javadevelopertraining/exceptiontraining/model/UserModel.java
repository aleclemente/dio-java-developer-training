package me.dio.javadevelopertraining.exceptiontraining.model;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class UserModel {
    private long id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public UserModel() {
    }

    public UserModel(long id, String name, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id) &&
                Objects.equals(name, userModel.name) &&
                Objects.equals(email, userModel.email) &&
                Objects.equals(birthDate, userModel.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, birthDate);
    }

    @Override
    public String toString() {

        var formattedBirthDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate.format(formattedBirthDate) +
                '}';
    }
}
