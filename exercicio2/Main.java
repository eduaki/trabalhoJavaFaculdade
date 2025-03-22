package exercicio2;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int qtdLivros = 2;
        Livro[] biblioteca = new Livro[qtdLivros];
        int opt;
        
        do{
            System.out.println("\n-----------------------\n");

            System.out.println("o que gostaria de fazer?\n");
            System.out.println("[1] - Adicionar livros");
            System.out.println("[2] - Ver livros");
            System.out.println("[0] - Sair");

            opt = leitor.nextInt();

            switch (opt) {
                case 1 -> {
                    
                    for(int i = 0; i < biblioteca.length; i++){
                        
                        System.out.println("--------------------------");
                        System.out.println((i+1) + "º livro: ");
                        
                        System.out.print("Titulo: ");
                        String titulo = leitor.nextLine();
                        leitor.nextLine();
                        System.out.print("Autor: ");
                        String autor = leitor.nextLine();
                        System.out.print("Ano: ");
                        int ano = leitor.nextInt();

                        leitor.nextLine();
                        
                        biblioteca[i] = new Livro(titulo, autor, ano);
                    }
                    break;
                }

                    case 2 -> {
                        
                        if(biblioteca[0] == null){
                            System.out.println("VC não tem nenhum livro ainda!!!\n");
                            break;
                        }

                        for(int i = 0; i < biblioteca.length; i++){
                            biblioteca[i].exibirInfo();
                        }
                }

                default -> throw new AssertionError();
            }

        }while(opt != 0);


        leitor.close();
    }
}