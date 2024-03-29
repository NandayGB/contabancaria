package conta.model;

public abstract class conta {
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    public conta(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if (this.saldo < valor)
            return false;

        this.setSaldo(this.saldo - valor);
        return true;
    }

    public void depositar(float valor) {
        this.setSaldo(this.saldo + valor);
    }

    public void visualizar() {
        String tipoConta = "";
        switch (tipo) {
            case 1:
                tipoConta = "Conta Corrente";
                break;
            case 2:
                tipoConta = "Conta Poupança";
                break;
        }

        System.out.println("**************************");
        System.out.println("Bem vindo ao Banco Nanbank");
        System.out.println("Dados da conta");
        System.out.println("**************************");
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Agência da conta: " + this.agencia);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Titular da conta: " + this.titular);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("**************************");
    }
}
