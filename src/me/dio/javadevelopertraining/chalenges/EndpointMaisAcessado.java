package me.dio.javadevelopertraining.chalenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EndpointMaisAcessado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a linha com os endpoints separados por espaço
        String linha = sc.nextLine().trim();

        // TODO: Divida em array:
        String[] endpoints = linha.split(" ");

        // TODO: Crie um mapa para contar frequência:
        Map<String, Integer> frequencia = new HashMap<>();

        // TODO: Contabilize a frequência mantendo ordem de entrada:
        String maisAcessado = null;
        int maxFrequencia = 0;
        for (String endpoint : endpoints) {
            // Incrementa a contagem no mapa
            frequencia.put(endpoint, frequencia.getOrDefault(endpoint, 0) + 1);

            // Verifica se é o mais acessado
            if (frequencia.get(endpoint) > maxFrequencia) {
                maxFrequencia = frequencia.get(endpoint);
                maisAcessado = endpoint;
            }
        }

        // TODO: Encontre o endpoint com maior frequência:


        // Imprime o endpoint mais acessado
        System.out.println(maisAcessado);

        sc.close();
    }
}