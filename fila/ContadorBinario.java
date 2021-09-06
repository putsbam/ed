package fila;

import java.util.Scanner;

public class ContadorBinario {

    public static void Sequencia(int n) {
        int binary[] = new int[40];
        int index = 0;
        while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }
        //O primeiro dígito a ser calculado é printado
        //na tela, First In First Out.
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o n: ");
        int n = scan.nextInt();
        for (int i=0;i<=n;i++){
            Sequencia(i);
        }
    }
}