package persistencia_dados;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        //guardarNotas();
        computarMedias();
        /*
        // Um Path é usado para representar o caminho de um arquivo ou diretório no sistema operacional
        // Exemplo de camimho absoluto no Windows (note o uso de duas contrabarras)
        Path areaTrabalhoWindows = Paths.get("C:\\Users\\felip\\Desktop");
        System.out.println(areaTrabalhoWindows.toAbsolutePath());
        System.out.println(Files.isDirectory(areaTrabalhoWindows));
        // Exemplo de camimho absoluto no Linux (uso de barras simples)
         
        Path areaTrabalhoLinux = Paths.get("/home/felip");
        System.out.println(areaTrabalhoLinux.toAbsolutePath());
        System.out.println(Files.isDirectory(areaTrabalhoLinux));
        
        // Exemplo de caminho relativo (retornará o diretório atual do arquivo executável ou projeto Java)
        Path diretorioAtual = Paths.get(".");
        System.out.println(diretorioAtual.toAbsolutePath());
        // Posso usar o "." para criar caminhos relativos em qualquer sistema operacional com o uso de barras
        Path caminhoRelativo = Paths.get("./src/persistencia_dados/Main.java");
        System.out.println(caminhoRelativo.toAbsolutePath());
        // Posso usar o ".." para acessar o diretório pai do diretório atual
        Path caminhoRelativoPai = Paths.get("./src/persistencia_dados/../calculadora/Main.java");
        System.out.println(caminhoRelativoPai.toAbsolutePath());
        
        //Criando um novo diretório (pasta) e um novo arquivo
        Path novaPasta = Paths.get("./src/persistencia_dados/arquivos/");
        Files.createDirectories(novaPasta);
        //Resolve une os caminhos
        Path novoArquivo = novaPasta.resolve(Paths.get("texto.txt"));
        //Excluir arquivo se existir
        Files.deleteIfExists(novoArquivo);        
        //Escrever dados textuais no arquivo
        List<String> textoInicial = Arrays.asList(new String[]{"Primeira linha", "Segunda linha", "Terceira linha", Integer.toString(8)});
        // Adiciona conteúdo no início do arquivo (substitui o conteúdo que existir previamente)
        Files.write(novoArquivo, textoInicial, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        List<String> textoSecundário = Arrays.asList(new String[]{"Nova Primeira linha", "Nova Segunda linha"});
        Files.write(novoArquivo, textoSecundário, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        // Adiciona conteúdo no final do arquivo
        Files.write(novoArquivo, textoInicial, StandardCharsets.UTF_8, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        
        //Lendo arquivos
        List<String> arquivoLido = Files.readAllLines(novoArquivo, StandardCharsets.UTF_8);
        System.out.println(arquivoLido);
        BasicFileAttributes dadosArquivo = Files.readAttributes(novoArquivo, BasicFileAttributes.class);
        System.out.println("Tamanho do arquivo: "+dadosArquivo.size()+"B\n"+"Modificado em: "+dadosArquivo.lastModifiedTime());
        Double numero = Double.parseDouble("8.54");
        String numeroString = Integer.toString(8);
        // Existem os métodos Files.newBufferedReader(Path path) e Files.newBufferedWriter(Path path) para ler/escrever arquivos de forma mais eficiente
        // Esses métodos são indicados ao trabalhar com arquivos extensos
        */
        //Exercício
        //Crie um subprograma (função) que peça para o usuário o nome de 5 alunos e 3 notas para cada aluno
        //     e que depois salve esses dados em um arquivo (notas.txt).
        //Crie um subprograma (função) que leia o primeiro arquivo,
        //     que computa a média de cada aluno e se o mesmo foi aprovado/reprovado (média >= 6 é aprovado),
        //     e que salve o nome de cada aluno, a média e se este foi aprovado ou não em um novo arquivo (medias.txt).
        //Crie um subprograma (função) que leia o segundo arquivo e cria dois novos arquivos,
        //     um arquivo com o nome dos alunos aprovados (aprovados.txt)
        //     e um arquivo com o nome dos alunso reprovados (reprovados.txt)
        //     criar um arquivo vazio caso não tenha nenhum aluno em alguma das sistuações.
        //Crie um programa que execute cada um dos subprogramas criados.

    }

    public static void guardarNotas() throws IOException{
        Path arquivo = Paths.get("./src/persistencia_dados/exercicio/notas.txt");
        Scanner leitor = new Scanner(System.in);
        List<String> alunos = new ArrayList<String>();
        for (int i = 0; i < 2; i++){
            alunos = new ArrayList<String>();
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            alunos.add(leitor.nextLine());
            for (int j = 0; j < 3; j++){
                System.out.print("Digite a nota "+ (j+1) +" do aluno " + alunos.get(0) + ": ");
                alunos.add(leitor.nextLine());
            }
            Files.write(arquivo, alunos, StandardCharsets.UTF_8, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        }
        leitor.close();        
    }

    public static void computarMedias() throws IOException{
        Path arquivoNotas = Paths.get("./src/persistencia_dados/exercicio/notas.txt");
        List<String> alunos = Files.readAllLines(arquivoNotas);
        List<String> nomes = new ArrayList<String>();
        List<Double> medias = new ArrayList<Double>();
        for (int i = 0; i < alunos.size(); i += 3){
            nomes.add(alunos.get(i));     
            Double media = 0.0;
            for (int j = 0; j < 3; j ++){
                media += Double.parseDouble(alunos.get(i+j+1));
            }
            medias.add(media/3);
        }
        List<String> conteudo = new ArrayList<String>();
        for (int i = 0; i < 2; i++){
            conteudo.add(nomes.get(i));     
            conteudo.add(medias.get(i).toString());
            if (medias.get(i) >= 6.0)
                conteudo.add("Aprovado");
            else
                conteudo.add("Reprovado");
        }
        Path arquivoMedias = Paths.get("./src/persistencia_dados/exercicio/medias.txt");
        Files.write(arquivoMedias, conteudo, StandardCharsets.UTF_8, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
         
        
    }
}