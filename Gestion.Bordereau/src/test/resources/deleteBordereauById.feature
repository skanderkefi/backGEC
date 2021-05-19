	Feature: Admin can delete a bordereau.
Scenario Outline: Admin delete bordereau by id
    Given  Admin delete bordereau with id <id> 
    When Admin retrieve all bordereaux after the delete
    Then The size of oldList must be more than new list

    Examples: 
      | id  |   
      | 43  | 
      
 