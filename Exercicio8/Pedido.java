package Exercicio8;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pedido {
  String pizza;
  String endEntrega;
  int tamanho;
  float preco;
  boolean cancelado = false;

    /*
    * a função ArrayList eu achei com o GPT, não tava entendendo como ia fazer funcionar com array normal,
    * e achei bem interessante como ela funciona, bem util!!!
    */
    static ArrayList<Pedido> pedidos = new ArrayList<>(); 
    
      Pedido(String nomePizza, int tamanho, float preco, String endEntrega){
        this.pizza = nomePizza;
        this.tamanho = tamanho;
        this.preco = preco;
        this.endEntrega = endEntrega;
      }
    
      public static void Fazerpedido(String nomePizza, int tamanho, String endEntrega){
  
        System.out.println(tamanho);
        float valor = 0;
  
        switch(tamanho){
          case 4:
          valor = 19.99f;
          break;
          case 8:
          valor = 45.5f;
          break;
          case 16:
          valor = 65.5f;
          break;
  
          default: 
            System.out.println("\nERRO: escolha um tamanho valido de pizza");
          break;
        }
    
        pedidos.add(new Pedido(nomePizza, tamanho, valor, endEntrega));
        System.out.println("pedido finalizado!!");
      }
  
    public static void verPedidos(){
      System.out.println("Pedidos: ");
  
      if (pedidos.isEmpty()){
        System.out.println("\nNenhum pedido feito aqui!");
        return;
      }else{
        for(int i = 0; i < pedidos.size(); i++){
          System.out.println("\n-------------------------");
          System.out.println("\tPedido numero: "+ (i+1));
          
          System.out.println("\tSabor: "+ pedidos.get(i).pizza);
          System.out.println("\tTamanho: "+ pedidos.get(i).tamanho);
          System.out.println("\tPreço: "+ pedidos.get(i).preco);
          System.out.println("\tEndereço de entrega: "+ pedidos.get(i).endEntrega);
          System.out.println("\tStatus: " + (pedidos.get(i).cancelado ? "Cancelado" : "Aprovado"));
        }
      }
    }
  
    public static void cancelaPedido(int p){
      if (p >= 0 && p-1 < pedidos.size()) {
        pedidos.get(p-1).cancelado = true;
        System.out.println("\n------------------------");
        System.out.println("Pedido cancelado com sucesso!!");
      } else {
        System.out.println("ERRO: Pedido não encontrado!");
      }
    }

    public static void calculaMedia(){
      float soma = 0;
      float qtd = pedidos.size();

      for(int i = 0; i < pedidos.size(); i++){
        soma += pedidos.get(i).preco;
      }

      float media = soma/qtd;

      /*
       * achei no stackoverflow
       * esse trecho serve para deixar o valor da media em numeros decimais 
       */

      DecimalFormat decimal = new DecimalFormat("#.##");
      String mediaconvertida = decimal.format(media);

      System.out.println("\nForam feitos no total: " + pedidos.size() + " pedidos");
      System.out.println("Media de preço dos pedidos: R$" + mediaconvertida);
    }

}
