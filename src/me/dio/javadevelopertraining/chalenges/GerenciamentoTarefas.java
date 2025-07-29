package me.dio.javadevelopertraining.chalenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciamentoTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o número de tarefas
        int n = Integer.parseInt(sc.nextLine());

        // TODO: Crie uma lista para armazenar as tarefas como pares (nome, prioridade):
        Map<String, Integer> tarefas = new HashMap<>();

        // TODO: Leia cada linha, separada por nome e prioridade e adiciona à lista:

        for (int i = 0; i < n; i++) {
            // Exemplo de entrada: "12:00"
            String tarefa = sc.nextLine().trim();
            String nomeTarefa = tarefa.split(",")[0].trim();
            Integer prioridadeTarefa = Integer.parseInt(tarefa.split(",")[1].trim());
            tarefas.put(nomeTarefa, prioridadeTarefa);
        }


        // TODO: Ordene a lista pela prioridade crescente:
        tarefas.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .forEachOrdered(entry -> {
                // Imprime cada tarefa no formato "tarefa - prioridade"
                System.out.println(entry.getKey() + " - " + entry.getValue());
            });

        sc.close();
    }
}

