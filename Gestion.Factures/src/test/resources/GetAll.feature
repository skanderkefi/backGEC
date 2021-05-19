      Feature: Admin can display all factures.
Scenario Outline: Admin display factures
    Given list of factures in db is <isempty>
    When Admin retrieve all factures from database
    Then list retrieved should be <isempty>

    Examples: 
      | isempty       | 
      | "empty"       |
      | "notEmpty"    |
      

