public class Mago extends Personagem implements Atacante {

    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " lançou uma magia e chineladas em " + alvo.getNome() + "!");
        alvo.receberDano(20);
    }
}