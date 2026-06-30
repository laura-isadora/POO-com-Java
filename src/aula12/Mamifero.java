package aula12;

public class Mamifero extends Animal {

    private String corPelo;

    //quando houver métodos abstratos na classe mãe, é obrigatório desenvolver esses métodos nas classes filhas
    @Override // sobreposição
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

        //getters e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
