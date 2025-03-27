package Exercicio6;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);


        int opt;

        do{

            System.out.println("[1] Adicionar contado.");
            System.out.println("[2] Remover contato.");
            System.out.println("[3] Buscar contato.");
            System.out.println("[0] Sair.");
            opt = leitor.nextInt();

            leitor.nextLine();

            switch (opt) {
                case 1:

                    System.out.print("Nome do contato: ");
                    String nome = leitor.nextLine();
                    System.out.print("Número do contato: ");
                    String numero = leitor.nextLine();

                    System.out.println("----------------------");
                    Agenda.adicionar(nome, numero);    
                    break;
                case 2:
                    System.out.println("Nome do contato para remover: ");
                    String contato = leitor.nextLine();

                    System.out.println("----------------------");
                    Agenda.remover(contato);
                    System.out.println("----------------------");

                    break;
                case 3:
                    System.out.println("Nome do contato que deseja buscar: ");
                    String busca= leitor.nextLine();

                    System.out.println("----------------------");
                    Agenda.busca(busca);
                    System.out.println("----------------------");

                    break;
                case 0:
                ///sair do menu
                break;
                default:
                    System.out.println("Escolha uma opção válida");
                    break;
            }
            
        }while(opt != 0);
        leitor.close();
    }
    
}
