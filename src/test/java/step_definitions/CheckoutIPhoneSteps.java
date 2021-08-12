package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutIPhoneSteps {

    @Given("^Я как пользователь должен открыть сайт facebook\\.com$")
    public void я_как_пользователь_должен_открыть_сайт_facebook_com() throws Throwable {
        System.out.println("Я открыл как пользователь сайт facebook.com ");
    }

    @Given("^Пользователь должен ввести в поле свой email адресс$")
    public void пользователь_должен_ввести_в_поле_свой_email_адресс() throws Throwable {
        System.out.println("Пользователь должен ввести в поле свой email адресс");
    }

    @Given("^Пользователь должен ввести в поле пороль свой password$")
    public void пользователь_должен_ввести_в_поле_пороль_свой_password() throws Throwable {
        System.out.println("Пользователь должен ввести в поле пороль свой password");
    }

    @When("^Пользователь нажмет на кнопку Войти$")
    public void пользователь_нажмет_на_кнопку_Войти() throws Throwable {
        System.out.println("Пользователь нажмет на кнопку Войти");
    }

    @Then("^Пользоватеь должен блогополучно войти в систему$")
    public void пользоватеь_должен_блогополучно_войти_в_систему() throws Throwable {
        System.out.println("Пользоватеь должен блогополучно войти в систему");
    }

   //non correct email
    @Given("^как пользователь должен открыть сайт facebook\\.com$")
    public void как_пользователь_должен_открыть_сайт_facebook_com() throws Throwable {
        System.out.println("как пользователь должен открыть сайт facebook");
    }

    @Given("^Пользователь должен ввести в поле свой некорректный email адресс$")
    public void пользователь_должен_ввести_в_поле_свой_некорректный_email_адресс() throws Throwable {
        System.out.println("Пользователь должен ввести в поле свой некорректный email адресс");
    }

    @Then("^Пользоватеь не должен войти в систему$")
    public void пользоватеь_не_должен_войти_в_систему() throws Throwable {
        System.out.println("Пользоватеь не должен войти в систему");
    }



//Svetafor.kg
    @Given("^я должен зайти на сайт Svetafor\\.kg$")
    public void я_должен_зайти_на_сайт_Svetafor_kg() throws Throwable {
    }

    @Given("^я должен найти наушники для Iphone$")
    public void я_должен_найти_наушники_для_Iphone() throws Throwable {
    }

    @Given("^у меня на карте (\\d+) usd$")
    public void у_меня_на_карте_usd(int arg1) throws Throwable {
    }

    @Given("^Наушгики стоят (\\d+) usd$")
    public void наушгики_стоят_usd(int arg1) throws Throwable {
    }

    @When("^я нажимаю на кнопку купить$")
    public void я_нажимаю_на_кнопку_купить() throws Throwable {
    }

    @When("^Сайт должен снять с моей карты (\\d+) usd$")
    public void сайт_должен_снять_с_моей_карты_usd(int arg1) throws Throwable {
    }

    @Then("^у меня на карте должен остаться (\\d+) usd$")
    public void у_меня_на_карте_должен_остаться_usd(int arg1) throws Throwable {
    }



}
