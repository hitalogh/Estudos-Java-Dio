package TrabalhandoComOperadoresAritmeticos;

import java.util.Scanner;

public class Multiplicação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor 1");
        int valor1 = scanner.nextInt();
        System.out.println("Informe o valor 2");
        int valor2 = scanner.nextInt();
//Multiplicação
        System.out.printf("%s * %s = %s \n", valor1, valor2, valor1 * valor2);


    }
}
