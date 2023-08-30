# PjBL1-FloodFill 

<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">

<div align="center">

 <br>
     Este é o primeiro projeto da matéria Resolução de Problemas Estruturados em Computação, realizado pela equipe 9, compostos por: <br><br>
     Bruno Crema 👨🏼‍💻 <br>
     João Elias Fadel 👨🏻‍💻 <br>
     João Victor Ferreira 👨🏽‍💻 <br>
     Lohine Mussi 👩🏻‍💻 
     
## FloodFill
<br> 

![image](https://github.com/BES-Noite/PjBL1-FloodFill/assets/91105011/64d5db3c-e065-487d-a5d4-98a864afa66e)



Flood Fill (ou preenchimento de inundação) é um algoritmo que tem como objetivo alterar a
informação de nós (nodes) que estão conectados. Esse algoritmo é utilizado na ferramenta “balde”
de softwares de desenho (como paint) e pode ser utilizado também em jogos como Go e Campo
Minado para determinar quais posições serão limpas.
A proposta desta atividade é a implementação do algoritmo Flood Fill de forma simplificada,
utilizando Pilha e Fila para armazenamento dos pixels. 

## Algoritmo FloodFill
Este repositório contém uma implementação do algoritmo Flood Fill usando três classes e duas interfaces. As três classes são:

* Pixel: Representa um pixel com coordenadas e uma cor. Implementa InterfacePixel. <br>
* Node: Representa um nó usado em listas encadeadas para armazenar objetos Pixel. Implementa InterfaceNode. <br>
* Main: Contém o método principal para demonstrar o algoritmo Flood Fill. <br>
As duas interfaces são: <br>

* InterfacePixel: Define métodos relacionados às propriedades do pixel. <br>
* InterfaceNode: Define métodos para nós de listas encadeadas.

## Implementação 
### Classe Pixel 
A classe Pixel representa um pixel com coordenadas e uma cor. Inclui métodos para pintar pixels adjacentes e verificar limites. <br>

### Classe Node 
A classe Node representa um nó de lista encadeada que contém um objeto Pixel. Ela fornece métodos para inserir e remover elementos da pilha, além de inserir e remover elementos da fila. Adicionalmente, possui um método para exibir a lista encadeada.

### Main
A classe Main contém o método main que demonstra o algoritmo Flood Fill. Ela cria instâncias das classes Pixel e Node e mostra como usar o algoritmo baseado em pilha para preencher pixels adjacentes.

## Funcionamento do projeto 

## Uso 
Para utilizar o projeto, siga os passos abaixo:

</div>

1. Clone o repositório para o seu computador:
>```git clone https://github.com/seu-nome-de-usuário/flood-fill.git> ```

2. Compile e execute a classe Main:
>```javac src/Main.java>```

3. Siga as instruções no console para interagir com o algoritmo Flood Fill e ver seus resultados.

