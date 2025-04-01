package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número ");
            Double num1 = sc.nextDouble();
            if (num1 < 0 ) {
                System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
            } else {
                double raiz = Math.sqrt(num1);
                System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
            }
        } catch (IllegalArgumentException | InputMismatchException | ArithmeticException e) {
            System.out.println("O número é negativo ou inválido");
        } finally {
            sc.close();
        }
    }
}
