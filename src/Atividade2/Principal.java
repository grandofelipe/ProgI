package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){
        Baralho baralho = new Baralho();
        baralho.embaralhar();
        List<Carta> maoJogador = new ArrayList<Carta>();
        for (int i = 0; i < 7; i++){
            try {
                maoJogador.add(baralho.pescar());
            } catch (BaralhoVazioException e) {
                e.printStackTrace();
            }
        }
        //Sobrescrevi o método toString da classe Carta para deixar o print mais conciso. 
        System.out.println(maoJogador);
    }
}
