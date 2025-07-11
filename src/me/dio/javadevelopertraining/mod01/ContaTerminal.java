package me.dio.javadevelopertraining.mod01;

import java.util.Scanner;

public class ContaTerminal {

    public static String gerarMensagem(String nomeCliente, String agencia, int numero, double saldo) {
        return "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        String mensagem = gerarMensagem(nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);
        scanner.close();
    }
}

