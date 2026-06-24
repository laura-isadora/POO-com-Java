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
        this.setSaldo(0);
        this.setStatus(false);
    } //toda vez que eu instanciar um objeto ele já vai inicializar com esses valores/atrbutos
    //construtor também não declara nenhum tipo de retorno

    //getters e setters:
    public void setNumConta(int n){
        this.numConta = n; // "this.numConta" é o atributo da classe lá em cima
        // "n" é o parâmetro que acabou de entrar no método
        // 'this' também serve para diferenciar o atributo da classe do parâmetro do método, caso tenham nomes iguaos
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    public boolean getStatus(){
        return status;
    }


    //métodos personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    } //ao abrir Cc recebe 50,00 e Cp recebe 150,00

    //para fechar conta não pode ter saldo e nem estar devendo
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta possui saldo.");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    //para depositar a conta deve estra ativa
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+ this.getDono());
        } else {
            System.out.println("Impossível depositar.");
        }
    }

    //para sacar é preciso ter saldo e a conta estar ativa
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            } else{
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar. Conta fechada.");
        }
    }

    // taxa cobrada de CC: 12,00 e CP: 20,00
    //só será cobrado se houver saldo e estiver ativo
    public void pagarMensal() {
        float v = 0.0f;
        if (this.getTipo() == "CC") {
            v = 12.0f;
        } else if(this.getTipo() == "CP"){
            v = 20.0f;
        }
        if (this.getStatus()){
            if(saldo > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso");
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossível pagar, conta desativada.");
        }
    }

    public void estadoAtual(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
}