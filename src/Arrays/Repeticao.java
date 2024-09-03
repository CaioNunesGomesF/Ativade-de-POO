package Arrays;

import EstruturasDeRepeticao.SomaPar;

import java.util.Arrays;
import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {

        /*1- Faça um algoritmo em Java que receba 10 números
        inteiros e um número inteiro específico. O programa
        deve contar quantas vezes esse número específico
        aparece e imprimir o resultado.*/

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        System.out.println("Digite 10 números inteiros:\n");

        for(int i=0;i<10;i++){
            System.out.printf("Numero " + (i + 1) +": ");
            num[i] = sc.nextInt();
        }

        System.out.println("Agora digite um número específico: ");
        int numeroEspecifico = sc.nextInt();

        int quantidadeRepeticao = 0;
        for(int i=0;i<10;i++){
            if(numeroEspecifico == num[i]){
                quantidadeRepeticao++;
            }
        }

        System.out.println("\nO número digitado se repete " + quantidadeRepeticao);
    }
}
