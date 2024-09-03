package Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Digite 10 números inteiros:\n");

        int num = 0;
        for(int i=0;i<10;i++){
            System.out.printf("Numero " + (i + 1) +": ");
            num = sc.nextInt();
            list.add(num);
        }

        int maiorNumero = list.stream().max(Comparator.naturalOrder()).orElseThrow();
        int menorNumero = list.stream().min(Comparator.naturalOrder()).orElseThrow();

        System.out.println("O maior número dá lista é " + maiorNumero + ".");
        System.out.println("\nO manor número dá lista é " + menorNumero + ".");
    }
}
