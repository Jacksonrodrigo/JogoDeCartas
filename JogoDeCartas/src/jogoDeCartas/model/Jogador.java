package jogoDeCartas.model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Jogador: "+this.nome+"\n"+this.mao;
    }
    public void recebeCarta(Carta carta) {
        this.mao.add(carta);
    }
    public Carta descartar(int carta) {
        return this.mao.remove(carta);
    }
    public List<Carta> getMao() {
        return this.mao;
    }

    public String getNome(){
        return  this.nome;
    }
}