$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/TUGAS/Kampus Merdeka/Clone4/QE_Aida-Paramita/31_Mini Project/praktikum/CI-CD-WEB-UI-/Include/features/PayTheItems.feature");
formatter.feature({
  "name": "Pay The Items",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Pay the Items - without login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in homepage",
  "keyword": "When "
});
formatter.step({
  "name": "User select product",
  "keyword": "And "
});
formatter.step({
  "name": "User click button Beli",
  "keyword": "And "
});
formatter.step({
  "name": "click icon Keranjang to see product",
  "keyword": "And "
});
formatter.step({
  "name": "User click button Bayar",
  "keyword": "And "
});
formatter.step({
  "name": "user go to login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "olaf@gmail.com",
        "olafaja"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Pay the Items - without login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in homepage",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageSteps.homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select product",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSteps.selectProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click button Beli",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSteps.clickButtonBeli()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click icon Keranjang to see product",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSteps.clickKeranjang()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click button Bayar",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingCartSteps.clickButtonBayar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartSteps.goLoginItems()"
});
formatter.result({
  "status": "passed"
});
});