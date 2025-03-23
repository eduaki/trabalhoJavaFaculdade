
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    float saldo = 0;
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);

        HashMap<String, ContaBancaria> cadastros = new HashMap<>();

        int opt;
        

        do{

            System.out.println("[1] entrar na conta");
            System.out.println("[2] Criar conta");
            System.out.println("[3] Sair");
            opt = leitor.nextInt();

            switch (opt) {
                case 1:

                    System.out.println("informe o cpf: ");
                    String cpf = leitor.nextLine();

                    ContaBancaria conta = cadastros.get(cpf);

                    break;
            
                case 2:
                    System.out.println("informe o cpf: ");
                    String cpfNovo = leitor.nextLine();
            
                    System.out.println("Informe seu nome: ");
                    String nome = leitor.nextLine();

                    ContaBancaria contaNova = new ContaBancaria(nome, cpfNovo);
                    cadastros.put(cpfNovo, contaNova);

                    break;
            }

        }while(opt != 0);

        System.out.println("----Criar conta-----");

        System.out.println("informe o cpf: ");
        String cpf = leitor.nextLine();

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, cpf);
        
        System.out.println("Nome do cadastro: " + conta.getNome());
        System.out.println("Número da conta: " + conta.getNumeroConta());

        
        do{

            System.out.println("O que deseja fazer: ");
            System.out.println("[1] Saldo");
            System.out.println("[2] Saque");
            System.out.println("[3] Depoósito");
            System.out.println("[0] Sair");

            opt = leitor.nextInt();

            switch(opt){
                case 1:
                
                    System.out.println("O saldo da conta é de: " + saldo);
                break;

                // case 2:
                //     conta = new ContaBancaria()

                //     bancoDeDados.put(cpf, conta)

                // break;

                // case 3: 

                // break;

            }

        }while(opt!= 0);
    }

}
