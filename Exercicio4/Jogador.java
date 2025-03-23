package Exercicio4;

public class Jogador {

  String nome;
  private double pts = 0;
  private int level = 0;

  
  Jogador(String nome){
    this.nome = nome;
  }

  public void ptsUp(int pts){
    this.pts += pts;
    
    int levelUps = (int) (this.pts / 100); 
    
    for (int i = 0; i < (levelUps - 1); i++) {
        levelUp();
    }
  }

  public void levelUp(){
    level += 1;
  }

  public void exibirInfo(){
    System.out.println("nome: " + this.nome);
    System.out.println("\t" + this.pts + " pontos");
    System.out.println("level: "+ level);
  }

  public double verPontos(){
    return this.pts;
  }
  public int verlevel(){
    return this.level;
  }

}
