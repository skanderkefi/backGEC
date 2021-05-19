Feature: Get by reference

 
 Scenario Outline: get By reference
  
  Given Bordereau with reference <reference> <exist>
  When Admin get this bordereau with <reference>
  Then The bordereau retrieved should be <nul>
  
  
    Examples: 
    | reference  |  nul     | exist |
    | "ref1"     |  "no"    |  "yes"|
    | "ref2"     | "yes"    |  "no" |
       