#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Search functionality test
As a customer(logged-in/guest), I should be able to search desire product.

#Scenario: Positive search functionality for guest customer by clicking search button
#Given guest customer is in homepage 
#When customer enters valid product in search box
#And customer clicks search button
#Then related products should be displayed in search result page
#
#
#Scenario: Positive search functionality for guest customer by hiting enter key
#Given guest customer is in homepage 
#When customer enters valid product in search box
#And customer hits enter key
#Then related products should be displayed in search result page
#
#Scenario: Negative search functionality for guest customer by hiting enter key
#Given guest customer is in homepage 
#When customer enters invalid product in search box
#And customer hits enter key
#Then no search result error message should be displayed
#
#
#Scenario: Negative search functionality for guest customer clicking search button
#Given guest customer is in homepage 
#When customer enters invalid product in search box
#And customer clicks search button
#Then no search result error message should be displayed
#And customer should be in search result page

#Data Driven in Cucumber
#Scenario Outline: Data driven for positive search functionality 
#Given guest customer is in homepage 
#When customer enters valid <product> in search box
#And customer clicks search button
#Then related <product> should be displayed in search result page
#
#Examples:
#|product|
#|apple|
#|samsung|
#|lg|

@Release1.0
Scenario Outline: Data driven for negative search functionality 
Given guest customer is in homepage 
When customer enters  "<invalidProduct>" in search box
And customer clicks search button
Then "No results for" error message should be displayed   #errMsg #single sentence validation
And customer should be in "<invalidProduct>" search result page

Examples:
|invalidProduct|
|876534567789VBBMMJHJ|
|876534567789566778VBBMMJHJ|
|876534567789345VBBMMJHJ|


