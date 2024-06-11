import java.util.Scanner;
/*Faça um algoritmo que peça para o usuário digitar vários números e
calcule a média desses números. O algoritmo deve parar quando o
usuário digitar zero.
*/
public class Aula10P2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int qnt = 0;
        float media = 0;
        float num = 1;
        float soma = 0;

        while(num != 0){
            System.out.print("Insira um numero: ");
            num = scn.nextFloat();
            if(num != 0){
                soma += num;
                qnt++;
                media = soma/qnt;
                System.out.println("A soma atual eh " + soma + ", e a qntd eh " + qnt + ".");
                System.out.println("A media atual eh: " + media);
            }
        }
        scn.close();
    }

}
