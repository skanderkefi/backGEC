	Feature: Admin can update a fournisseur.
Scenario Outline: Admin update fournisseur by id
    Given  Admin retrieve fournisseur with idfiscale <idfiscale> ,old name <oldname> and new name <newname>
    When Admin update fournisseur with idfiscale <idfiscale> at his name <oldname> with the new name <newname>
    Then assert that fournisseur has new name <newname>

    Examples: 
      |     idfiscale       |   oldname      | newname       |
      |    "35"             |   "samsoung"   | "samsung"     |
       
 