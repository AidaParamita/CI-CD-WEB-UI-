$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/TUGAS/Kampus Merdeka/Clone4/QE_Aida-Paramita/31_Mini Project/praktikum/CI-CD-WEB-UI-/Include/features/BuyItems.feature");
formatter.feature({
  "name": "Buy Items",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User buy items - without login",
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I open browser login",
  "keyword": "Given "
});
formatter.match({
  "location": "AuthSteps.openLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill correct email \u003cemail\u003e and password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "AuthSteps.correctLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button login",
  "keyword": "And "
});
formatter.match({
  "location": "AuthSteps.clicklogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can login",
  "keyword": "And "
});
formatter.match({
  "location": "AuthSteps.sucLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User buy items - without login",
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
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.clickKeranjang()"
});
formatter.result({
  "status": "passed"
});
});