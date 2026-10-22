package Aula_operadoresLogicos;

import java.util.Scanner;
//Novo exemplo , contando novos operadores sendo eles
//||(ou) e &&(E/and)
public class Exemplo_DireçaoNovosoperadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos anos voce tem ?");
        int idade = scanner.nextInt();
        System.out.println(" Você é Emancipado ? ");
        boolean isEmancipated = scanner.nextBoolean();
        /**
          caso você tenha a idade maior ou igual a 18 retornára true
          caso você tenha menos de 18 anos mas for emancipado irá passar para o operador ||(ou)
          que vai ver a primeira condição como false , mas ao ir para a segunda que entra no operador
          &&(E/and) vai verificar se a pessoa emancipada tem a idade maior ou igual 16 , casor for
          retornara como true/ ex: Você pode dirigir ? (true) , caso alguma dessas condições forem
         false/ ex:ter menos de 16 anos retornara false, Você pode dirigir ? (false)
         */
        boolean PodeDirigir = idade >= 18 || (isEmancipated && idade >= 16);
        System.out.printf(" Você pode dirigir ?  (%s) \n " , PodeDirigir);
    }

}

