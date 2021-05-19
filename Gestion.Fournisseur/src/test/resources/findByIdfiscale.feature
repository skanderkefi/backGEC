Feature: Getting fournisseur

 
 Scenario Outline: get By idfiscale
  
  Given fournisseur with idfiscale <idfiscale> <exist>
  When Admin get this fournisseur with <idfiscale>
  Then The fournisseur retrieved should be <nul>
  
  
    Examples: 
    | idfiscale  |  nul     | exist |
    | "ref1"     |  "no"    |  "yes"|
    | "ref2"     | "yes"    |  "no" |
       