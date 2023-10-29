package calculadora;

import calculadora.operacoes.Operacao;
import calculadora.operacoes.Soma;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
        /*Operacao soma = new Soma();
        double x = 3.5, y = 7.43598374;
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y));
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y, 5));
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y, 5));
        */
    }

    @Override
    public void start(Stage janelaPrincipal) throws Exception {
        janelaPrincipal.setTitle("Título da Janela");
        Button botao = new Button("Me clique");
        botao.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Clicou no botão");
            }
            
        });

        StackPane raiz = new StackPane();
        raiz.getChildren().addAll(botao);
        janelaPrincipal.setScene(new Scene(raiz, 400, 400));
        janelaPrincipal.show();
    }
}