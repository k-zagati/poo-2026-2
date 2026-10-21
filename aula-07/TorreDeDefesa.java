
public class TorreDeDefesa implements Atacante { 
    private String local; 

    public TorreDeDefesa(String local){ 
        this.local = local; 
    } 

    // Adicionado o parâmetro 'alvo' para o método saber quem atacar eu acho
    @Override 
    public void atacar(Personagem alvo){ 
        System.out.println("vó" + this.local + " para de bater no " + alvo.getNome() + "!"); 
        alvo.receberDano(15); 
    } 
}

































