package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineSteps {
    @Given("^Я как пользователь должен зайти на сайт facebook\\.com$")
    public void я_как_пользователь_должен_зайти_на_сайт_facebook_com() throws Throwable {
        System.out.println("Я как пользователь должен зайти на сайт facebook.com");
    }

    @Given("^В поле email я должен ввести \"([^\"]*)\"$")
    public void в_поле_email_я_должен_ввести(String email) throws Throwable {
        System.out.println("В поле email я должен ввести " + email);
    }

    @Given("^В поле password я должен ввести \"([^\"]*)\"$")
    public void в_поле_password_я_должен_ввести(String password) throws Throwable {
        System.out.println("В поле password я должен ввести " + password);
    }

    @When("^Ядолжна нажать на кнопку Войти$")
    public void ядолжна_нажать_на_кнопку_Войти() throws Throwable {
        System.out.println("Я должна нажать на кнопку Войти");
    }

    @Then("^Система должна вывести ошибку \"([^\"]*)\"$")
    public void система_должна_вывести_ошибку(String wrong) throws Throwable {
        System.out.println("Система должна вывести ошибку" + wrong );
    }









//    @Given("^я должна зайти на \"([^\"]*)\" page$")
//    public void я_должна_зайти_на_page(String ) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("я должна зайти на");
//    }
//
//    @Given("^и должна нажать на сердечку$")
//    public void и_должна_нажать_на_сердечку() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//    }
//
//    @When("^когда я захажу на страницу Избранное$")
//    public void когда_я_захажу_на_страницу_Избранное() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//    }
//
//    @Then("^все товары которые я добавила должны показатся на Избранном$")
//    public void все_товары_которые_я_добавила_должны_показатся_на_Избранном() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//    }



}
