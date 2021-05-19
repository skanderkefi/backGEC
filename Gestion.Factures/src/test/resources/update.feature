	Feature: Admin can update a facture.
Scenario Outline: Admin update facture by id
    Given  Admin retrieve facture with numFacture <numFacture> ,old dossier <olddossier> and new dossier <newdossier>
    When Admin update facture with numFacture <numFacture> at his olddossier <olddossier> with the newdossier <newdossier>
    Then assert that facture has newdossier <newdossier>

    Examples: 
      |     numFacture       |   olddossier      | newdossier       |
      |    "35"              |   "3wm"           | "comdist"        |
       
 