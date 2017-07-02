Feature: FindByType
  As gift buyer
  I want to search book by type
  So I can find the book I`m looking for

  Scenario: search by type
    Given a library 
    When I search "typea"
    Then the result should be an array of books