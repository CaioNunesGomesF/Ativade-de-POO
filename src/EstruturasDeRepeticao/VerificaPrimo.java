package EstruturasDeRepeticao;

import java.util.Scanner;

public class VerificaPrimo {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* 2-
        Faça
        um algoritmo em Java que receba um número
        inteiro positivo e verifique se ele é um número
        primo. Ao final, imprima "É primo" ou "Não é primo".
        */
        int num;
        do {
            System.out.println("Digite um número inteiro positivo");
            num = sc.nextInt();
        } while (num < 0 );

        VerificaPrimo verificaPrimo = new VerificaPrimo();

        System.out.println(verificaPrimo.verficarNumeroPrimo(num));
    }

        public String verficarNumeroPrimo(int num){
        int numDividores = 0;

        for(int i=1;i<=num;i++){
            if(num % i == 0){
                numDividores++;
            }
        }

        if(numDividores == 2){
            return "O numero digitado é primo!";
        }
        else{
            return "O numero digitado não é primo!";
        }
    }
}
