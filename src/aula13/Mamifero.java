package aula13;

public class Mamifero extends Animal{

    @Override //polimorfismo de sobraposição (mesma assinatura dos métodos em classes diferentes)
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

}
