package Exercicio7;

import java.util.Random;

public class Produto {
  Random random = new Random();
  
  String nome;
  private int sku = 100000 + random.nextInt(999999);
  private float preco;
  private int qtdEstoque;


  Produto(String nome, float preco, int qtdEstoque){
    this.nome = nome;
    this.preco = preco;
    this.qtdEstoque = qtdEstoque;
  }

  public void diminuiEstoque(int num){
    this.qtdEstoque -= num;
  }

  public int getSku() {
    return sku;
  }

  public float getPreco() {
    return preco;
  }
  public int getQtdEstoque() {
    return qtdEstoque;
  }

  public String getNome() {
    return nome;
  }

  
}
