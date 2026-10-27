package ExerciciosModulo;

import java.util.Scanner;

//Escreva um código que receba a base e a altura de
// um retângulo, calcule sua área e exiba na tela
public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Informe a medida da base do retângulo");
        double base = scanner.nextDouble();
        System.out.println(" Informe a medida da altura do retângulo");
        double altura = scanner.nextDouble();
        double area= base * altura;

        System.out.println(" A medida da área do retângulo é de " + area);
    }
}