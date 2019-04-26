$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/Payment.feature");
formatter.feature({
  "name": "Payment feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Payment Scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Headphone added to Cart",
  "keyword": "When "
});
formatter.match({
  "location": "ProductOrderandPayment.headphone_added_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Checkout for payment",
  "keyword": "And "
});
formatter.match({
  "location": "ProductOrderandPayment.checkout_for_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills the Transaction Details",
  "keyword": "And "
});
formatter.match({
  "location": "ProductOrderandPayment.fills_the_Transaction_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product is ordered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductOrderandPayment.product_is_ordered_successfully()"
});
formatter.result({
  "status": "passed"
});
});