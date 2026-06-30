package aula11;

public class Aula11 {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Marcos");
        a1.setCurso("Informatica");
        a1.setMatricula(11111);
        a1.setIdade(25);
        System.out.println(a1.toString());
        a1.pagarMensalidade();
    }
}
