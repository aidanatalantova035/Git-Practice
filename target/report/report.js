$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TransferViaMBank.feature");
formatter.feature({
  "line": 2,
  "name": "Transfer with MBank",
  "description": "",
  "id": "transfer-with-mbank",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Transaction"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Перевод денег с аккаунта А на аккаунт Б (positive)",
  "description": "",
  "id": "transfer-with-mbank;перевод-денег-с-аккаунта-а-на-аккаунт-б-(positive)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "У нас уже банк \"Commercial Bank Kyrgyzstan\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Пользователь с номером счета 12345  и с email \"sanira@gmail.com\" и с балансом на счету $1000 зарегистрирована на банке \"Commercial Bank Kyrgyzstan\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Пользователь с номером счета 111111  и с email \"aidana@gmail.com\" и с балансом на счету $2000 зарегистрирована на банке \"Commercial Bank Kyrgyzstan\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Пользователь с номером 12345 должен отправить $200 на счет 111111 на email \"aidana@gmail.com\" в \"Commercial Bank Kyrgyzstan\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "У пользователя с номером счета 12345 должен остаться на балансе $800",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "У пользователя с номером счета 111111 должен остаться на балансе $2200",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});