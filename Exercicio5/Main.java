package Exercicio5;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    /// Cadastro e controle de velocidade de carros.
        Scanner leitor = new Scanner(System.in);

        HashMap<Integer, Carro> cadastros = new HashMap<>();

        int opt;
        do{

        
            System.out.println("[1] Cadastrar carro.");
            System.out.println("[2] Consultar carro.");
            System.out.println("[0] Sair.");
            opt = leitor.nextInt();

            leitor.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("----------Cadastrar-----------");

                    System.out.print("Qual a marca do carro? ");
                    String marca = leitor.nextLine();

                    System.out.print("Informe o modelo: ");
                    String modelo = leitor.nextLine();

                    System.out.print("Informe o ano de fabricação ");
                    int ano = leitor.nextInt();

                    System.out.print("Informe a placa do carro(apenas numeros): ");
                    int placa = leitor.nextInt();

                    leitor.nextLine();

                    cadastros.put(placa, new Carro(marca, modelo, ano, placa));

                    System.out.println("Cadastro finalizado com sucesso!!");
                    break;

                case 2:

                    System.out.print("Placa do carro a ser pesquisado (apenas numeros): ");
                    int pesquisaPlaca = leitor.nextInt();
                    leitor.nextLine();

                    Carro carroEncontrado = cadastros.get(pesquisaPlaca);
                    
                    if( carroEncontrado == null){
                        System.out.println("Carro NÃO cadastrado");
                        break;
                    }

                    System.out.println(carroEncontrado.getMarca());
                    
                    int opcao;
                    do{
                        System.out.println("Marca do carro: " + carroEncontrado.getMarca());
                        System.out.println("Modelo do carro: " + carroEncontrado.getModelo());
                        System.out.println("Ano de fabricação: " + carroEncontrado.getAno());
                        System.out.println("Velocidade atual do carro: " + carroEncontrado.getVelocidade());

                        System.out.println("[1] Acelerar");
                        System.out.println("[2] Frear");
                        System.out.println("[0] Voltar");
                        opcao = leitor.nextInt();
                        
                        leitor.nextLine();

                        switch(opcao){
                            case 1:
                            System.out.print("Quanto que deseja acelerar? ");
                            int acelera = leitor.nextInt();

                            leitor.nextLine();

                            carroEncontrado.acelerar(acelera);
                            System.out.println("Velocidade atual do carro: " + carroEncontrado.getVelocidade());


                            break;
                            case 2: 
                            System.out.print("Quanto que deseja acelerar? ");
                            int frear = leitor.nextInt();
                            
                            leitor.nextLine();
                            
                            carroEncontrado.frear(frear);
                            System.out.println("Velocidade atual do carro: " + carroEncontrado.getVelocidade());

                            break;

                            case 0:
                            /// saindo do menu
                            break;
                            default:
                            System.out.println("Escolha uma opção válida!");
                            break;

                        }
                    }while(opcao != 0);
                break;
                case 0:
                /// saindo do menu
                break;
            
                default:
                System.out.println("Escolha uma opção válida!");
                break;
            }

        } while(opt != 0);



        leitor.close();
    } 
}
