package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class DataTableSteps {
    @Given("^Пользователь на странице регистрации$")
    public void пользователь_на_странице_регистрации() {
        System.out.println("я зашел на страницу регистрации");
    }


    @When("^Пользователь должен ввести данные$")
    public void пользователь_должен_ввести_данные(DataTable table) {
        List<List<String>> userList = table.asLists(String.class);
        for (List<String> e : userList) {
            System.out.println(e);
        }
    }

    @Then("^Пользователь должен нажать на кнопку регистрации$")
    public void пользователь_должен_нажать_на_кнопку_регистрации() {
        System.out.println("ользователь должен нажать на кнопку регистрации");
    }

    @Then("^Пользователь должен успешно зарегаться$")
    public void пользователь_должен_успешно_зарегаться() {
        System.out.println("Пользователь должен успешно зарегаться");
    }
}