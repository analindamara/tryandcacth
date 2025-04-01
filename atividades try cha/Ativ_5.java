package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = {10, 20, 30, 40, 50};
        try {
            System.out.println("Digite um número");
            Integer indice = sc.nextInt();

            System.out.println("O número no índice " + indice + " é: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Fora dos limites");
        } finally {
            sc.close();
        }
    }
}
