package aula11;

public class Aluno extends Pessoa {//herança para diferença
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno"+ this.nome);
    }//ALuno pode usar os atributos de Pessoa por ser uma classe filha e os atributos serem protegidos

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
