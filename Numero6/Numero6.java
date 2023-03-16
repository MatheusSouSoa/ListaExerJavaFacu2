package Numero6;

/*construir um programa em Java que leia 10 números inteiros e que calcule, armazene e
imprima o somatório de todos os números lidos. */

import java.util.Scanner;

public class Numero6{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        int total = 0;

        for(int i = 0; i < 10; i++){

            System.out.printf("Informe um numero: \n");
            int num1 = ler.nextInt();
            total += num1;
        }

        System.out.printf("o total dos numeros informados é: %d\n",total);
    
    }
}