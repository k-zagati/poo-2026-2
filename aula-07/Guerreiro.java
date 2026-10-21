public class Guerreiro extends Personagem implements Atacante {

    public Guerreiro(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " atacou " + alvo.getNome() + " com a agua");
        alvo.receberDano(15);
    }
}