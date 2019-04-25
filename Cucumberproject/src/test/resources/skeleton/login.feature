Feature: Login Feature
@valid
Scenario Outline::Valid  User Scenario
Given The URL of TestMe APP
When user enters <username> as username
 And user enters <password> as password
 Then user is in  <page>
Examples:
|username|password   |page      |
|Lalitha |Password123|Home      |
|admin   |Password456|Admin home|


#Scenario: Valid  User Scenario
#Given The URL of TestMe APP
#When user enters "Admin" as username
 #And user enters "Password456" as password
 #Then user is in home page

 @invalid
Scenario: invalid scenario
Given  The URL of TestMe APP
When user enters invalid data
|abcxyz|Password|
|Lalitha|abc123|
|abc123|abc123|
Then user is in loginpage
|bdc|
|hdc|
|gdc|