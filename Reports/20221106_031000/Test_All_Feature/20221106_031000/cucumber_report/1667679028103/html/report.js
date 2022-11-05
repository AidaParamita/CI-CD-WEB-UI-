$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/TUGAS/Kampus Merdeka/Clone4/QE_Aida-Paramita/31_Mini Project/praktikum/CI-CD-WEB-UI-/Include/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User log in into website using existing acount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open browser login",
  "keyword": "Given "
});
formatter.step({
  "name": "I fill correct email \u003cemail\u003e and password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click button login",
  "keyword": "And "
});
formatter.step({
  "name": "I can login",
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
    },
    {
      "cells": [
        "cat@gmail.com",
        "cataja"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User log in into website using existing acount",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I fill correct email olaf@gmail.com and password olafaja",
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
  "keyword": "Then "
});
formatter.match({
  "location": "AuthSteps.sucLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User log in into website using existing acount",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I fill correct email cat@gmail.com and password cataja",
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
  "keyword": "Then "
});
formatter.match({
  "location": "AuthSteps.sucLogin()"
});
formatter.result({
  "status": "passed"
});
});