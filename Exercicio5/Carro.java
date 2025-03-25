package Exercicio5;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade = 0;
    private int placa;
    
    public Carro(String marca, String modelo, int ano, int placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
 
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public float getVelocidade(){
        return velocidade;
    }

    public void acelerar(int aumenta){
        this.velocidade += aumenta; 
        System.out.println("Velocidade atual: " + velocidade);
    }
        
    public void frear(float diminuir){
        if(diminuir > velocidade){
            velocidade = 0;
            return;
        }
        this.velocidade -= diminuir;
        
    }  
            
}
        


    


