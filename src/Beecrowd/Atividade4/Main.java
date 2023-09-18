package Beecrowd.Atividade4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        float div = (float)n1/n2;
        System.out.printf("%.2f", div);
        leitor.close();
    }
}
