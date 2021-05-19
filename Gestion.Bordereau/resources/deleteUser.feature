Feature: Admin can delete a user.

 Scenario Outline: Admin delete a user
    Given  User already exist 
    When Admin delete this user with <id>  
    Then User with id <id> should not exist

    Examples: 
      | id  | 
      |  1  |