Feature: the version can be retrieved
  Scenario: client makes call to GET /version
    When the client calls
    Then the client receives status code of
    And the client receives server version

  Scenario: client makes call to 2n
    When the client calls
    Then the client receives status code of
    And the client receives server version

  Scenario: client open Selenide page
    When the client open selenide page