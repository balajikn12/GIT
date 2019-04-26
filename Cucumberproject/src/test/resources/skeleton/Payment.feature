Feature: Payment feature
Scenario: Payment Scenario
When Headphone added to Cart
And Checkout for payment
And fills the Transaction Details
Then Product is ordered successfully
