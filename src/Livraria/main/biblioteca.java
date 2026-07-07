package Livraria.main;

import Livraria.models.Emprestimo;
import Livraria.models.Livro;
import Livraria.models.Pessoa;

public class biblioteca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("MARIA SILVA", 789456);
        Livro l1 = new Livro("Código Limpo", "ROBERT C. MARTIN", 5);
        Emprestimo e1 = new Emprestimo(p1, l1);
        System.out.println(e1.getLivro());
    }
}
