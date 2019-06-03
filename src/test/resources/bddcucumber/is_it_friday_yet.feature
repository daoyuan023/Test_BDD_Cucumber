Feature: Is it Friday yet?
  Everybody wants to know when it's Friday
  Background:
    Given this year is 2019

  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask if it is Friday yet
    Then I should be answered "<answer>"

  Examples:
    |day      | answer  |
    |Monday   | Nope    |
    |Tuesday  | Nope    |
    |Wednesday| Nope    |
    |Thursday | Nope    |
    |Friday   | Yes     |
    |Saturday | Nope    |
    |Sunday   | Nope    |
    |Others   | Nope    |

