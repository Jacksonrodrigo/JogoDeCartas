package jogoDeCartas.model;

import java.util.ArrayList;
import java.util.List;

public class Lixo {
    private List<Carta> descartes;

    public Lixo() {
        this.descartes = new ArrayList<>();
    }

    public void recebeDescarte(Carta carta) {
        this.descartes.add(carta);
    }

    public Carta cartaDeCima() {
        return this.descartes.get(this.descartes.size()-1);
    }
    public Carta comprarCartaDeCima() {
        return this.descartes.remove(this.descartes.size()-1);
    }
    public boolean estaVazio() {
        return this.descartes.size() == 0;
    }
}