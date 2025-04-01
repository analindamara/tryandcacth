package Try_Catch;
import java.util.Scanner;
    class NumeroNegativoException extends Exception {
        public NumeroNegativoException(String resultado) {
            super(resultado);
        }
    }
    class LimiteFatorialExcedidoException extends Exception {
        public LimiteFatorialExcedidoException(String resultado) {
            super(resultado);
        }
    }
    public class Ativ_10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Digite um número: ");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NumeroNegativoException("Número negativo não permitido.");
                }

                if (num > 20) {
                    throw new LimiteFatorialExcedidoException("Número maior que 20 não permitido.");
                }

                System.out.println("Fatorial de " + num + " é " + calcF(num));

            } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
                System.out.println(e.getMessage());
            } finally {
                sc.close();
            }
        }

        public static int calcF(int n) {
            if (n == 0) {
                return 1;
            }
            return n * calcF(n - 1);
        }
    }