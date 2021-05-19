	Feature: Admin can delete a facture.
Scenario Outline: Admin delete facture by id
    Given  Admin delete facture with id <id> 
    When Admin retrieve all factures after the delete
    Then The size of oldList must be more than new list

    Examples: 
      | id  |   
      | 43  | 
      
 