package EstruturaCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        /* 3 - Faça um algoritmo em Java que receba o peso (em kg) e a
        altura (em metros) de uma pessoa, e calcule o Índice de Massa
        Corporal (IMC).
        Fórmula do IMC: IMC = peso / (altura * altura)
         O programa deve classificar o IMC da seguinte forma*/

        System.out.println("Digite sua altura em metros: ");
        double altura = sc.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        altura = altura / 100;

        double IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f%n", IMC);

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30) {
            System.out.println("Obesidade");
        }
    }
}
