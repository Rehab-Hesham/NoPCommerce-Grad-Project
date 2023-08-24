Feature:  verify user could use currency dropdown
  Scenario: user use Pound currency
    Given user is on home page
    When user clicks on Pound currency
    Then Pound symbol is shown on products