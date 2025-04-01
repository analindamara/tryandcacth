package Try_Catch;
import java.util.Scanner;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String resultado) {
        super(resultado);
    }
}
    public class Ativ_8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Digite sua idade: ");
                Integer idade = sc.nextInt();

                if (idade < 0) {
                    throw new IdadeInvalidaException("Idade negativa ou zerada, tente novamente");
                }
            } catch (IdadeInvalidaException e) {
                System.out.print("Erro "+ e.getMessage());
            } finally {
                sc.close();
            }
        }
    }
