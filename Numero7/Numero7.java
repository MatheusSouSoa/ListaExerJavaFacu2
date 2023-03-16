package Numero7;

/*construir um programa em Java que leia a idade de 15 pessoas e calcule, armazene e
imprima a média das idades lidas. */

import java.util.Scanner;

public class Numero7{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        int total = 0;
        int flag = 5;

        for(int i = 0; i < flag; i++){

            System.out.printf("Informe a idade do %d° individuo: \n",i+1);
            int num1 = ler.nextInt();
            total += num1;
        }

        float media = (float) total / (float) flag;

        System.out.printf("A media das idades lidas é: %.2f\n",media);
    
    }
}