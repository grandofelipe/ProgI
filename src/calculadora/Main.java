package calculadora;

import calculadora.operacoes.Operacao;
import calculadora.operacoes.Soma;

public class Main {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        double x = 3.5, y = 7.43598374;
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y));
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y, 5));
    }
}