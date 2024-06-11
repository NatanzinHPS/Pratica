import java.util.Scanner;

public class Aula10P1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        int num = scn.nextInt();
        /*Faça um algoritmo que pede para o usuário digitar números inteiros
        positivos. O algoritmo deve somar esses números e parar quando o
        usuário digitar um número negativo.
        */
        
            while (num >= 0) {
                System.out.print("Digite um numero inteiro diferente de 0: ");

                if (num >= 0){
                    soma += num;
                    System.out.println("A soma atual é igual a " + soma);
                } 
            }

        scn.close();
    }

}