	Feature: Admin can create a facture.
Scenario Outline: Admin create facture
    Given  facture with <id> <bordereau> <numFacture> <exist>
    When Admin add this facture to list
    Then The result should be <result>

    Examples: 
      | id     |  bordereau  | numFacture    | exist | result |   
      | 1      |     1       | "n1"          | "yes" | "no"   |   
      | 2      |     2       | "n2"          | "no"  | "ok"   |   
      