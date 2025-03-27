package Exercicio6;

public class Contato {
    private String nome;
    private String telefone;


    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;

    }

    String getNome(){
        return this.nome;
    }
    String getNumero(){
        return this.telefone;
    }    
}
