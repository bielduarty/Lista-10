package lista10;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalArea = 0;

        while (true) {
            System.out.print("Nome do cômodo: ");
            String nome = sc.nextLine();
            System.out.print("Largura (m): ");
            double largura = sc.nextDouble();
            System.out.print("Comprimento (m): ");
            double comprimento = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            double area = largura * comprimento;
            totalArea += area;

            System.out.println("Área do " + nome + ": " + area + " m²");

            System.out.print("Deseja adicionar outro cômodo? (SIM/NAO): ");
            String resposta = sc.nextLine().toUpperCase();

            if (resposta.equals("NAO")) break;
        }

        System.out.println("Área total da residência: " + totalArea + " m²");
        sc.close();
    }
}
