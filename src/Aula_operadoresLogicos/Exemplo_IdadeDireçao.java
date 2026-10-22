package Aula_operadoresLogicos;

import java.util.Scanner;

public class Exemplo_IdadeDireçao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos anos voce tem ?");
        int idade = scanner.nextInt();
        boolean PodeDirigir = idade >= 18;
        //caso o numero seja menor que 18 ,retornara um valor (false)
        //ja se for maior ou igual a 18 retornara (true)
        System.out.printf(" Você pode dirigir ?  (%s) ", PodeDirigir);
    }
}
