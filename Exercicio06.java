package lista10;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, soma = 0, cont = 0;

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            valor = sc.nextInt();
            if (valor < 0) break;
            soma += valor;
            cont++;
        }

        if (cont == 0) {
            System.out.println("Nenhum valor inserido.");
        } else {
            double media = (double) soma / cont;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Total de valores: " + cont);
        }

        sc.close();
    }
}
