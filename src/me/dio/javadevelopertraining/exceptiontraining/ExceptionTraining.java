package me.dio.javadevelopertraining.exceptiontraining;

import me.dio.javadevelopertraining.exceptiontraining.dao.UserDAO;
import me.dio.javadevelopertraining.exceptiontraining.model.UserModel;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
                    var userToSave = requestToSaveUser();
                    userDAO.save(userToSave);
                    System.out.printf("Usuário %s cadastrado com sucesso!\n", userToSave.getName());
                    break;
                case 2:
                    System.out.println("\n2 - Opção de atualização selecionada.");
                    var userToUpdate = requestToUpdateUser();
                    userDAO.update(userToUpdate);
                    System.out.printf("Usuário %s atualizado com sucesso!\n", userToUpdate.getName());
                    break;
                case 3:
                    System.out.println("\n3 - Opção de exclusão selecionada.");
                    var userIdToDelete = requestUserId();
                    userDAO.deleteById(userIdToDelete);
                    System.out.printf("Usuário %s deletado com sucesso!\n", userIdToDelete);
                    break;
                case 4:
                    System.out.println("\n4 - Opção de busca por id selecionada.");
                    var userIdToFind = requestUserId();
                    UserModel userFound = userDAO.findById(userIdToFind);
                    System.out.printf("Usuário %s encontrado com sucesso!\n", userFound.toString());
                    break;
                case 5:
                    System.out.println("\n5 - Opção de listagem selecionada.");
                    var users = userDAO.findAll();
                    if (users.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        System.out.println("====Usuários cadastrados====");
                        users.forEach(System.out::println);
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

    private static UserModel requestToSaveUser() {
        System.out.println("Digite o nome do usuário:");
        String name = scanner.next();
        System.out.println("Digite o email do usuário:");
        String email = scanner.next();
        System.out.println("Digite a data de nascimento do usuário (formato: dd/MM/yyyy):");
        String birthDateInput = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var localDate = java.time.LocalDate.parse(birthDateInput, formatter);
        OffsetDateTime birthDate = localDate.atStartOfDay(java.time.ZoneId.systemDefault()).toOffsetDateTime();
        return new UserModel(0, name, email, birthDate);
    }

    private static UserModel requestToUpdateUser() {
        System.out.println("Digite o id do usuário a ser atualizado:");
        long id = scanner.nextLong();
        System.out.println("Digite o novo nome do usuário:");
        String name = scanner.next();
        System.out.println("Digite o novo email do usuário:");
        String email = scanner.next();
        System.out.println("Digite a nova data de nascimento do usuário (formato: dd/MM/yyyy):");
        String birthDateInput = scanner.next();
        var formattedBirthDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var localDate = java.time.LocalDate.parse(birthDateInput, formattedBirthDate);
        OffsetDateTime birthDate = localDate.atStartOfDay(java.time.ZoneId.systemDefault()).toOffsetDateTime();
        return new UserModel(id, name, email, birthDate);
    }
}
