package Aula_operadoresLogicos;

import java.util.Scanner;
//Novo exemplo , contando novos operadores sendo eles
//||(ou) e &&(
public class Exemplo_DireçaoNovosoperadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos anos voce tem ?");
        int idade = scanner.nextInt();
        System.out.println(" Você é Emancipado ? ");
        boolean isEmancipated = scanner.nextBoolean();
        boolean PodeDirigir = idade >= 18 || isEmancipated && idade >= 16;
        System.out.printf(" Você pode dirigir ?  (%s) \n " , PodeDirigir);
    }

}

