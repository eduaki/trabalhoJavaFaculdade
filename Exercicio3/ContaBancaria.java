package Exercicio3;
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

        this.numeroConta = 1000 + gerador.nextInt(9999);
    }
    public void saque(float tirar){
        this.saldo -= tirar;

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
    public void deposito(float valor){

        this.saldo += valor;
        System.out.println("Saldo atual: " + saldo);
    }

    
   


}
