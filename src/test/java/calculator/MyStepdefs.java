package calculator;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value;
    private double result;
    private String opt;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Given("^value (\\d+) opt (rvs|sqr)$")
    public void valueOptRvs(int arg0, String opt_in) {
        opt = opt_in;
        value = arg0;
    }

    @When("^I do opt on value$")
    public void iDoOptOnValue() {
        if (opt.equals("rvs")){
            result = calculator.inverse(value);
            System.out.println("inverse: ");
            System.out.println(result);
        }else{
            result = calculator.sqr(value);
            System.out.println("sqr: ");
            System.out.println(result);
        }
    }

    @Then("^I expect the result (\\d+\\.?\\d+|\\d+)$")
    public void iExpectTheResult(double arg0) {
        System.out.println("arg0 is");
        System.out.println(arg0);
        Assert.assertEquals(result, arg0, 0.0000000001);
    }
}
