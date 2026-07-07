package Livraria.models;

public class Emprestimo {
    public Pessoa leitor;
    public Livro livro;

    public Emprestimo(Pessoa leitor, Livro livro){
        this.leitor = leitor;
        this.livro = livro;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

}
