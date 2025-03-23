import java.util.Random;

public class ContaBancaria {

    private int numeroConta;
    private String nome;
    private float saldo;
    private String cpf;

    public ContaBancaria(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;

        Random gerador = new Random();

        this.numeroConta = gerador.nextInt();
    }

    public float saque(float valor, float tirar){
        float resultado = valor - tirar;
        return resultado;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;  
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    
   


}
