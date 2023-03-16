package Numero10;

/*construir um programa em Java que leia o sexo de 30 alunos e turma e calcule, armazene
e imprima a porcentagem de alunos do sexo masculino e a porcentagem do sexo
feminino.*/

import java.util.Scanner;
//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Numero10{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        int flag = 6;
        int homens = 0, mulheres = 0;
        
        ArrayList<Character> arr = new ArrayList<Character>();
        ArrayList<String> turma = new ArrayList<String>();


        for(int i = 0; i < flag; i++){

            System.out.println("Informe o sexo do aluno com M para masculino, e F para feminino:");
            String sexo = ler.next();

            
            arr.add(sexo.charAt(0));
            
            if(arr.get(i) == 'm' || arr.get(i) == 'M'){
                homens++;
            }
            else if(arr.get(i) == 'f' || arr.get(i) == 'F'){
                mulheres++;
            }
            else{
                System.out.println("Sexo invalido.");
                i--;
                continue;
            }
            
            System.out.println("Informe a turma do aluno:");
            turma.add(ler.next());
            
        }
        for(int i  = 0; i < flag; i++){
            System.out.printf("\n%d° aluno...\n",i+1);
            System.out.printf("Sexo: %s\n",arr.get(i));
            System.out.printf("Turma: %s\n",turma.get(i));
        }

        float porcenM = (float)(homens * 100) /(float) flag;
        float porcenF = (float)(mulheres * 100) /(float) flag;

        System.out.printf("A porcentagem de alunos do sexo masculino é de: %.2f\n",porcenM);
        System.out.printf("A porcentagem de alunos do sexo feminino é de: %.2f\n",porcenF);

    }   
    
}
