package Exercicio8;

import java.util.Scanner;

public class Main{
///// pizzaria
  public static void main(String[] args){

    Scanner leitor = new Scanner(System.in);
    
    Pizza[] menu = new Pizza[] {
    new Pizza("Calabresa", "molho de tomate, queijo mussarela, calabresa, oregano"),
    new Pizza("Mussarela", "molho de tomate, queijo mussarela, oregano"),
    new Pizza("Frango com catupiry", "molho de tomate, queijo mussarela, frango desfiado, catupiry, oregano"),
    new Pizza("Catupalha", "molho de tomate, queijo mussarela, frango desfiado, catupiry, batata palha, oregano"),
    new Pizza("Da casa", "molho de tomate, queijo mussarela, rucula, burrata fresca, tomate cereja, oregano")
    };

    int optHome;
    int optGerMenu;

    do{
      System.out.println("\n----------------------");

      System.out.println("\nQual Opção deseja?\n");

      System.out.println("[1] fazer pedido");
      System.out.println("[2] ver cardapio");
      System.out.println("[3] ver pedidos");
      System.out.println("[4] gerenciar pedidos");
      System.out.println("[0] sair");

      System.out.print("opção: ");
      optHome = leitor.nextInt();
      leitor.nextLine();

      System.out.println("\n----------------------");



      switch(optHome){
        case 1:
            System.out.println("Escolha o sabor da pizza: ");
            for(int i = 0; i < menu.length; i++){
              System.out.println("[" + i + "] "+ menu[i].nome);
            }
            int sabor = leitor.nextInt();
            leitor.nextLine();
            System.out.print("Tamhanho(4, 8, 16): ");
            int tamanho = leitor.nextInt();

            System.out.print("endereço de entrega: ");
            String endEntrega = leitor.nextLine();
            leitor.nextLine();

            Pedido.Fazerpedido(menu[sabor].nome, tamanho, endEntrega);
        break;
        case 2:
          for(int i = 0; i < menu.length; i++){
            System.out.println("\n----------------------");
            System.out.println(menu[i].nome);
            System.out.println("\t" + menu[i].ingredientes);
          }
        break;
        case 3:
        Pedido.verPedidos();
        break;
        case 4:

        Pedido.verPedidos();

        System.out.println("\nQual Opção deseja?\n");

        System.out.println("[1] Cancelar pedido");
        System.out.println("[2] Media dos valores dos pedidos");
        System.out.println("[0] Voltar");

          System.out.print("opção: ");
          optGerMenu = leitor.nextInt();
          leitor.nextLine();

          switch(optGerMenu){
            case 1:
            System.out.print("numero do pedido que gostaria de cancelar: ");
            int np = leitor.nextInt();
            Pedido.cancelaPedido(np);
            leitor.nextLine();
            break;
            case 2:
            Pedido.calculaMedia();
            break;
          }

        break;
        case 0:
        System.out.println("Volte sempre!!");
        break;
        default:
        System.out.println("escolha uma opção valida!!!");
      }

    }while(optHome != 0);


    leitor.close();
  }

}
