public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Kaléb", 100);
        Mago mago = new Mago("mãe", 80);
        Arqueiro arqueiro = new Arqueiro("pai", 90);
        
        TorreDeDefesa torrededefesa = new TorreDeDefesa("vó");

        Armadilhas espinhos = new Armadilhas("o irmao colocou Espinhos no Chao", 10);

        System.out.println("--- INICIO DA AVENTURA ---");
        
        guerreiro.atacar(mago);
        System.out.println();
        arqueiro.atacar(guerreiro);
        System.out.println();
        torrededefesa.atacar(arqueiro);
        System.out.println();
        mago.atacar(guerreiro);
       
        System.out.println();
        espinhos.ativar(guerreiro);

        System.out.println("\n+-+-+-+-+-FIM-+-+-+-+-+-+");
    }
}