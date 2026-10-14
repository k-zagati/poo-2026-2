public class Main { 
    public static void main(String[] args) { 
        Mago mago = new Mago("Merlin"); 
        Guerreiro guerreiro = new Guerreiro("Kaleb"); 
        Arqueiro arqueiro = new Arqueiro("Mãe"); 

        mago.atacar(); 
        guerreiro.atacar(); 
        arqueiro.atacar(); 
    } 
}