package lista10;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, num, i;
        long fatorial, soma = 0;

        while (cont <= 15) {
            System.out.print("Digite o " + cont + "º número: ");
            num = sc.nextInt();
            fatorial = 1;
            i = 1;
            while (i <= num) {
                fatorial *= i;
                i++;
            }
            soma += fatorial;
            cont++;
        }
        System.out.println("Soma dos fatoriais: " + soma);
        sc.close();
    }
}
