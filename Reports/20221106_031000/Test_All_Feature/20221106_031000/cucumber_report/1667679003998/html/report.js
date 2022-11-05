$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/TUGAS/Kampus Merdeka/Clone4/QE_Aida-Paramita/31_Mini Project/praktikum/CI-CD-WEB-UI-/Include/features/Register.feature");
formatter.feature({
  "name": "Register",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User create new account - with fill all field",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open browser regis",
  "keyword": "Given "
});
formatter.step({
  "name": "I fill correct fullname \u003cfullname\u003e and email \u003cemail\u003e and password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click button register",
  "keyword": "And "
});
formatter.step({
  "name": "I can register",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullname",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Taylor4",
        "taylor4@gmail.com",
        "taylor4aja"
      ]
    },
    {
      "cells": [
        "",
        "bagus3@gmail.com",
        "bagus3aja"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User create new account - with fill all field",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open browser regis",
  "keyword": "Given "
});
formatter.match({
  "location": "AuthSteps.openRegis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill correct fullname Taylor4 and email taylor4@gmail.com and password taylor4aja",
  "keyword": "When "
});
formatter.match({
  "location": "AuthSteps.correctRegis(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button register",
  "keyword": "And "
});
formatter.match({
  "location": "AuthSteps.clickRegis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can register",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthSteps.sucRegis()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User create new account - with fill all field",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open browser regis",
  "keyword": "Given "
});
formatter.match({
  "location": "AuthSteps.openRegis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill correct fullname  and email bagus3@gmail.com and password bagus3aja",
  "keyword": "When "
});
formatter.match({
  "location": "AuthSteps.correctRegis(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button register",
  "keyword": "And "
});
formatter.match({
  "location": "AuthSteps.clickRegis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can register",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthSteps.sucRegis()"
});
formatter.result({
  "status": "passed"
});
});