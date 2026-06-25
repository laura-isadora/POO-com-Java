package aula06;

public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    private int getVolume(){
        return volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private boolean getTocando(){
        return tocando;
    }

        //sobrescrevendo métodos
    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0 ){
            this.setVolume(0);
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() +1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() -1);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + (this.getLigado() ? "SIM" : "NÃO"));
        System.out.println("Está tocando? " + (this.getTocando() ? "SIM" : "NÃO"));
        System.out.print("Volume: " + this.getVolume() + " ");
        
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println();
        System.out.println("------------------------------");
    }
}
