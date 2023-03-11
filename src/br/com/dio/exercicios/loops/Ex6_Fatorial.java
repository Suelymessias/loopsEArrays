package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Programa que calcula o fatorial de um
 número intero fornecido pelo usuário
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i>=1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }

}
