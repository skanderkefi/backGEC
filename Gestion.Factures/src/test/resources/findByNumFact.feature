Feature: Getting facture

 
 Scenario Outline: get By NumFacture
  
  Given facture with numFacture <numFacture> <exist>
  When Admin get this facture with <numFacture>
  Then The facture retrieved should be <nul>
  
  
    Examples: 
    | numFacture  |  nul     | exist |
    | "ref1"      |  "no"    |  "yes"|
    | "ref2"      | "yes"    |  "no" |
       