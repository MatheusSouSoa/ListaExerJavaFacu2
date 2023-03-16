package Numero9;

/*cconstruir um programa em Java que leia 10 notas e imprima a maior e a menor nota lidas.. */

import java.util.Scanner;

public class Numero9{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        float maior = 0;
        int flag = 5;
        float menor = 0;

        for(int i = 0; i < flag; i++){

            System.out.printf("Informe um numero: \n",i+1);
            float num1 = ler.nextFloat();

            if(i == 0){
                maior = menor = num1;
                continue;
            }


            if(num1 > maior){
                maior = num1;
            }
            if(num1 < menor){
                menor = num1;
            }
            
        }

        System.out.printf("O maior nota lida é: %.2f\n",maior);
        System.out.printf("A menor nota lida é: %.2f\n",menor);
    
    }
}