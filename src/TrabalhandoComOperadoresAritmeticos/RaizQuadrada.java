package TrabalhandoComOperadoresAritmeticos;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor da deseja ver o resultado da raiz quadrada ");
    double valor = scanner.nextDouble();
    // Imprime a mensagem formatada na consola:
        // - O 1.º %s é substituído pela variável 'valor'
        // - O 2.º %s é substituído pelo resultado do método Math.sqrt(valor)
        // - Math.sqrt(valor) calcula a raiz quadrada do número
    System.out.printf(" A raiza quadrada de %s é %s \n",valor, Math.sqrt(valor));


}
}
