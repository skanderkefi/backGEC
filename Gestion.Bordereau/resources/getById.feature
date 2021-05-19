Feature: Admin can get a user by id.

 Scenario Outline: Admin get user
    Given  User is null
    When Admin get user with matricule <matricule> and id <id> from database
    Then I verify that this user must not be null

    Examples: 
      | matricule   |  id  |
      | "1255"      |  43  |
      
    