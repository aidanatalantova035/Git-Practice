@Regression
Feature: Data table practice


  Scenario: Пользователь должен зарегаться с разными данными
    Given Пользователь на странице регистрации
    When Пользователь должен ввести данные
      | John | Doe       | 1990 | john@gmail.com | USA     |
      | Elon | Mask      | 1980 | elon@gmail.com | USA     |
      | Mark | zukerberg | 1878 | mark@gm        | ail.com | USA |
    Then Пользователь должен нажать на кнопку регистрации
    Then Пользователь должен успешно зарегаться