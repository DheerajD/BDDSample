Feature: Login functionality features defined here

 Scenario Outline: Successful login
    Given Login page
    When user provides uname "<username>" and pwd "<password>"
    Then login is successful
    Examples:
    |username | password|
    |TestUser1 | TestPwd1|
    |TestUser2 | TestPwd2|
