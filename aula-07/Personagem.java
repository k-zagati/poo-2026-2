public class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vida);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}