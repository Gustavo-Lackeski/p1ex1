package prova.ex1;

public class Book {
  private String titulo;
  private String type;
  private String difficulty;
  private double price;
  public Book(String ti, String type,String difficulty,double price){
    this.price = price;
    this.titulo =ti;
    this.difficulty = difficulty;
    this.type = type;
  }
  public String getName(){
    return this.titulo;
  }
  public String getType(){
    return this.type;
  }
  public String getDifficulty(){
    return this.difficulty;
  }
}
