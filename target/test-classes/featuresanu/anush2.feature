Feature: anu fb login functionality

  Scenario: anu login for fb application 2-1 time
    Given anu Launch the fb application
    When anu provide all the details
    Then anu user is navigated to fb homepage

  Scenario: anu login for fb application 2-2 time
    Given anu Launch the fb application
    When anu provide all the details
    Then anu user is navigated to fb homepage