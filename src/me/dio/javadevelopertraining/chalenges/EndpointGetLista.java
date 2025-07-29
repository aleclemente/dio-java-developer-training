package me.dio.javadevelopertraining.chalenges;

import java.util.*;

public class EndpointGetLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia a linha com os nomes separados por espaço:
        String linha = sc.nextLine().trim();

        // TODO: Divida os nomes em um array:
        List<String> nomes = new ArrayList<>();
        nomes = Arrays.asList(linha.split(" "));

        // TODO: Ordene os nomes alfabeticamente:
        Collections.sort(nomes);

        // TODO: Use o StringBuilder para construir a saída no formato JSON simples:
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // TODO: Itere e adicione aspas e vírgulas entre os nomes:
        for (int i = 0; i < nomes.size(); i++) {
            sb.append("\"").append(nomes.get(i)).append("\"");
            if (i < nomes.size() - 1) {
                sb.append(", ");
            }
        }
        // Exemplo de saída: ["Ana", "João", "Maria"]

        sb.append("]");

        // Imprime a lista formatada
        System.out.println(sb.toString());

        sc.close();
    }
}