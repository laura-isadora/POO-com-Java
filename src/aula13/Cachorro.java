package aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() { //polimorfismo de sobraposição (mesma assinatura dos métodos em classes diferentes)
        System.out.println("Au! Au! Au!");
    }
    
    // Polimorfismo de sobrecarga do método reagir... depende da frase que for dita
    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    // Sobrecarga do método reagir.. depende da hora
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    
    // Sobrecarga do método reagir .. se for o dono
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    }
    
    // Sobrecarga do método reagir.. Idade e Peso
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}