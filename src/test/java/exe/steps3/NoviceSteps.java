package exe.steps3;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import prova.ex1.App;
import prova.ex1.Book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

public class NoviceSteps {

  
    private App library;
    private Book b = null;
    private ArrayList<Book> bs = new ArrayList<Book>();
    @Before
    public void setUp() {
        library = new App();
        library.addBook(new Book("name","typea","easy",2));
        library.addBook(new Book("nameb","typeb","hard",2));
        library.addBook(new Book("nameb","typeb","hard",2));
    }

    @Given("^a library$")
    public void a_library() throws Throwable {
        assertNotNull(library);
    }

    @When("^I search \"(.*?)\"$")
    public void i_add_and(String arg1) throws Throwable {
        bs = library.searchDifficulty(arg1);
        System.out.print("teste" + arg1);
        
    }
    @Then("^the result should be an array of books$")
    public void the_result_should_be_an_array_of_books() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      assertEquals(bs.size(),2);
    }
}
