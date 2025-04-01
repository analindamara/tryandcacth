package Try_Catch;
import java.util.InputMismatchException;
import java.util.Scanner;
    public class Ativ_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
                try {
                    System.out.println("Digite um número");
                    String text = sc.next();
                    Integer num = Integer.parseInt(text);

                    System.out.println("O numero é: "+ num);
            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("Erro! O SISTEMA NÃO SUPORTA O CARACTERE ");
            } finally {
                    sc.close();
                }
        }
    }

