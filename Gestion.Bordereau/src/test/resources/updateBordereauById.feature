	Feature: Admin can update a bordereau.
Scenario Outline: Admin update bordereau by id
    Given  Admin retrieve bordereau with ref <ref> ,old status <oldstatus> and new status <newstatus>
    When Admin update bordereau with ref <ref> at his status <oldstatus> with the new status <newstatus>
    Then assert that bordereau has new status <newstatus>

    Examples: 
      |     ref       |   oldstatus   | newstatus  |
      |    "35"       |   "en cour"   | "fait"     |
      
 