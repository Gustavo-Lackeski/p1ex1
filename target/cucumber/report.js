$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/novice.feature");
formatter.feature({
  "line": 1,
  "name": "FindByDifficulty",
  "description": "As gift buyer\nI want to search book by difficulty\nSo I can find the appropriate book for me",
  "id": "findbydifficulty",
  "keyword": "Feature"
});
formatter.before({
  "duration": 60299,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "search by difficulty",
  "description": "",
  "id": "findbydifficulty;search-by-difficulty",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "a library",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search \"hard\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be an array of books",
  "keyword": "Then "
});
formatter.match({
  "location": "NoviceSteps.a_library()"
});
formatter.result({
  "duration": 1641329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hard",
      "offset": 10
    }
  ],
  "location": "NoviceSteps.i_add_and(String)"
});
formatter.result({
  "duration": 208267,
  "status": "passed"
});
formatter.match({
  "location": "NoviceSteps.the_result_should_be_an_array_of_books()"
});
formatter.result({
  "duration": 29081,
  "status": "passed"
});
});