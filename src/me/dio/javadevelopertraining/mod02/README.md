# Módulo 02: Controle de Fluxo - Desafio da DIO

Este módulo contém o exercício proposto pela DIO para praticar Controle de Fluxo em Java, codificando o seguinte cenário:

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros. Com estes dois números, você deverá obter a quantidade de interações (for) e realizar a impressão no console (`System.out.print`) dos números incrementados.

**Exemplo:**

Se você passar os números 12 e 30, teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

Se o primeiro parâmetro for **MAIOR** que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a seguinte mensagem: **"O segundo parâmetro deve ser maior que o primeiro"**.

## Arquivos
- `Contador.java`: Classe principal que executa o programa.
- `ParametrosInvalidosException.java`: Exceção personalizada lançada quando o segundo parâmetro não é maior que o primeiro.

## Como executar
1. Compile os arquivos Java:
   ```sh
   javac Contador.java ParametrosInvalidosException.java
   ```
2. Execute o programa:
   ```sh
   java Contador
   ```

## Funcionamento
O programa solicita dois números inteiros. Se o segundo número for maior que o primeiro, ele imprime a contagem do primeiro até o segundo. Caso contrário, lança uma exceção informando que o segundo parâmetro deve ser maior.
