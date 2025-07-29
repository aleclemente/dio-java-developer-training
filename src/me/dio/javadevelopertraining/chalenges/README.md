# Desafio 03: Organizador de Horários para Reuniões

## Descrição
Você deve criar um programa que recebe uma lista de horários de reuniões agendadas durante o dia, cada uma representada por uma string no formato "HH:mm". 
Seu programa deve identificar e listar os horários únicos, ordenados do mais cedo ao mais tarde, ignorando horários repetidos.

Além disso, imprima quantos horários únicos foram informados.

## Entrada

A primeira linha contém um número N, representando a quantidade de horários. Nas próximas N linhas, cada linha contém um horário no formato "HH:mm".

Um número inteiro N (quantidade de horários).
N linhas contendo um horário no formato "HH:mm".

## Saída

Imprima os horários únicos ordenados, um por linha, e ao final uma linha com:
Total de horarios unicos: X, onde X é a quantidade de horários únicos.

Atenção: Os "horarios unicos" são os horários diferentes, ou seja, cada horário aparece uma única vez na listagem, 
mesmo que tenham sido informados múltiplas vezes na entrada. Dessa forma, a saída apresenta os horários distintos 
organizados do mais cedo ao mais tarde, eliminando duplicatas da entrada.

**Exemplo:**
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


## Exemplo
**Entrada**
3
15:00
12:00
15:00

**Saída**
12:00
15:00
Total de horarios unicos: 2

---

# Desafio 04: Gerenciamento de Lista de Tarefas

## Descrição
Você deve criar um programa que receba uma lista de tarefas a serem feitas durante o dia. Cada tarefa possui um nome e 
uma prioridade (número inteiro). Ordene as tarefas pela prioridade crescente e imprima a lista organizada.

## Entrada

A entrada receberá um número N, representando a quantidade de tarefas, seguido de N linhas, cada uma contendo o nome da tarefa e a prioridade separados por vírgula.

Um número inteiro N (quantidade de tarefas).
N linhas contendo "nome da tarefa,prioridade".

## Saída

Deverá retornar a lista de tarefas ordenada pela prioridade em ordem crescente, uma por linha, no formato: tarefa - prioridade.

## Exemplo
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

**Entrada 1**
3
Estudar Java, 1
Reuniao Tech, 3
Pausa Cafe, 2

**Saída 1**
Estudar Java - 1
Pausa Cafe - 2
Reuniao Tech - 3


**Entrada 2**
4
Enviar Emails, 2
Almoco, 3
Validar Codigos,1
Exercicios, 4

**Saída 2**
Validar Codigos - 1
Enviar Emails - 2
Almoco - 3
Exercicios - 4

---

# Desafio 05: simulacao de Endpoint GET

## Descrição
Simule um endpoint que recebe uma lista de nomes e retorna a lista ordenada alfabeticamente, formatada como um array JSON simples.

## Entrada

Uma linha com nomes separados por espaço.

    Uma linha contendo nomes separados por espaço.

## Saída

Os nomes ordenados alfabeticamente, formatados como uma lista JSON, ou seja, entre colchetes [] e cada nome entre aspas duplas, separados por vírgulas e espaços.

## Exemplo
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

**Entrada 1**
Carlos Ana Beatriz

**Saída 1**
["Ana", "Beatriz", "Carlos"]


**Entrada 2**
Maria Joao Pedro

**Saída 2**
["Joao", "Maria", "Pedro"]

---

# Desafio 06: Contagem de Requisições por Endpoint

## Descrição
Receba uma lista de strings representando endpoints acessados e retorne o endpoint mais acessado. Se houver empate, retorne o que apareceu primeiro na lista.

## Entrada

Uma linha com nomes de endpoints separados por espaço.

    Uma linha contendo os nomes dos endpoints separados por espaço.

## Saída

O nome do endpoint mais acessado.

## Exemplo
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

**Entrada 1**
/login /home /login /profile

**Saída 1**
/login


**Entrada 2**
/api /api /home /api

**Saída 2**
/api