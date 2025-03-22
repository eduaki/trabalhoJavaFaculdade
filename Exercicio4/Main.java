package Exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //// gerenciador de perfis de jogadores
    Scanner leitor = new Scanner(System.in);

    ArrayList<Jogador> listaJogadores = new ArrayList<>();
    
    int optMenu;

    do{

      System.out.println("\n---------------------------");
      System.out.println("Perfil de jogadores!!\n");

      System.out.println("[1] Adicionar jogador");
      System.out.println("[2] Ver jogadores");
      System.out.println("[0] sair\n");

      System.out.print("Opção: ");
      optMenu = leitor.nextInt();

      leitor.nextLine();

      switch(optMenu){
        case 1: 
        System.out.println("\n---------------------------");
        System.out.println("Vamos adicionar um novo jogador!!\n");
        System.out.print("digite seu nome: ");
        String nome = leitor.nextLine();
        
        listaJogadores.add(new Jogador(nome));
        System.out.println("\n---------------------------");
        System.out.println("\nJogador adicionado com sucesso! ");
        System.out.println("Nome: " + listaJogadores.get(listaJogadores.size()-1).nome);
        System.out.println("Pontuação incial: " + listaJogadores.get(listaJogadores.size()-1).verPontos());
        System.out.print("Nivel atual: " + listaJogadores.get(listaJogadores.size()-1).verlevel());
        
        System.out.println("\n---------------------------");

        break;
        case 2:
        System.out.println("\n---------------------------");
        System.out.println("Jogadores cadastrados: ");

        for(int i = 0; i < listaJogadores.size(); i++){
          System.out.println("[" + (i+1) + "] - " + listaJogadores.get(i).nome);
        }
        System.out.print("selecionar jogador pelo ID: ");
        int id = leitor.nextInt();
        
        System.out.println("\n---------------------------");
        System.out.println("O que gostaria de fazer?");
        System.out.println("[1] Ver informações do jogador");
        System.out.println("[2] Adicionar pontos");
        System.out.println("[0] voltar\n");
        
        System.out.print("Opção: ");
        int optMenuJogador = leitor.nextInt();

        switch(optMenuJogador){
          case 1:
          listaJogadores.get(id-1).exibirInfo();
          break;
          case 2:
          System.out.print("quantidade de pontos que gostaria de adicionar: ");
          int qtdpts = leitor.nextInt();
          listaJogadores.get(id-1).ptsUp(qtdpts);
          System.out.println("Pontuação atualizada com sucesso!!! \n[veja a infomação atualizada nas informações do jogador]");
          listaJogadores.get(id-1).levelUp();
          break;
          case 0:
          System.out.println("\nVoltando...");
          break;
          default:
          System.out.println("\nERRO: Escolha uma opção  valida");
          break;
        }

        break;
        case 0: 
        System.out.println("\nSaindo...");
        break;
        default:
        System.out.println("\nERRO: Escolha uma opção  valida");
        break;
      }


    }while(optMenu != 0);

    leitor.close();

  }

}
