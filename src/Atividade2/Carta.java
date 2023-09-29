package atividade2;

public class Carta {

    private Naipe naipe;
    private ValorCarta valorCarta;

    public Carta(Naipe naipe, ValorCarta valorCarta) {
        //Validação de naipe e valor são desnecessárias com o uso de enumeradores
        this.naipe = naipe;
        this.valorCarta = valorCarta;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public ValorCarta getValorCarta() {
        return valorCarta;
    }

    //Sobrescrevi o método toString da classe Carta para deixar o print da mão do jogador mais conciso.
    @Override
    public String toString(){
        return this.valorCarta + " de " + this.naipe;
    }
}