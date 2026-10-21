public class Arqueiro extends Personagem implements Atacante {

    public Arqueiro(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " disparou uma agua e pano em " + alvo.getNome() + "!");
        alvo.receberDano(18);
    }
}