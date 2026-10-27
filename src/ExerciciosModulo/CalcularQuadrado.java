package ExerciciosModulo;

import java.util.Scanner;
//Escreva um código que receba o tamanho do lado
// de um quadrado, calcule sua área e exiba na tela
public class CalcularQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o tamanho do lado");
        double lado = scanner.nextDouble();
        double area= lado*lado;
        System.out.println("A areá do quadrado será de " + area);





    }
}