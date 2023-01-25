Feature: Adding multiple scenarios with Background as well as But usage
  Background:
    Given Login page
    Scenario Outline: Successful login
      When user enters credentials "<uname>" and "<pwd>"
      Then login func is successful
      Examples:
      |uname | pwd|
      |TestUser1 | TestPwd1|
      |TestUser2 | TestPwd2|


    Scenario Outline: Unsuccessful login
      When user enters credentials "<uname>" and "<pwd>"
      Then login func is unsuccessful
      But user is not blocked
      Examples:
      |uname | pwd|
      |abc | abc123|
      |xyz | xyz123|
      |pqr | 12345|



    Scenario Outline: Unsuccessful login with blocked user
      When user enters credentials "<uname>" and "<pwd>"
      Then login func is unsuccessful
      And user is blocked
      Examples:
        |uname | pwd |
        |TestBlockedUser | abc12345|
