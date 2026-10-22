package Aula_operadoresLogicos;

import java.util.Scanner;

public class TesteOperadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quanto é 2+2 ?");
        int resultado = scanner.nextInt();
        boolean isRight = resultado == 4;
        System.out.printf("O resultado é 4 , voce acertou ? (%s) ", isRight);

    }
}
