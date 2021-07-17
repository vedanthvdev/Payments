# Payments

Scenarios written in Gherkin format to automate with cucumber. Using the below Story as a source of acceptance criteria.

User Story
As a Modulr customer user(https://secure-sandbox.modulrfinance.com/)
I want to be able to login successfully to the Modulr Customer Portal 
So that I can manage my Modulr accounts

Background
Modulr customers need to be able to login securely to our customer portal in order to take various actions against their Modulr accounts such as create payments, create and manage rules etc.
To ensure this is done in a secure fashion customer must be able to provide a username and password. The password must meet a standard that ensures it is not easily found out and we must manage incorrect passwords correctly so the customer is aware but the error must not give away too much detail for example telling the user specifically the password is incorrect or the username is incorrect as this could aid users with malicious intent.

Acceptance Criteria
• Username and Password are both required fields, if either field is empty then an adequate error message should be shown.
• Incorrect Username or Password should show an adequate error message but not leading. There should also be an adequate warning that multiple failures will lead to the user being locked.
• Successful login should take the user to the account overview page.
• The sign in button should be disabled while trying to login to prevent duplicate requests
being triggered.
• The user should have the ability to reset their password should they be unable to remember
their password which should take them to a screen that allows them to request a reset password email.
