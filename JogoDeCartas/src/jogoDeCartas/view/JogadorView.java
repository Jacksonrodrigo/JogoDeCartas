package jogoDeCartas.view;

import controller.JogoController;
import jogoDeCartas.model.Jogador;

import java.util.Scanner;

public class JogadorView {
    private JogoController controller;

    public JogadorView(JogoController controller) {
        this.controller  = controller;
    }
    public void mostraMao(Jogador jog) {
        System.out.println(jog.toString());
        Scanner scan = new Scanner(System.in);
        System.out.println("pressione enter para continuar");
        scan.next();
    }
    public void escolheCartaDescartar(Jogador jog) {
        for (int i  = 0; i < jog.getMao().size(); i++) {
            System.out.println((i+1)+" - "+jog.getMao().get(i).getDescricao());
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual carta a descartar?");
        int resp = 0;
        do {
            resp = scan.nextInt();
        } while (resp < 1 || resp > jog.getMao().size());
        controller.escolhaDescarteJogador(resp);
    }
}
