package br.com.dio.exercicios.arrays;
/* Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {4, 6, 9, 23, -7, 45};

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + "  ");
            count ++;
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length-1); i>= 0; i--){
            System.out.print(vetor[i] + "  ");
        }

    }
}
