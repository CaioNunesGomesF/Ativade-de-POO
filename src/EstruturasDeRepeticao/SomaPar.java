package EstruturasDeRepeticao;

public class SomaPar {

    public static void main(String[] args) {

        double soma=0;

        for(int i=1;i<=100;i++){
            if(i % 2 == 0){
                soma += i;
            }
        }

        System.out.println("A soma de todos os números pares de 1 até 100 é " + soma);


    }
}
