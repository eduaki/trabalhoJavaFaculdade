package Exercicio2;
public class Livro {
    String titulo;
    String autor;
    int ano;


    Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    String getTitulo(){
        return this.titulo;
    }

    void exibirInfo(){
        System.out.println("\n-----------------------\n");
        System.out.println("titulo: " + this.titulo);
        System.out.println("autor: " + this.autor);
        System.out.println("ano: " + this.ano);
    }


}


