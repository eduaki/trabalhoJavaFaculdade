package Exercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static float saldo = 0;
        public static void main(String[] args){
            /// Sistema bancário simples.
            Scanner leitor = new Scanner(System.in);
    
            HashMap<String, ContaBancaria> cadastros = new HashMap<>();
    
            int opt;
            int optmenu;
    
            do{
    
                System.out.println("[1] entrar na conta");
                System.out.println("[2] Criar conta");
                System.out.println("[0] Sair");
                opt = leitor.nextInt();
                


                switch (opt) {
                    case 1:
                    leitor.nextLine();
                    System.out.print("informe o cpf: ");
                    String cpf = leitor.nextLine();

                    ContaBancaria conta = cadastros.get(cpf);

                    if(conta == null){
                        System.out.println("A conta NÃO existe.");
                        break;
                    }
                    do{

                        System.out.println("-----------------------------");
                        System.out.println("[1] Saldo");
                        System.out.println("[2] Saque");
                        System.out.println("[3] Depósito");
                        System.out.println("[0] Sair");
                        System.out.print("Opção: ");
                        optmenu = leitor.nextInt();


                        switch (optmenu) {
                            case 1:
                                System.out.println("Saldo atual: " + conta.getSaldo());
                                break;
                            case 2:
                                System.out.print("Qual o valor do saque: ");
                                float tirar = leitor.nextFloat();
                                if(tirar == 0 || tirar > conta.getSaldo()){
                                    System.out.println("Saque maior que o saldo!");
                                }else{
                                    conta.saque(tirar);
                                }

                                System.out.println("Saldo atual: " + conta.getSaldo());

                            break;
                            case 3:
                                System.out.println("Qual o valor do depósito? ");
                                float colocar = leitor.nextFloat();

                                conta.deposito(colocar);
                                break;

                            case 0:
                            /// saindo do menu
                            break;
                            default:
                            System.out.println("Informe uma opção válida.");
                            break;
                        }
    
                    }while(optmenu !=0);
                        break;
                
                    case 2:
                        leitor.nextLine();
                        System.out.println("----Criar conta-----");
                        System.out.println("informe o cpf: ");
                        String cpfNovo = leitor.nextLine();

                        if(cadastros.get(cpfNovo)!= null){
                            System.out.println("CPF já possui conta.");
                            System.out.println("-----------------------------");
                            break;
                        }

                        System.out.println("Informe seu nome: ");
                        String nome = leitor.nextLine();

                        ContaBancaria contaNova = new ContaBancaria(nome, cpfNovo);
                        cadastros.put(cpfNovo, contaNova);
                        System.out.println("Número da conta: " + contaNova.getNumeroConta());

                    
                        break;
                    case 0:
                    //saindo menu
                        break;
                        default:
                        System.out.println("Informe uma opção válida.");
                        break;

                }
    
            }while(opt != 0);
    
            leitor.close();
    }

}
