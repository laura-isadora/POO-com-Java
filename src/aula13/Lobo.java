package aula13;

public class Lobo extends Mamifero {
    
    @Override
    public void emitirSom() {//polimorfismo de sobraposição (mesma assinatura dos métodos em classes diferentes)
        System.out.println("Auuuuuuuuuuuuuuuuu!");
    }
}