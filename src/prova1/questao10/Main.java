package prova1.questao10;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Fulano";
        aluno.notas.add(9.0);
        aluno.notas.add(7.0);
        aluno.notas.add(10.0);
        aluno.notas.add(5.5); 
        // Ou aluno.notas = new ArrayList<Double>(Arrays.asList(9.0, 7.0, 10.0, 5.5));
        aluno.computarMedia();
        //Alternativa com vetor
        aluno.notasVetor = new double[]{9.0, 7.0, 10.0, 5.5};
        aluno.computarMediaVetor();
    }
}
