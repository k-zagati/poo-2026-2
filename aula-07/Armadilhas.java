public class Armadilhas {
    private String tipo;
    private int dano;

    public Armadilhas(String tipo, int dano) {
        this.tipo = tipo;
        this.dano = dano;
    }

    public void ativar(Personagem personagem) {
        System.out.println("CUIDADO! " + personagem.getNome() + " caiu na armadilha que " + this.tipo + "!");
        personagem.receberDano(this.dano);
    }
}