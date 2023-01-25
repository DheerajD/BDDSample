Feature: FizzBuzz game play features defined here

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game play
    When input number is 3
    Then Result is "Fizz"

  Scenario: Play FizzBuzz to get Buzz
    Given Create a FizzBuzz game play
    When input number is 5
    Then Result is "Buzz"

  Scenario: Play FizzBuzz to get FizzBuzz
    Given Create a FizzBuzz game play
    When input number is 15
    Then Result is "FizzBuzz"
