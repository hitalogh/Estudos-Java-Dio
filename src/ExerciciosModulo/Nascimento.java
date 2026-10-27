package ExerciciosModulo;

import java.util.Scanner;
//Escreva um código que receba o nome e o ano de nascimento de alguém
// e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
public class Nascimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome ?\n");
        String nome = scanner.nextLine();
        System.out.println("Qual seu ano de nascimento ?\n");
        int nascimento = scanner.nextInt();
        int anoatual = 2026;

        System.out.printf(" Olá " + nome + " você tem %s anos \n",(anoatual-nascimento));

    }
}