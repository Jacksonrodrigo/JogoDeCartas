package jogoDeCartas.model;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
    private int qtdBaralhos;
    private List<Carta> cartas;

    public Baralho(int qtdBaralhos) {
        this.qtdBaralhos = qtdBaralhos;
        this.cartas = new ArrayList<>();
        for( int rodada = 0; rodada < qtdBaralhos; rodada++) {
            for (int v = 1; v <= 13; v++) {
                cartas.add(new CartaOuro(v));
                cartas.add(new CartaPaus(v));
                cartas.add(new CartaCopas(v));
                cartas.add(new CartaEspada(v));
            }
            cartas.add(new Coringa());
            cartas.add(new Coringa());

        }

    }
    public void mostraCartas() {
        for(int i = 0; i < cartas.size();i++) {
            System.out.println(cartas.get(i).getDescricao());
        }
    }
    public boolean temCarta() {

        //return this.cartas.size() != 0;
        if( this.cartas.size() != 0) {
            return true;
        } else {
            return false;
        }

    }

    public Carta comprar() {
        Carta retorno = null;
        if (temCarta()) {
            retorno = this.cartas.remove(0);
        }
        return retorno;
    }
}
