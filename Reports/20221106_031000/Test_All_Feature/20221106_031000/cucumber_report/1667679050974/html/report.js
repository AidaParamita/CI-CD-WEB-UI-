$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/TUGAS/Kampus Merdeka/Clone4/QE_Aida-Paramita/31_Mini Project/praktikum/CI-CD-WEB-UI-/Include/features/AddItems.feature");
formatter.feature({
  "name": "Add Items",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add items - without login",
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
  "name": "User can add items",
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
  "name": "Add items - without login",
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
  "name": "User can add items",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartSteps.addItems()"
});
formatter.result({
  "status": "passed"
});
});