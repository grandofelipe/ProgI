package prova1.questao10;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
    public String nome;
    public List<Double> notas = new ArrayList<Double>();
    // Alternativa com vetor
    public double notasVetor[];

    public void computarMedia(){
        if (this.notas.isEmpty())// Ou notas.size() == 0
            throw new RuntimeException("O aluno não tem notas");
        double media = 0;
        for (Double nota: this.notas)
            media += nota;
        media /= this.notas.size();
        System.out.printf("A média do %s é igual a %.2f \n", this.nome, media);
        if (media >=6)
            System.out.printf("O %s está aprovado", this.nome);
        else
            System.out.printf("O %s está reprovado", this.nome);
    }

    public void computarMediaVetor(){
        if (this.notasVetor.length == 0)
            throw new RuntimeException("O aluno não tem notas");
        double media = 0;
        for (Double nota: this.notasVetor) // Ou for (int i = 0; i<this.notaVetor.lenght; i++){media += this.notasVetor[i]}
            media += nota;
        media /= this.notasVetor.length;
        System.out.printf("A média do %s é igual a %.2f \n", this.nome, media);
        if (media >=6)
            System.out.printf("O %s está aprovado", this.nome);
        else
            System.out.printf("O %s está reprovado", this.nome);
    }
}
