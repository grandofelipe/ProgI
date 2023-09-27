package Atividade2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    List<Carta> pilhaCartas;

    public Baralho(){
        pilhaCartas = new ArrayList<Carta>();
        for (Naipe naipe: Naipe.values()){
            for (ValorCarta valorCarta: ValorCarta.values()){
                pilhaCartas.add(new Carta(naipe, valorCarta));
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(this.pilhaCartas);
    }

    public Carta pescar() throws BaralhoVazioException{
        if (this.pilhaCartas.isEmpty()){
            throw new BaralhoVazioException();
        }
        return this.pilhaCartas.remove(0);
    }
    
}
