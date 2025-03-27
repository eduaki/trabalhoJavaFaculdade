package Exercicio6;

import java.util.HashMap;


public class Agenda {
    static HashMap<String, Contato> contatos =  new HashMap<>();
    
    
        public static void adicionar(String nome, String numero){
            Contato contato = new Contato(nome, numero); 
    
            contatos.put(nome, contato); 
    
    
            if(contatos.get(nome) != null){
                System.out.println("Contato salvo com sucesso!");
            }else{
                System.out.println("ERRO: Erro ao salvar o contato!");
                return;
            }
            
        }
    
        public  static void remover(String nome){
            Contato contato = contatos.get(nome); 
    
            if(contato == null){
                System.out.println("Contato não salvo!");
                return;
            }
    
            contatos.remove(nome);
    
            System.out.println("Contato removido com sucesso!!");
        }
    
        public static void busca(String nome){
            Contato contato = contatos.get(nome); 

        if(contato == null){
            System.out.printf("Contato: '%s' não encontrado!", nome);
            return;
        }
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Numero: " + contato.getNumero());
    }


}
