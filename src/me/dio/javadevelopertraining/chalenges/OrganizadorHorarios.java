package me.dio.javadevelopertraining.chalenges;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrganizadorHorarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de horarios
        int n = Integer.parseInt(sc.nextLine());

        // Usamos TreeSet para armazenar horarios unicos e ordenados automaticamente
        Set<String> horarios = new TreeSet<>();

        // TODO: leia cada horario e adicione ao conjunto
        for (int i = 0; i < n; i++) {
            // Exemplo de entrada: "12:00"
            String horario = sc.nextLine().trim();
            horarios.add(horario);
        }

        // TODO: Imprima os horarios unicos em ordem crescente:
        horarios.stream().sorted().forEach(System.out::println);


        // TODO: Imprima o total de horarios unicos:
        System.out.println("Total de horarios unicos: " + horarios.size());

        sc.close();
    }
}

