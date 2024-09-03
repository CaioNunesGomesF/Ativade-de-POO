
# **POO - Atividade de aula:**







# Informações sobre o codigo:

### IDE utilizada:

![ide intellij](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

### Linguagem utilizada:

![Linguagem java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

#




## 1- Estrutura condicionais:

### Mini calculadora:

```
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

```

### Cálculo de IMC:

---

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

---

### Verificar se é par ou impar.

---
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
---

## 2- Estruturas de repetição:
    
### Somar os números pares:
```
    package EstruturasDeRepeticao;

    public class SomaPar {

        public static void main(String[] args) {

            /*1- Faça
            um algoritmo em Java que calcule a soma todos
            os números pares entre 1 e 100. O programa deve
            imprimir o resultado da soma.*/

            double soma=0;

            for(int i=1;i<=100;i++){
                if(i % 2 == 0){
                    soma += i;
                }
            }

            System.out.println("A soma de todos os números pares de 1 até 100 é " + soma);


        }
    }
```

## Verificar se o número é primo:

---
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
---


## 3- Arrays:

### Contar quantas vezes o número escolhido foi repetido:

```
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
```

### Maior e Menor numero:

---
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
---
