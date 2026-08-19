public class Personagem {
    
            String nome;
            int nivel;
            int vida;
            int forca;
        

        void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        }
        void atacar(Personagem alvo) {
        alvo.vida = alvo.vida - forca;
        System.out.println(nome + " atacou" + alvo.nome);
        }
        void curar() {
        vida = vida + 20;
        System.out.println(nome + " recupero 20 de vide");
    }

}