      Feature: Admin can display all Fournisseurs.
Scenario Outline: Admin display Fournisseurs
    Given list of Fournisseurs in db is <isempty>
    When Admin retrieve all Fournisseurs from database
    Then list retrieved should be <isempty>

    Examples: 
      | isempty       | 
      | "empty"       |
      | "notEmpty"    |
      
