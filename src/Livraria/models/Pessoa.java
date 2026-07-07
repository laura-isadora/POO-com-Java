package Livraria.models;

public class Pessoa {
    private String nome;
    private int id;

    public Pessoa(String nome, int id){
        this.nome = nome;
        this.id = id;
    }// ao instanciar Pessoa esses atributos devem ser definidos


    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }


}
