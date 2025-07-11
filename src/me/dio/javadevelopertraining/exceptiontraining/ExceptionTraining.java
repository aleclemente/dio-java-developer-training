package me.dio.javadevelopertraining.exceptiontraining;

import me.dio.javadevelopertraining.exceptiontraining.dao.UserDAO;
import me.dio.javadevelopertraining.exceptiontraining.exception.NoUserException;
import me.dio.javadevelopertraining.exceptiontraining.exception.UserNotFoundException;
import me.dio.javadevelopertraining.exceptiontraining.exception.ValidatorException;
import me.dio.javadevelopertraining.exceptiontraining.model.UserModel;
import me.dio.javadevelopertraining.exceptiontraining.validator.UserValidator;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static me.dio.javadevelopertraining.exceptiontraining.validator.UserValidator.validateBirthDate;
import static me.dio.javadevelopertraining.exceptiontraining.validator.UserValidator.validateEmail;
import static me.dio.javadevelopertraining.exceptiontraining.validator.UserValidator.validateName;

public class ExceptionTraining {

    private final static Scanner scanner = new Scanner(System.in);

    private final static UserDAO userDAO = new UserDAO();

    public static void main(String[] args) {
        System.out.println("\nBem vindo ao cadastro de usuários, seleciona a opcao desejada:");
        optionMenu();

        var optionMenu = scanner.nextInt();

        while (optionMenu != 6) {
            switch (optionMenu) {
                case 1:
                    System.out.println("\n1 - Opção de cadastro selecionada.");
                    UserModel userToSave = null;
                    try {
                        userToSave = requestToSaveUser();
                        userDAO.save(userToSave);
                        System.out.printf("Usuário %s cadastrado com sucesso!\n", userToSave.getName());
                    } catch (ValidatorException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("\n2 - Opção de atualização selecionada.");
                    UserModel userToUpdate = null;
                    try {
                        userToUpdate = requestToUpdateUser();
                        userDAO.update(userToUpdate);
                        System.out.printf("Usuário %s atualizado com sucesso!\n", userToUpdate.getName());
                    } catch (ValidatorException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("\n3 - Opção de exclusão selecionada.");
                        var userIdToDelete = requestUserId();
                        userDAO.deleteById(userIdToDelete);
                        System.out.printf("Usuário %s deletado com sucesso!\n", userIdToDelete);
                    } catch (UserNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("============================");
                    }
                    break;
                case 4:
                    System.out.println("\n4 - Opção de busca por id selecionada.");
                    try {
                        var userIdToFind = requestUserId();
                        UserModel userFound = userDAO.findById(userIdToFind);
                        System.out.printf("Usuário %s encontrado com sucesso!\n", userFound.toString());
                    } catch (UserNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("============================");
                    }
                    break;
                case 5:
                    System.out.println("\n5 - Opção de listagem selecionada.");
                    try {
                        var users = userDAO.findAll();
                        System.out.println("====Usuários cadastrados====");
                        users.forEach(System.out::println);
                    } catch (NoUserException ex) {
                        System.out.println(ex.getMessage());
                    }finally {
                        System.out.println("============================");
                    }
                    break;
                case 6:
                    System.out.println("S\n6 - aindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }

            System.out.println("\n=========INICIO===============");
            System.out.println("Selecione uma nova opção:");
            optionMenu();
            optionMenu = scanner.nextInt();
        }


    }

    private static void optionMenu() {
        System.out.println("1 - Cadatrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Buscar por id");
        System.out.println("5 - listar");
        System.out.println("6 - Sair");
    }

    private static long requestUserId() {
        System.out.println("Digite o id do usuário:");
        long id = scanner.nextLong();
        return id;
    }

    private static UserModel requestToSaveUser() throws ValidatorException {
        System.out.println("Digite o nome do usuário:");
        String name = scanner.next();
        validateName(name);
        System.out.println("Digite o email do usuário:");
        String email = scanner.next();
        validateEmail(email);
        System.out.println("Digite a data de nascimento do usuário (formato: dd/MM/yyyy):");
        String birthDateString = scanner.next();
        validateBirthDate(birthDateString);
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthDate = LocalDate.parse(birthDateString, formatter);
        return new UserModel(0, name, email, birthDate);
    }

    private static UserModel requestToUpdateUser() throws ValidatorException {
        System.out.println("Digite o id do usuário a ser atualizado:");
        long id = scanner.nextLong();
        var user = requestToSaveUser();
        return new UserModel(id, user.getName(), user.getEmail(), user.getBirthDate());
    }
}
