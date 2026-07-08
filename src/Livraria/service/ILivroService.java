package Livraria.service;

import Livraria.models.Livro;
import Livraria.models.Pessoa;

public interface ILivroService {
    public boolean disponivel(Livro livro);
    public void emprestarLivro(Livro livro, Pessoa leitor);
    public void devolverLivro(Livro livro);
}
