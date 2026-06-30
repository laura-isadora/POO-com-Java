package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        
        //sobreposição
        l.emitirSom();
        c.emitirSom();
        

        //sobrecarga
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
