      	Feature: Admin can create a fournisseur.
Scenario Outline: Admin create fournisseur
    Given  fournisseur with <iderp> <name> <categorie> <idfiscale>  <nationnalite> <adresse> <createdby> <exist>
    When Admin add this fournisseur to list
    Then The result should be <result>

    Examples: 
      | iderp  |  name  | categorie    |       idfiscale   | nationnalite   |  adresse   |     createdby   | exist | result |   
      | 1      |  "name"  | "cat"      |       "idF"       | "nat"          |  "@"       |     "45785"     | "yes" | "no"   |   
      | 1      |  "fname" | "fcat"     |       "fidF"      | "fnat"         |  "f@"      |     "f45785"    | "no"  | "ok"   |   
      
 
 