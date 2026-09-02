public class Personagem {

            private String nome;
            private int nivel;
            private int vida;
            private int forca;

            Arma arma;

        public Personagem(String nome, int forca, int vida, int nivel){
        this.nome = nome;
        this.forca = forca;
        this.vida = vida;
        this.nivel = nivel;
        }

        void exibirStatus() {
        System.out.println("=====STATUS===="); 
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("---------------");
        }
        void atacar(Personagem alvo) {

            int dano = forca;
            if (arma != null) {
            dano += arma.getDano();
        }
        alvo.vida = alvo.vida - forca;
        System.out.println(nome + " atacou" + alvo.nome);
        }
        void curar() {
        vida = vida + 20;
        System.out.println(nome + " recupero 20 de vide");
        }
        public void equipar(Arma novaArma) {
        arma = novaArma;
        System.out.println(nome + " equipou " + novaArma.getNome());
        }

    
}
