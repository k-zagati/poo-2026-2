public class Main {
    public static void main(String[] args) {

        Arma espada = new Arma("Espada de Fogo Flamejante", 35);

        Personagem guerreiro = new Personagem("Kaleb", 25, 1000, 15);
        Personagem monstro = new Personagem("Valter", 50, 2000, 30);
        Personagem heroi = new Personagem("Mãe", 1925, 9999, 9999);

        guerreiro.equipar(espada);

        guerreiro.exibirStatus();
        monstro.exibirStatus();
        heroi.exibirStatus();

        guerreiro.atacar(monstro);

        monstro.atacar(guerreiro);
        monstro.atacar(guerreiro);

        guerreiro.curar();

        heroi.atacar(monstro);

        monstro.exibirStatus();
    }
}
