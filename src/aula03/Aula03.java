package aula03;

public class Aula03 {
    public static void main(String[] args) {
        //instanciar o objeto:
        Caneta c1 =  new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        // os métodos são públicos e por isso permite acessar mesmo com a propriedade tampada sendo privada
    }
}