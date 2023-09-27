package Atividade2;

public enum ValorCarta {
    ÁS("1"), 
    DOIS("2"), 
    TRES("3"), 
    QUATRO("4"), 
    CINCO("5"),
    SEIS("6"), 
    SETE("7"), 
    OITO("8"),
    NOVE("9"),
    DEZ("10"), 
    VALETE("J"),
    DAMA("Q"), 
    REI("K");
    
    public final String valor;
    
    ValorCarta(String valor){
        this.valor = valor;
    }
}