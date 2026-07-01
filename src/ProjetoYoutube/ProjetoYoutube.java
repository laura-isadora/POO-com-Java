package ProjetoYoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Aluno a[] = new Aluno[2];
        a[1] = new Aluno("João", 31, "M", "joazinho");
        a[0] = new Aluno("Creuza", 22, "F", "creuzita");

        Visualizacao vis = new Visualizacao(a[1], v[2]);
        //os atributos de Visualizacao (espectador e filme) são instâncias de outras classe.. isso se chama agregação
        System.out.println(vis.toString());

        // System.out.println("VÍDEOS\n----------------------------------------");
        // System.out.println(v[0].toString());
        // System.out.println(a[1].toString());
        // System.out.println(v[2].toString());
        // System.out.println("\nALUNOS\n----------------------------------------");
        // System.out.println(a[0].toString());
        // System.out.println(a[1].toString());
    }
}
