package prova.ex1;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    private BancoDados bd = new BancoDados();
    private ArrayList<Book> books = new ArrayList<Book>();
    public Book searchName(String name){
      for (Book b: books){
        if(name.equals(b.getName()))
          return b;
      }
      return null;
    }
    public void addBook(Book b){
      this.books.add(b);
    }
    public void buyBook(Book b){
      this.books.remove(b);
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public ArrayList<Book> searchType(String arg1) {
      // TODO Auto-generated method stub
      ArrayList<Book> bs = new ArrayList<Book>();
      for (Book b: books){
        if(arg1.equals(b.getType()))
          bs.add(b);
      }
      return bs;
    }
    public ArrayList<Book> searchDifficulty(String arg1) {
      // TODO Auto-generated method stub
      ArrayList<Book> bs = new ArrayList<Book>();
      for (Book b: books){
        if(arg1.equals(b.getDifficulty()))
          bs.add(b);
      }
      return bs;
    }
}
