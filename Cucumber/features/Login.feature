Feature: Leaftaps Login fuctionality

Background:
Given Launch the Browser
And Load the application url

Scenario Outline: TC001_Login to application - Positive

Given Enter Username as <userName>
And Enter password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|userName|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#Scenario: TC002_Login to application - Negative

#Given Enter Username as 'DemoSalesManager'
#And Enter password as 'crmsfa123'
#When Click on Login button
#Then Error Message should be displayed