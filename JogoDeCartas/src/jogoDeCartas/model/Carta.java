package jogoDeCartas.model;

public abstract class Carta {

    protected int valor;

    public  String getDescricao(){
        return getNomeValor()+getNaipe();
    };
    public abstract String getNaipe();

    protected String getNomeValor() {
        String retorno = "";
        if (this.valor>=2 && this.valor <=10) {
            retorno = this.valor+"";
        } else {
            switch (this.valor) {
                case 1: retorno = "Ás"; break;
                case 11: retorno = "Valete"; break;
                case 12: retorno = "Dama"; break;
                case 13: retorno = "Rei"; break;

            }
        }
        return retorno;
    }
    @Override
    public String toString() {
        return getDescricao();
    }
}
