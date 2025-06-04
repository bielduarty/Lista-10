package lista10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();

        int quociente = 0;
        int acumulador = divisor;

        while (acumulador <= dividendo) {
            quociente++;
            acumulador += divisor;
        }

        System.out.println("Resultado da divisão inteira: " + quociente);
        sc.close();
    }
}
