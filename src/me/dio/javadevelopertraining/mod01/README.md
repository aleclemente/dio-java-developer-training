# Projeto ContaBanco

Este projeto faz parte do **primeiro módulo, chamado Fundamentos da Plataforma Java**, do curso de **Formação Java Developer** da plataforma de ensino DIO (Digital Innovation One).

Este projeto é um exercício prático de Java para treinar a sintaxe básica, entrada de dados via terminal e manipulação de strings. O objetivo é simular a criação de uma conta bancária a partir de dados fornecidos pelo usuário.

## Funcionalidades
- Solicita ao usuário, via terminal, os seguintes dados:
  - Número da conta (inteiro)
  - Agência (texto)
  - Nome do cliente (texto)
  - Saldo (decimal)
- Exibe uma mensagem personalizada com os dados informados.

## Estrutura do Projeto
```
src/
  me/dio/javadevelopertraining/mod01/ContaTerminal.java
```

## Como Executar
1. Compile o projeto:
   ```sh
   javac src/me/dio/javadevelopertraining/mod01/ContaTerminal.java
   ```
2. Execute o programa:
   ```sh
   java -cp src me.dio.javadevelopertraining.mod01.ContaTerminal
   ```
3. Siga as instruções no terminal para inserir os dados.

## Testes
Se desejar criar testes automatizados, recomenda-se utilizar JUnit e organizar os arquivos de teste em uma pasta separada (`test/`).

## Exemplo de Uso
```
Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite o nome do Cliente:
MARIO ANDRADE
Por favor, digite o saldo:
237.48
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

---

Projeto para fins educacionais.
