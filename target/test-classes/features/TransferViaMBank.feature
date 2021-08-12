@Transaction
Feature: Transfer with MBank

  Scenario: Перевод денег с аккаунта А на аккаунт Б (positive)
    Given У нас уже банк "Commercial Bank Kyrgyzstan"
    And Пользователь с номером  с email "sanira@gmail.com" и с балансом на счету $1000 зарегистрирована на банке "Commercial Bank Kyrgyzstan"
    And Пользователь с номером с email "aidana@gmail.com" и с балансом на счету $2000 зарегистрирована на банке "Commercial Bank Kyrgyzstan"
    When Пользователь с номером 12345 должен отправить $200 на счет 111111 на email "aidana@gmail.com" в "Commercial Bank Kyrgyzstan"
    Then У пользователя с номером счета 12345 должен остаться на балансе $800
    And У пользователя с номером счета 111111 должен остаться на балансе $2200