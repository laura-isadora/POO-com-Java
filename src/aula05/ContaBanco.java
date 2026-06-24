package aula05;

public class ContaBanco {

    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //método construtor:
    public ContaBanco(){
        saldo = 0;
    }

    //getters e setters:
    public void setNumConta(int n){
        numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
        tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean st){
        status = st;
    }
    public boolean getStatus(){
        return status;
    }


    //métodos
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (tipo == "CC"){
            saldo = 50;
        }else if( tipo == "CP"){
            setSaldo(150);
        }
    }

    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta possui saldo.");
        }if(saldo < 0){
            System.out.println("Conta em débito!");
        }else setStatus(false);
    }

    public void depositar(float v){
        if(status == true) {
            setSaldo(getSaldo()+ v);
        }else System.out.println("Impossível depositar.");
    }
    public void sacar(float v){
        if(status == true){
            if(saldo > v){
                saldo = saldo - v;
            }else System.out.println("Saldo insuficiente.");
        }else System.out.println("Impossível sacar.");
    }
    public void pagarMensal(){}

}
