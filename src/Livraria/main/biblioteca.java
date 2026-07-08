package Livraria.main;

import Livraria.models.Livro;
import Livraria.models.Pessoa;
import Livraria.service.ILivroService;
import Livraria.service.LivroService;

public class biblioteca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("MARIA SILVA", 789456);
        Livro l1 = new Livro("Código Limpo", "ROBERT C. MARTIN", 5);
        ILivroService livroService = new LivroService();
        livroService.emprestarLivro(l1, p1);

        Pessoa p2 = new Pessoa("JOSÉ RODRIGUES", 123456);
        Livro l2 = new Livro("Entendendo Algoritmos", "ADITYA Y. BHARGAVA", 1);
        livroService.emprestarLivro(l2, p2);

        livroService.emprestarLivro(l2, p1);
    }
}
