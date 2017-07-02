Feature: FindByDifficulty
  As gift buyer
  I want to search book by difficulty
  So I can find the appropriate book for me

  Scenario: search by difficulty
    Given a library 
    When I search "hard"
    Then the result should be an array of books