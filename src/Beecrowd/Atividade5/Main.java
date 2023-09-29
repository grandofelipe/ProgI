package beecrowd.atividade5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        if (n1 > 0)
            System.out.printf("O número digitado (%d) é positivo.", n1);
        else if(n1 < 0)
            System.out.printf("O número digitado (%d) é negativo.", n1);
        else
            System.out.printf("O número digitado é igual a zero.");
        leitor.close();
    }
}
