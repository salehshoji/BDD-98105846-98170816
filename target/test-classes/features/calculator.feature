@tag
Feature: Calculator

  Scenario: opt on number
    Given value 4 opt sqr
    When I do opt on value
    Then I expect the result 2


  Scenario Outline: opt on numbers
    Given value <Input> opt <opt>
    When I do opt on value
    Then I expect the result <result>
    Examples:
      | Input | opt | result |
      | 4 | rvs | 0.25 |
      | 4 | sqr | 2 |