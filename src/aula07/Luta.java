package aula07;

import java.util.Random;

public class Luta {
    // atributos
    private Lutador desafiado; // 'Lutador' é a classe (tipo). Esta variável guardará um objeto dessa classe.
    private Lutador desafiante; // Referência para outro objeto da classe Lutador.
    private int rounds;
    private boolean aprovada;


    //métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        //os lutadores tem que ser da mesma categoria e um lutador não pode desafiar a si mesmo
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            System.out.println("============= RESULTADO DA LUTA ============");

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2 
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //desafiado vence
                System.out.println(getDesafiado()+ " venceu!!!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                    break;
                case 2: //desafiante vence
                System.out.println(getDesafiante() +" venceu!!!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                    break;
            }
            System.out.println("===========================================");
        }else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    //getters e setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
