	Feature: Admin can create a bordereau.
Scenario Outline: Admin create bordereau
    Given  Bordereau with <id> <reference> <nature> <status> <folder> <created_by> <sent_by> <exist>
    When Admin add this user to list
    Then The result should be <result>

    Examples: 
      | id  |  reference  | status  |nature      |       folder     |  sent_by   |     created_by  |  exist | result |   
      | 1   |  "444"      |   "444" | "3wm-TND"  | "444"            |  "444"     |     "4444"      |  "yes" | "no"   |   
      | 12  |  "44114"    |   "4"    | "3w  ND"   | "4444"           |  "444"     |     "4444"      |  "no"  | "yes"  |   
      
 
