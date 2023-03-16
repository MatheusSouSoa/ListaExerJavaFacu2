package Numero5;

/*construir um programa em Java que leia um número inteiro entre 1 e 7 e imprima o nome
do dia da semana correspondente ao número, caso o número esteja fora do intervalo entre
1 e 7, imprimir “Dia Inválido”. */

import java.util.Scanner;

public class Numero5{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe um numero: \n");
        int num1 = ler.nextInt();

        switch(num1){
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
            case 4:
                System.out.println("Quarta.");
                break;
            case 5:
                System.out.println("Quinta.");
                break;
            case 6:
                System.out.println("Sexta.");
                break;
            case 7:
                System.out.println("Sabado.");
                break;
            default:
                System.out.println("Dia invalido.");
                break;
        }
    }
}