package ExerciciosModulo;

import java.util.Scanner;
//Escreva um código que receba o nome e a idade de
// 2 pessoas e imprima a diferença de idade entre elas
public class DiferençaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Qual o nome da primeira pessoa ?");
        String nomeP1 = scanner.nextLine();
        System.out.println("Qual a idade da primeira pessoa ?");
        int idadeP1 = scanner.nextInt();
        //limpeza de buffer
        scanner.nextLine();
        System.out.println(" Qual o nome da segunda pessoa ?");
       String nomeP2 = scanner.nextLine();
       System.out.println("Qual a idade da segunda pessoa ?");
        int idadeP2 = scanner.nextInt();
        //Math.abs vai remover o sinal negativo de um numero
        //no caso evitando que a diferença de idade seja negativa
        int diferença = Math.abs(idadeP1 - idadeP2);
        System.out.println(" A diferença de idade entre " + nomeP1 + " e " + nomeP2 + " vai ser de  " + diferença + " anos ");




    }

}
