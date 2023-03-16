package Numero8;

/*construir um programa em Java que leia 10 números e imprima o maior número lido.. */

import java.util.Scanner;

public class Numero8{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        int maior = 0;
        int flag = 5;

        for(int i = 0; i < flag; i++){

            System.out.printf("Informe um numero: \n",i+1);
            int num1 = ler.nextInt();


            if(num1 > maior){
                maior = num1;
            }
            
        }

        System.out.printf("O maior numero lido é: %d\n",maior);
    
    }
}