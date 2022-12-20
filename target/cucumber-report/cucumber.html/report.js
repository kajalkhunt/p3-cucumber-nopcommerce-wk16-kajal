$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computers.feature");
formatter.feature({
  "line": 3,
  "name": "Computer page Test",
  "description": "As user I want to navigate computer page and build my own computer and add to cart",
  "id": "computer-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 6245167600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify User Should Navigate To Computer Page Successfully",
  "description": "",
  "id": "computer-page-test;verify-user-should-navigate-to-computer-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Computers",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to Computer page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 214772500,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnComputers()"
});
formatter.result({
  "duration": 572375600,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iShouldNavigateToComputerPageSuccessfully()"
});
formatter.result({
  "duration": 42600,
  "status": "passed"
});
formatter.after({
  "duration": 194200,
  "status": "passed"
});
formatter.before({
  "duration": 2190311400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify User Should Navigate To Desktops Page Successfully",
  "description": "",
  "id": "computer-page-test;verify-user-should-navigate-to-desktops-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Computers",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on Computers",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on Desktops",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should nevigate to desktop page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputersSteps.iAmOnComputers()"
});
formatter.result({
  "duration": 626460000,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnComputers()"
});
formatter.result({
  "duration": 385274300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnDesktops()"
});
formatter.result({
  "duration": 438810000,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iShouldNevigateToDesktopPageSuccessfully()"
});
formatter.result({
  "duration": 61116300,
  "status": "passed"
});
formatter.after({
  "duration": 47000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Verify That User Should Build Your Own Computer And Add To Cart Successfully",
  "description": "",
  "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on Computers",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click on Desktops",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select product \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select processor \"\u003cprocessor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select RAM \"\u003cram\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select HDD \"\u003chdd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select OS \"\u003cos\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select Software \"\u003csoftware\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I can add product to cart successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;",
  "rows": [
    {
      "cells": [
        "processor",
        "ram",
        "hdd",
        "os",
        "software"
      ],
      "line": 34,
      "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;;1"
    },
    {
      "cells": [
        "2.2 GHz Intel Pentium Dual-Core E2200",
        "2 GB",
        "320 GB",
        "Vista Home [+$50.00]",
        "Microsoft Office [+$50.00]"
      ],
      "line": 35,
      "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;;2"
    },
    {
      "cells": [
        "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]",
        "4GB [+$20.00]",
        "400 GB [+$100.00]",
        "Vista Premium [+$60.00]",
        "Acrobat Reader [+$10.00]"
      ],
      "line": 36,
      "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;;3"
    },
    {
      "cells": [
        "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]",
        "8GB [+$60.00]",
        "320 GB",
        "Vista Home [+$50.00]",
        "Total Commander [+$5.00]"
      ],
      "line": 37,
      "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2725269800,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Verify That User Should Build Your Own Computer And Add To Cart Successfully",
  "description": "",
  "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on Computers",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click on Desktops",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select product \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select processor \"2.2 GHz Intel Pentium Dual-Core E2200\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select RAM \"2 GB\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select HDD \"320 GB\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select OS \"Vista Home [+$50.00]\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select Software \"Microsoft Office [+$50.00]\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I can add product to cart successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 43300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnComputers()"
});
formatter.result({
  "duration": 599925300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnDesktops()"
});
formatter.result({
  "duration": 445412600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 18
    }
  ],
  "location": "ComputersSteps.iSelectProduct(String)"
});
formatter.result({
  "duration": 821069200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2.2 GHz Intel Pentium Dual-Core E2200",
      "offset": 20
    }
  ],
  "location": "ComputersSteps.iSelectProcessoe(String)"
});
formatter.result({
  "duration": 171455000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 GB",
      "offset": 14
    }
  ],
  "location": "ComputersSteps.iSelectRAM(String)"
});
formatter.result({
  "duration": 145543100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "320 GB",
      "offset": 14
    }
  ],
  "location": "ComputersSteps.iSelectHDD(String)"
});
formatter.result({
  "duration": 95904800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Home [+$50.00]",
      "offset": 13
    }
  ],
  "location": "ComputersSteps.iSelectOS(String)"
});
formatter.result({
  "duration": 91923200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft Office [+$50.00]",
      "offset": 19
    }
  ],
  "location": "ComputersSteps.iSelectSoftware(String)"
});
formatter.result({
  "duration": 100264300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 80810900,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iCanAddProductToCartSuccessfully()"
});
formatter.result({
  "duration": 655270000,
  "status": "passed"
});
formatter.after({
  "duration": 55000,
  "status": "passed"
});
formatter.before({
  "duration": 2201769200,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify That User Should Build Your Own Computer And Add To Cart Successfully",
  "description": "",
  "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on Computers",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click on Desktops",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select product \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select processor \"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select RAM \"4GB [+$20.00]\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select HDD \"400 GB [+$100.00]\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select OS \"Vista Premium [+$60.00]\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select Software \"Acrobat Reader [+$10.00]\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I can add product to cart successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 132900,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnComputers()"
});
formatter.result({
  "duration": 611939800,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnDesktops()"
});
formatter.result({
  "duration": 512255400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 18
    }
  ],
  "location": "ComputersSteps.iSelectProduct(String)"
});
formatter.result({
  "duration": 1150727500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]",
      "offset": 20
    }
  ],
  "location": "ComputersSteps.iSelectProcessoe(String)"
});
formatter.result({
  "duration": 130183100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4GB [+$20.00]",
      "offset": 14
    }
  ],
  "location": "ComputersSteps.iSelectRAM(String)"
});
formatter.result({
  "duration": 167748600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400 GB [+$100.00]",
      "offset": 14
    }
  ],
  "location": "ComputersSteps.iSelectHDD(String)"
});
formatter.result({
  "duration": 133789200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Premium [+$60.00]",
      "offset": 13
    }
  ],
  "location": "ComputersSteps.iSelectOS(String)"
});
formatter.result({
  "duration": 128247000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Acrobat Reader [+$10.00]",
      "offset": 19
    }
  ],
  "location": "ComputersSteps.iSelectSoftware(String)"
});
formatter.result({
  "duration": 147430400,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 112911500,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iCanAddProductToCartSuccessfully()"
});
formatter.result({
  "duration": 263271700,
  "status": "passed"
});
formatter.after({
  "duration": 42200,
  "status": "passed"
});
formatter.before({
  "duration": 3413894300,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Verify That User Should Build Your Own Computer And Add To Cart Successfully",
  "description": "",
  "id": "computer-page-test;verify-that-user-should-build-your-own-computer-and-add-to-cart-successfully;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on Computers",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click on Desktops",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select product \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select processor \"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select RAM \"8GB [+$60.00]\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select HDD \"320 GB\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select OS \"Vista Home [+$50.00]\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select Software \"Total Commander [+$5.00]\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I can add product to cart successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 74800,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnComputers()"
});
formatter.result({
  "duration": 1320102000,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnDesktops()"
});
formatter.result({
  "duration": 531600700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 18
    }
  ],
  "location": "ComputersSteps.iSelectProduct(String)"
});
formatter.result({
  "duration": 974271400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]",
      "offset": 20
    }
  ],
  "location": "ComputersSteps.iSelectProcessoe(String)"
});
formatter.result({
  "duration": 142403400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8GB [+$60.00]",
      "offset": 14
    }
  ],
  "location": "ComputersSteps.iSelectRAM(String)"
});
formatter.result({
  "duration": 181112300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "320 GB",
      "offset": 14
    }
  ],
  "location": "ComputersSteps.iSelectHDD(String)"
});
formatter.result({
  "duration": 157967100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Home [+$50.00]",
      "offset": 13
    }
  ],
  "location": "ComputersSteps.iSelectOS(String)"
});
formatter.result({
  "duration": 159785800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Total Commander [+$5.00]",
      "offset": 19
    }
  ],
  "location": "ComputersSteps.iSelectSoftware(String)"
});
formatter.result({
  "duration": 300900000,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 201411500,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iCanAddProductToCartSuccessfully()"
});
formatter.result({
  "duration": 312905300,
  "status": "passed"
});
formatter.after({
  "duration": 47400,
  "status": "passed"
});
});