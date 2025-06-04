package lista10;

public class Exercicio04 {
    public static void main(String[] args) {
        int i = 1;
        double grao = 1;
        double total = 0;
        while (i <= 64) {
            total += grao;
            grao *= 2;
            i++;
        }
        System.out.println("Total de grãos: " + total);
    }
}
