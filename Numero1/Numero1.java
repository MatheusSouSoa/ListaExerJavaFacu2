package Numero1;

/*
 * construir um programa em Java que leia 2 números inteiros e imprima o maior número
lido.
 */


import java.util.Scanner;

public class Numero1{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o primeiro numero inteiro: \n");
        int num1 = ler.nextInt();

        System.out.printf("Informe o segundo numero inteiro: \n");
        int num2 = ler.nextInt();

        if(num1 > num2)
            System.out.printf("O maior é: %d\n",num1);
        else
            System.out.printf("O maior é: %d\n",num2);

    }
}