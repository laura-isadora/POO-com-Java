package aula11;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.nome);
    }

    @Override //mesmo método de Aluno, mas sobreposto
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista. Pagamento facilitado.");
    }
}
