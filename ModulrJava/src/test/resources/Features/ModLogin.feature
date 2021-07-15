Feature: Login to Modulr Customer Portal

  Background: 
    Given User Launch Chrome Browser

  @Positive
  Scenario Outline: Signing In (Positive Test Case)
    When user opens url "https://secure-sandbox.modulrfinance.com"
    And user enters the "<Username>" and "<Password>"
    And Click on Sign in
    Then assert sign in button is disabled
    And assert that user can see "<Result>"
    And close browser

    Examples: 
      | Test         | Username         | Password     | Result   |
      | Correct Cred | Vedanth.Vasudev2 | Vedanth@1234  | Accounts |

  #@Negative
  #Scenario Outline: Multiple Login (Negative Test Cases)
   # When user opens url "https://secure-sandbox.modulrfinance.com"
    #And user enters the <Username> and <Password>
    #And Click on Sign in
    #Then assert sign in button is disabled
    #And assert that user can see <Result>
    #And Assert the <Limit > (Attempts left) is shown

    #Examples: 
     # | Test           | Username         | Password     | Result                         | ßLimit |
      #| Incorrect Pass | Vedanth.Vasudev2 | Vedanth      | Incorrect Username or Password |     4 |
      #| Incorrect User | Veda             | Vedanth@1234 | Incorrect Username or Password |       |
      #| Empty Pass     | Vedanth.Vasudev2 |              | Incorrect Username or Password |     3 |
      #| Empty User     |                  | Vedanth@1234 | Incorrect Username or Password |       |

#Should count the attemps taken only when a valid username is typed and tried to enter the portal
  #@Reset
  #Scenario Outline: Reset Password
   # When user opens url "https://secure-sandbox.modulrfinance.com"
    #And user clicks on forgot password
    #Then reset password page is shown
   # When user enter a <username>
    #And click Submit
    #Then user should see <Result>
    
    #Examples:
     # | Test     | Username                  | Result     |
      #| Username | Vedanth.Vasudev2          | Email Sent |
      #| Email    | vedanthvdev1996@gmail.com | Email Sent |
      
      
      #A button to sign in after the email have been sent would be helpful
