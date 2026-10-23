package TrabalhandoComOperadoresAritmeticos;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor 1");
       int valor1 = scanner.nextInt();
        System.out.println("Informe o valor 2");
       int valor2 = scanner.nextInt();
//Nesta linha, o código faz uma soma entre as variáveis valor1 e valor2
// e imprime uma mensagem formatada no O comportamento detalhado
// de cada parte é o seguinte:"%s + %s = %s \n": Define a mensagem de saída
// com três marcadores %s:   O primeiro %s é substituído por valor1.
// O segundo %s é substituído por valor2.   O terceiro %s é substituído pelo
// resultado da soma valor1 + valor2.   valor1 + valor2: O Java calcula primeiro
// o resultado desta adição antes de o colocar no lugar do último %s.   \n: Quebra a linha no final.
        System.out.printf("%s + %s = %s \n", valor1 , valor2, valor1+valor2);


    }
}


