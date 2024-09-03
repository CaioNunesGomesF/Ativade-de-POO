package EstruturaCondicionais;

import java.util.Scanner;
import java.util.SortedMap;

public class ParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*1 - Faça
        um algoritmo que receba um número inteiro e verifique
        se ele é par ou ímpar. O programa deve imprimir "Par" se o
        número for par e "Ímpar" se for ímpar.*/

        System.out.println("Digite um numero");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("O numero é par!");
        }
        else{
            System.out.println("O numero é impar");
        }

    }
}
