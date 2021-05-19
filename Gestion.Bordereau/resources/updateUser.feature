Feature: Admin can update a user.

 Scenario Outline: Admin update a user
    Given  Admin update user with   <name> <matricule> <email>  <last_login_ip> <password>  <profil>  <direction> <isactive> <image>  <phone> <created_by>
    When Admin save user 
    Then Old user with matricule <matricule> must have the news attributes

    Examples: 
      | name  | matricule    |       email       | last_login_ip   |  password   |     profil  | direction | isactive  | image    | phone   | created_by   | 
      | "kefi" | "74585"      | "kefi@gmail.com"  | "111.321.25"    | "password"  |  "profil"   | 1         | 1         | "14"     | "5555"  | "14525"      | 
      
    