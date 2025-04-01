package Try_Catch;
import java.util.Scanner;
class DadosInvalidosException extends Exception {
    public DadosInvalidosException(String resultado){
        super(resultado);
    }
}

public class Ativ_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            Integer idade = sc.nextInt();

            if (nome.isEmpty()){
                throw new DadosInvalidosException("Nome vazio, tente novamente bobao");
            } else if (idade < 0) {
                throw new DadosInvalidosException("Idade negativa, tente novamente bobao");
            }

        } catch (DadosInvalidosException e) {
            System.out.println("\nErro\n"+ e);
        } finally {
            sc.close();
        }
    }
}