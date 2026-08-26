public class Main {
    public static void main(String[] args) {

       
        personagem guerreiro = new personagem("kaleb", 100, 25, 2);
        personagem mago = new personagem("ooz", 1000, 30, 2);
        
       

        guerreiro.exibirStatus();
        mago.exibirStatus();
        guerreiro.atacar(mago);
        mago.atacar(guerreiro);
        guerreiro.curar();
        guerreiro.exibirStatus();
        mago.exibirStatus();
        mago.cegar(guerreiro);
        guerreiro.exibirStatus();
        guerreiro.curar();
        guerreiro.curar();
        guerreiro.exibirStatus();
    }
}