$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/login.feature");
formatter.feature({
  "name": "user login to the Car accessories",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the user is not logged in",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the email is \"lanauser@gmail.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the password is \"useruser\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user login succeeds",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User has the wrong password or email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the user is not logged in",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the email is \"lanauser123@gmail.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the password is \"useruser\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user login fail",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user is not logged in",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Admin or Installer can login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the admin or Installer is not logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "the email is \u003cemail\u003e and the pass \u003cpass\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the admin or Installer login succeeds",
  "keyword": "Then "
});
formatter.step({
  "name": "the admin or Installer is logged in",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "pass",
        "status"
      ]
    },
    {
      "cells": [
        "\"lana\"",
        "\"lana@gmail.com\"",
        "\"lana\"",
        "admin"
      ]
    },
    {
      "cells": [
        "\"aya\"",
        "\"aya@gmail.com\"",
        "\"ayaaya1\"",
        "Installer"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Admin or Installer can login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the admin or Installer is not logged in",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the email is \"lana@gmail.com\" and the pass \"lana\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the admin or Installer login succeeds",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the admin or Installer is logged in",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Admin or Installer can login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the admin or Installer is not logged in",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the email is \"aya@gmail.com\" and the pass \"ayaaya1\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the admin or Installer login succeeds",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the admin or Installer is logged in",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});