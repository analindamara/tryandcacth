package Try_Catch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ativ_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("Digite o primeiro numero");
            Integer num1 = sc.nextInt();
            System.out.println("Digite o segundo numero");
            Double num2 = sc.nextDouble();
            Double num3 = num1 / num2;
            System.out.println("O resultado é " + num3);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Erro! O SISTEMA SUPORTA SOMENTE NÚMEROS");
        }
    }
}