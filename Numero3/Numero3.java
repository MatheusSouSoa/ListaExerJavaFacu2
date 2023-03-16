package Numero3;

/*
 * construir um programa em Java que leia um número inteiro e imprima “Positivo”, se o
número lido for maior que 0, imprima “Negativo”, se o número lido for menor que 0 e
imprima “Nulo”, se o número lido for igual a 0.
 */

import java.util.Scanner;

public class Numero3{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o primeiro numero inteiro: \n");
        int num1 = ler.nextInt();


        if(num1 > 0)
            System.out.printf("%d é positivo.\n",num1);
        else if(num1 == 0)
            System.out.printf("%d é nulo.\n",num1);
        else
            System.out.printf("%d é negativo.\n",num1);
    
    }
}
