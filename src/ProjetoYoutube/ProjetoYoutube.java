package ProjetoYoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Creuza", 22, "M", "creuzita");

        System.out.println(v[0].toString());
        System.out.println(a[0].toString());
    }
}
