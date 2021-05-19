      Feature: Admin can display all bordereaux.
Scenario Outline: Admin display bordereaux
    Given list of bordereaux in db is <isempty>
    When Admin retrieve all bordereaux from database
    Then list retrieved should be <isempty>

    Examples: 
      | isempty       | 
      | "empty"       |
      | "notEmpty"    |
      
