Feature: Shout Feature
Scenario: Sean Shouts
Given Sean is 10 meters away from Lucia
When Sean Shouts "Free Coffee"
Then Lucia "listens" to message


Scenario: scenario description
    Given Sean is 200 meters away from Lucia
    When Sean Shouts "Free Coffee"
    Then Lucia "cannot listens" to message
    