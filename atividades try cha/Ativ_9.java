package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;
class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException(String resultado) {
        super(resultado);
    }
}
public class Ativ_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a temperatura em Celsius: ");
            Double tempC = sc.nextDouble();

            if (tempC < -273.15) {
                throw new TemperaturaInvalidaException("Temperatura abaixo do zero absoluto. Tente novamente.");
            }

            Double tempF = (tempC * 9 / 5) + 32;

            System.out.print("A temperatura em Fahrenheit é: "+ tempF);
        } catch (InputMismatchException e) {
            System.out.println("Valor não númerico inserido tente novamente ");
        } catch (TemperaturaInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

// package Try_Catch;
//import java.util.Scanner;
//
//class IdadeInvalidaException extends Exception {
//    public IdadeInvalidaException(String resultado) {
//        super(resultado);
//    }
//}
//    public class Ativ_8 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            try {
//                System.out.print("Digite sua idade: ");
//                Integer idade = sc.nextInt();
//
//                if (idade < 0) {
//                    throw new IdadeInvalidaException("Idade negativa ou zerada, tente novamente");
//                }
//            } catch (IdadeInvalidaException e) {
//                System.out.print("Erro "+ e.getMessage());
//            } finally {
//                sc.close();
//            }
//        }
//    }