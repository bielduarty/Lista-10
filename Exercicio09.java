package lista10;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            valor = sc.nextInt();
            if (valor < 0) break;

            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
        }

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum valor informado.");
        } else {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }

        sc.close();
    }
}
