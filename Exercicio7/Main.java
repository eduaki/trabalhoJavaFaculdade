package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int optHome;

    ArrayList<Produto> estoque = new ArrayList<>();

    do{
      System.out.println("\n---------------------------");
      System.out.println("Controle de estoque: \n");
      System.out.println("[1] Ver produtos em estoque");
      System.out.println("[2] Adicionar produtos");
      System.out.println("[3] Remover do estoque");
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
        /// remover item do estoque
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
