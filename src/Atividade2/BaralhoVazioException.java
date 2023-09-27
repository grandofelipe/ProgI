package Atividade2;

public class BaralhoVazioException extends Exception {
    
    @Override
    public void printStackTrace() {
        System.out.println("Baralho vazio, não é possível pescar mais cartas.");
    }

}
