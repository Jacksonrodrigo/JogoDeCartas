package jogoDeCartas.view;

import controller.JogoController;
import jogoDeCartas.model.Lixo;

import java.util.Scanner;

public class JogoView {
    private JogoController controller;

    public JogoView(JogoController controller) {
        this.controller  = controller;
    }

    public void mostraLixo(Lixo lixo) {
        System.out.println("L I X O");
        System.out.println("+++++++");
        if (lixo.estaVazio()) {
            System.out.println(" VAZIO NO MOMENTO");
        } else {
            //System.out.println("a carta é surpresa");
            System.out.println(lixo.cartaDeCima().getDescricao());
        }
    }
    public void ondeComprar() {
        System.out.println("Você quer comprar do (1)baralho ou do (2) Lixo ?");
        int resp = 0;
        Scanner scan = new Scanner(System.in);
        do {
            resp = scan.nextInt();
        }while (resp<1 || resp > 2);
        controller.escolhaCompraJogador(resp);

    }
}

