Feature: anu fb login functionality

  Scenario: anu login for fb application 3-1 time
    Given anu Launch the fb application
    When anu provide all the details
    Then anu user is navigated to fb homepage
    
  Scenario: anu login for fb application 3-2 time
  	 Given anu Launch the fb application
    When anu provide all the details
    Then anu user is navigated to fb homepage