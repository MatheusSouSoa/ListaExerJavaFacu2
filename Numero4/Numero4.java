package Numero4;

/*
 * construir um programa em Java que leia as 2 notas de um aluno e que calcule, armazene
e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”, caso
contrário, realizar a leitura de uma terceira nota, que terá peso 2 e calcular, armazenar e
imprimir uma nova média. Se a nova média for maior ou igual a 6, imprimir “Aprovado”,
caso contrário, imprimir “Reprovado”.
 */

import java.util.Scanner;

public class Numero4{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe a primeira nota do aluno: \n");
        float num1 = ler.nextFloat();

        System.out.printf("Informe segunda nota do aluno: \n");
        float num2 = ler.nextFloat();

        float media = (num1 + num2) / 2;


        if(media > 7.0)
            System.out.printf("Aprovado.\n",num1);
        else{
            System.out.printf("Informe terceira nota nota do aluno: \n");
            float num3 = ler.nextFloat();
            
            num3 *= 2;

            media = (num1 + num2 + num3) / 3;

            System.out.printf(media > 6.0 ? "Aprovado.\n" : "Reprovado.\n");

        }
    
    }
}