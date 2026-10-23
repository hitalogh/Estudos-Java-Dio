package TrabalhandoComOperadoresAritmeticos;

import java.util.Scanner;

public class Divisão {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor 1");
        float valor1 = scanner.nextFloat();
        System.out.println("Informe o valor 2");
        float valor2 = scanner.nextFloat();
//aloo
        System.out.printf("%s / %s = %s \n", valor1, valor2, valor1 / valor2);


    }
}
