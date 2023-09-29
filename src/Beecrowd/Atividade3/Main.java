package beecrowd.atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int qtdNumeros = leitor.nextInt();
        int[] vetorNumeros = new int[qtdNumeros];
        for (int i=0; i<qtdNumeros; i++){
            vetorNumeros[i] = leitor.nextInt();
        }
        leitor.close();

        for (int i=0; i<qtdNumeros-1; i++){
            System.out.print(vetorNumeros[i]+" ");    
        }

        System.out.println(vetorNumeros[qtdNumeros-1]);
        
        for (int i=0; i<qtdNumeros; i++){
            System.out.println(vetorNumeros[i]);    
        }
    }
}
