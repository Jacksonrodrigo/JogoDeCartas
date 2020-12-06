import controller.JogoController;
import jogoDeCartas.view.JogadorView;
import jogoDeCartas.view.JogoView;
import jogoDeCartas.model.Baralho;
import jogoDeCartas.model.Jogador;
import jogoDeCartas.model.Lixo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JogoController controller =  new JogoController();
        controller.preJogo();
        controller.iniciaRodada();

    }
}