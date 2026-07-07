package Livraria.service;

import Livraria.models.Emprestimo;
import Livraria.models.Livro;

public class LivroService implements ILivroService {

    @Override // verifica se tem estoque de livros disponíveis para empréstimo
    public boolean disponivel(Livro livro) {
        
        if(livro.getQuantidade() > 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void emprestarLivro(Livro livro, Emprestimo emprestimo) {//tentar imprimir mensagem diretamente no main depois
        if (disponivel(livro)) {// se o livro estiver disponivel diminui a quantidade
            livro.setQuantidade(livro.getQuantidade()-1);
            emprestimo.setLivro(livro);
            System.out.println("Livro emprestado com sucesso.");
        }else{
            System.out.println("Não há cópias desse livro.");
        }
        
    }

    @Override
    public void devolverLivro(Livro livro) {
        livro.setQuantidade(livro.getQuantidade() +1);
        System.out.println("Livro devolvido com sucesso.");
    }


}
