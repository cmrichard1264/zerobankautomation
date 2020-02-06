$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@find_transactions"
    }
  ]
});
formatter.scenario({
  "name": "Search date range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@find_transactions"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user accesses the Find Transactions tab",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user enters date range from “2012-09-01” to “2012-09-06”",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "results table should only show transactions dates between “2012-09-01” to “2012-09-06”",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the results should be sorted by most recent date",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user enters date range from “2012-09-02” to “2012-09-06”",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "results table should only show transactions dates between “2012-09-02” to “2012-09-06”",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the results table should only not contain transactions dated “2012-09-01”",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});