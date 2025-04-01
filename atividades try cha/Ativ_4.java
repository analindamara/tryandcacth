package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número");
            Integer num1 = sc.nextInt();
            System.out.println("Digite o ssegundo número");
            Integer num2 = sc.nextInt();
            Integer num3 = num1 + num2;
            System.out.println("O resultado é: "+ num3);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("O CARACTERE É INVÁLIDO");
        }
    }
}
