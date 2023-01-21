Feature: Adding multiple scenarios with Background as well as But usage
  Background:
    Given Login page
    Scenario: Successful login
      When user enters valid credentials "<uname>" and "<pwd>"
      |uname | pwd|
      |TestUser1 | TestPwd1|
      |TestUser2 | TestPwd2|
      Then login is successful

    Scenario: Unsuccessful login
      When user enters invalid credentials "<uname>" and "<pwd>"
      |uname | pwd|
      |abc | abc123|
      |xyz | xyz123|
      |pqr | 12345|
      Then login is unsuccessful
      But user is not blocked


    Scenario: Unsuccessful login with blocked user
      When blocked user enters invalid credentials
        |uname |
        |TestBlockedUser |
      Then login is unsuccessful
      And user is blocked