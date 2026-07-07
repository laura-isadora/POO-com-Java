package Livraria.models;

public class Livro {
    private String nome;
    private String autor;
    private int quantidade;

    public Livro(String nome, String autor, int quantidade){
        this.nome= nome;
        this.autor = autor;
        this.quantidade = quantidade;
    }// ao instanciar Livro esses atributos devem ser definidos


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public String getAutor() {
        return autor;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
