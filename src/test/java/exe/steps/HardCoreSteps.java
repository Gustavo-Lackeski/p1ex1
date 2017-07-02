package exe.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import prova.ex1.App;
import prova.ex1.Book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HardCoreSteps {

    private App library;
    private Book b = null;
    @Before
    public void setUp() {
        library = new App();
        library.addBook(new Book("name","type1","easy",2));
    }

    @Given("^a library$")
    public void a_library() throws Throwable {
        assertNotNull(library);
    }

    @When("^I search \"(.*?)\"$")
    public void i_add_and(String arg1) throws Throwable {
        b = library.searchName(arg1);
      //  System.out.print("teste" + arg1);
    }
    @Then("^the result should be a book$")
    public void the_result_should_be_a_book() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      assertNotNull(b);
    }
}
