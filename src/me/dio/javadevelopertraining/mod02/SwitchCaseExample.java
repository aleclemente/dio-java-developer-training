package me.dio.javadevelopertraining.mod02;

import java.util.Scanner;

import static java.lang.String.format;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7 para o dia da semana:");
        int dia = terminal.nextInt();
        String diaDaSemana;
        String message = switch (dia) {
            case 1, 7 -> {
                var dayOfWeek = dia == 1 ? "Domingo" : "Sábado";
                yield format("Hoje é %s fim de semana", dayOfWeek);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Número inválido! Por favor, informe um número de 1 a 7.";
        };
        System.out.println(message);
    }
}
