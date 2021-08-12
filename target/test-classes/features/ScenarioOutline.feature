@Regression
Feature: Scenario Outline feature



  Scenario Outline: Проверка login
    Given Я как пользователь должен зайти на сайт facebook.com
    And  В поле email я должен ввести "<email>"
    And В поле password я должен ввести "<password>"
    When Ядолжна нажать на кнопку Войти
    Then Система должна вывести ошибку "Вы ввели не правильные данные"
    Examples:
      |email          |password|
      |ariet@gmail.com|1234|
      |urmat@gamil.com|pess1234|
      |ermek@gmail.com|ermek1212|


#    Scenario Outline: Добавить товар в избранное
#      Given я должна зайти на "<page>" page
#      And и должна нажать на сердечку
#      When когда я захажу на страницу Избранное
#      Then все товары которые я добавила должны показатся на Избранном
#      Examples:
#      |page|
#      |Home|
#      |Item Detail Page|
#      |Category|