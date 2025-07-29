package me.dio.javadevelopertraining.chalenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FiltroCandidatosPorHabilidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a primeira linha: número de candidatos e habilidade buscada
        String[] primeiraLinha = scanner.nextLine().split(",");
        int n = Integer.parseInt(primeiraLinha[0].trim());
        String habilidadeBuscada = primeiraLinha[1].trim().toLowerCase();

        List<String> candidatosComHabilidade = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine().trim();
            // Separar nome e habilidades
            String[] partes = linha.split("-", 2);
            String nome = partes[0].trim();
            String habilidades = partes.length > 1 ? partes[1].trim() : "";

            // TODO: Divida as habilidades e verifique se alguma bate com a buscada
            String[] habilidadesDoCandidato = habilidades.toLowerCase().split(",");

            boolean temHabilidade = Arrays.stream(habilidadesDoCandidato)
                    .anyMatch(habilidade -> habilidade.trim().equalsIgnoreCase(habilidadeBuscada));

            if (temHabilidade) {
                candidatosComHabilidade.add(nome);
            }

        }

        if (candidatosComHabilidade.isEmpty()) {
            System.out.println("Nenhum candidato encontrado");
        } else {
            for (String candidato : candidatosComHabilidade) {
                System.out.println(candidato);
            }
        }

        scanner.close();
    }
}
