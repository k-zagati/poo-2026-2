public class Main {

    public static void main(String[] args) {

       Personagem guerreiro = new Personagem ();
       guerreiro.nome = "kaleb";
       guerreiro.vida = 1000;
       guerreiro.forca = 25;
       guerreiro.nivel = 15;

       Personagem monstro = new Personagem ();
       monstro.nome = "Valter";
       monstro.vida = 2000;
       monstro.forca = 50;
       monstro.nivel = 30;

       Personagem heroi = new Personagem ();
       heroi.nome = "mãe";
       heroi.vida = 9999;
       heroi.forca = 1925;
       heroi.nivel = 9999;

       guerreiro.exibirStatus();
       guerreiro.atacar(monstro);
       monstro.exibirStatus();
       monstro.atacar(guerreiro);
       monstro.atacar(guerreiro);
       monstro.exibirStatus();
       guerreiro.atacar(monstro);
       guerreiro.atacar(monstro);
       monstro.exibirStatus();
       guerreiro.curar();
       guerreiro.exibirStatus();
       heiro.atacar(monstro);
       
       

   }
}