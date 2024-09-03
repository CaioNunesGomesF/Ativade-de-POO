package EstruturaCondicionais;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        /* 2-
        Faça um algoritmo que receba dois números inteiros e um
        caractere representando uma operação aritmética (+, -, * ou
        /). Se o caractere não for válido, o programa deve imprimir
        "Operação inválida". O programa de imprimir o resultado da
        operação aritmética entre os dois números.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("\nDigite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Qual operação aritmética (+, -, * ou /): ");
        char operacao = sc.next().charAt(0);

        switch(operacao){

            case '+':
                System.out.println("O resultado é = " + (num1 + num2));
                break;
            case '-':
                System.out.println("O resultado é = " + (num1 = num2));
                break;
            case '*':
                System.out.println("O resultado é = " + (num1 * num2));
                break;
            case '/':
                System.out.println("O resultado é = " + (num1 / num2));
                break;


        }
    }
}
