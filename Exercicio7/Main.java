package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  /// sistema basico de controle de estoque de mercado
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int optHome;

    ArrayList<Produto> estoque = new ArrayList<>();

    do{
      System.out.println("\n---------------------------");
      System.out.println("Controle de estoque: \n");
      System.out.println("[1] Ver produtos em estoque");
      System.out.println("[2] Adicionar produtos");
      System.out.println("[3] Reduzir estoque");
      System.out.println("[4] Aumentar estoque");
      System.out.println("[0] Sair");

      System.out.print("opção: ");
      optHome = leitor.nextInt();

      switch(optHome){
        case 1:
        System.out.println("Produtos no estoque: ");
        if(estoque.isEmpty()){
          System.out.println("nenhum produto em estoque!!");
        }
        for(int i = 0; i< estoque.size(); i++){
          System.out.println("\n---------------------------");
          System.out.println("[" + (i+1) + "] - " + estoque.get(i).getNome() + "(" + estoque.get(i).getSku()+ ")");
          System.out.println("\tPreço: R$" + estoque.get(i).getPreco());
          System.out.println("\tQuantidade estoque: " + estoque.get(i).getQtdEstoque());
        }
        break;
        case 2:
        System.out.println("Adicionar novo item ao estoque!\n");
        leitor.nextLine(); 
        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Preço: R$");
        float preco = leitor.nextFloat();

        System.out.print("Quantidade no estoque: ");
        int qtdEstoque = leitor.nextInt();

        estoque.add(new Produto(nome, preco, qtdEstoque));

        System.out.println("\nProduto adicionado com sucesso!!!");
        break;
        case 3: 
        for(int i = 0; i< estoque.size(); i++){
          System.out.println("\n---------------------------");
          System.out.println("[" + (i+1) + "] - " + estoque.get(i).getNome() + "(" + estoque.get(i).getSku()+ ")");
          System.out.println("\tPreço: R$" + estoque.get(i).getPreco());
          System.out.println("\tQuantidade estoque: " + estoque.get(i).getQtdEstoque());
        }
        System.out.print("Produto que gostaria de reduzir: ");
        int item = (leitor.nextInt() - 1);

        if(estoque.size() < item + 1){
          System.out.println("\nERRO: Escolha um produto existente!!");
          break;
        }

        leitor.nextLine();

        System.out.print("quantidade que gostaria de reduzir: ");
        int qtdItem = leitor.nextInt();
        leitor.nextLine();
        if(estoque.get(item).getQtdEstoque() < qtdItem){
          System.out.println("Você não pode remover mais itens do que tem no estoque!");
          break;
        }
        
        estoque.get(item).diminuiEstoque(qtdItem);
        break;
        
        case 4: 
        for(int i = 0; i< estoque.size(); i++){
          System.out.println("\n---------------------------");
          System.out.println("[" + (i+1) + "] - " + estoque.get(i).getNome() + "(" + estoque.get(i).getSku()+ ")");
          System.out.println("\tPreço: R$" + estoque.get(i).getPreco());
          System.out.println("\tQuantidade estoque: " + estoque.get(i).getQtdEstoque());
        }
        System.out.print("Produto que gostaria de adicionar: ");
        int itemAumenta = (leitor.nextInt() - 1);

        leitor.nextLine();

        System.out.print("quantidade que gostaria de adicionar: ");
        int qtdItemAumenta = leitor.nextInt();
        leitor.nextLine();
        
        estoque.get(itemAumenta).aumentaEstoque(qtdItemAumenta);

        break;
        case 0: 
        System.out.println("Saindo...");
        break;
        default:
        System.out.println("Digite uma opção valida!");
        break;
      }

    }while(optHome != 0);

    
    leitor.close();
  }
  
}
