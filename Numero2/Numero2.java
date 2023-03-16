package Numero2;

/*
 * construir um programa em Java que leia um número inteiro e imprima “PAR”, se o
número for par e imprima “ÍMPAR”, se o número for ímpar.
 */

import java.util.Scanner;

public class Numero2{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o primeiro numero inteiro: \n");
        int num1 = ler.nextInt();


        if(num1 % 2 == 0)
            System.out.printf("%d é par.\n",num1);
        else
            System.out.printf("%d é impar.\n",num1);

    }
}