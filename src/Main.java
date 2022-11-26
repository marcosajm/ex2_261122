import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static int pick;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista_num = new ArrayList<Integer>();
        Random rand = new Random();
        for (int j = 0; j<5; j++)
        {
            pick = rand.nextInt(1000);
            lista_num.add(pick);
        }
        int sum = 0;
        int n = lista_num.size();
        for(int i=0; i<n; i++)
        {
            sum = sum+ lista_num.get(i);
            sum=sum+n;
        }
        int avg =sum/n;
        int min = lista_num.get(0);
        int max = lista_num.get(0);
        for (int i = 1; i < n; i++) {
            if (lista_num.get(i) < min) {
                min = lista_num.get(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (lista_num.get(i) > max) {
                max = lista_num.get(i);
            }
        }
        System.out.println("5 números inteiros aleatórios: " + lista_num);
        System.out.println("Maior dos 5 números: " + max);
        System.out.println("Menor dos 5 números: " + min);
        System.out.println("Soma dos 5 números: " + sum);
        System.out.println("Média dos 5 números: " + avg);

        // Exercício 2: Desenvolva um programa que gera 5 números inteiros
       // aleatórios, entre 1 e 1000, e guarde-os numa ArrayList.
        // De seguida, imprima qual foi o maior e o menor valor gerado, e a
       // média de todos os números gerados.
       // Utilize a biblioteca Random (Random rand = new Random();
        // rand.nextInt(1000));
    }
}
