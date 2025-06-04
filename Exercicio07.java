package lista10;

public class Exercicio07 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            if (num % 2 != 0) {
                long fat = 1;
                int i = 1;
                while (i <= num) {
                    fat *= i;
                    i++;
                }
                System.out.println("Fatorial de " + num + " = " + fat);
            }
            num++;
        }
    }
}
