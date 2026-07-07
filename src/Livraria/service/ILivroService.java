package Livraria.service;

import Livraria.models.Emprestimo;
import Livraria.models.Livro;

public interface ILivroService {
    public boolean disponivel(Livro livro);
    public void emprestarLivro(Livro livro, Emprestimo emprestimo);
    public void devolverLivro(Livro livro);
}
