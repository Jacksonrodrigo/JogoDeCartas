package jogoDeCartas.model;

import jogoDeCartas.model.Carta;

public class Coringa extends Carta {

    public Coringa() {
        this.valor = 0;
    }
    @Override
    public String getNaipe() {
        return " @ ";
    }
}

