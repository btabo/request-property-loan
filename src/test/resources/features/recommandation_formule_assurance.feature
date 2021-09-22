Feature: Recommandation d'une formule d'assurance d'un crédit immobilier.

  Scenario: Recommandation de la formule d'assurance DC/PTIA/IPT-ITT90/PE
    And un emprunteur avec les caractéristiques suivantes
      | age | CSP | statutProfessionnel |
      | 35  | 22  | SALARIE_PRIVE       |
    When On calcule la formule d'assurance groupe recommandée
    Then la formule recommandée est "DC/PTIA/IPT-ITT90/PE"

  Scenario Outline: Recommandation de formule d'assurance et des garanties minimales associées
    Given un emprunteur avec les caractéristiques suivantes
      | age   | CSP   | statutProfessionnel   |
      | <age> | <CSP> | <statutProfessionnel> |
    When On calcule la formule d'assurance groupe recommandée
    Then la formule recommandée est "<formule>"
    Examples:
      | age | CSP | statutProfessionnel | formule              |
      | 30  | 22  | SALARIE_PRIVE       | DC/PTIA/IPT-ITT90/PE |
      | 60  | 22  | SALARIE_PRIVE       | DC/PTIA/IPT-ITT90/PE |
      | 60  | 22  | SALARIE_PUBLIC      | DC/PTIA/IPT-ITT90    |
      | 60  | 22  | SALARIE_PUBLIC      | DC/PTIA/IPT-ITT90    |
