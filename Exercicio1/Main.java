package Exercicio1;
import java.util.Scanner;

class Main {
//// calculadora
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);


        float n1, n2;
        int num;
        
        do{
            System.out.println("---------------------------------");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[0] sair");
    
            System.out.println("Escolha a operação que deseja: ");
            num = leitor.nextInt();
            switch(num){

                case 1:
                
                    System.out.println("1º valor da soma: ");
                    n1 = leitor.nextFloat();

                    System.out.println("2º número da soma: ");
                    n2 = leitor.nextFloat();

                    float soma = Calculadora.soma(n1,n2);
                
                    System.out.println("O resultado da soma é: " + soma);

                    break;
                case 2:

                    System.out.println("1º valor da subtração: ");
                    n1 = leitor.nextFloat();

                    System.out.println("2º número da subtração: ");
                    n2 = leitor.nextFloat();

                    float sub = Calculadora.sub(n1, n2);
                
                    System.out.println("O resultado da subtração é: " + sub);
                    break;
                case 3:
                    System.out.println("1º valor da multiplicação: ");
                    n1 = leitor.nextFloat();

                    System.out.println("2º número da multiplicaçãp: ");
                    n2 = leitor.nextFloat();

                    float mult = Calculadora.multi(n1, n2);
                
                    System.out.println("O resultado da multiplicação é: " + mult);
                    break;
                case 4:
                    System.out.println("1º valor da dividir: ");
                    n1 = leitor.nextFloat();

                    System.out.println("2º número da divdir: ");
                    n2 = leitor.nextFloat();
                    if(n2 <= 0){
                        System.out.println("Valor inválido, o número precisa ser maior que 0");
                        System.out.println("2º número da divdir: ");
                        n2 = leitor.nextFloat();
                    }
                    float div = Calculadora.div(n1, n2);
                
                    System.out.println("O resultado da subtração é: " + div);

            }   

        }while(num != 0);
        leitor.close();
    }

}
