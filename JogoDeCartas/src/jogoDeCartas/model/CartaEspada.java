package jogoDeCartas.model;

public class CartaEspada extends Carta{

    public CartaEspada(int valor) {
        this.valor = valor;
    }
    @Override
    public String getNaipe() {
        return " de Espada";
    }
}

