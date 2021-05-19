Feature: Admin can create a student.

 Scenario Outline: Admin create list of users
    Given  Admin has a list of users
    When Admin add a user with <id>  <name> <matricule> <email>  <last_login_ip> <password>  <profil>  <direction> <isactive> <image>  <phone> <created_by> to list
    Then I verify that user with <id> exist

    Examples: 
      | id  |  name  | matricule    |       email       | last_login_ip   |  password   |     profil  | direction | isactive  | image    | phone   | created_by   | 
      | 55  | "kefi" | "74585"      | "kefi@gmail.com"  | "111.321.25"    | "password"  |  "profil"   | 1         | 1         | "14"     | "5555"  | "14525"      | 
      
    