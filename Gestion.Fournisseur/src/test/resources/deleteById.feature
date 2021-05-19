	Feature: Admin can delete a fournisseur.
Scenario Outline: Admin delete fournisseur by id
    Given  Admin delete fournisseur with id <id> 
    When Admin retrieve all fournisseurs after the delete
    Then The size of oldList must be more than new list

    Examples: 
      | id  |   
      | 43  | 
      
 