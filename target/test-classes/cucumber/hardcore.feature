Feature: FindName
  As hard core sailor
  I want to search book by name
  So I can find the book I`m looking for

  Scenario: search by name
    Given a library 
    When I search "name"
    Then the result should be a book