Feature: Recommandation formule assurance pour acquisition bien BTA

 
Scenario: Recommandation de la formule d'assurance DC/PTIA/IPT-ITT90/PE

Given un emprunteur avec les caractéristiques suivantes
|age  | CSP | contratTravail |
| 35    | 22  | SALARIE_PRIVE  |

When On calcule la formule d'assurance groupe recommandé par défaut

Then la formule recommandée est "DC/PTIA/IPT-ITT90/PE"

Scenario Outline: Recommandation de formule d'assurance et des garanties minimales associées

Given un emprunteur avec les caractéristiques suivantes

|age  | CSP | contratTravail |
|<age>  | <CSP> | <contratTravail> |

When On calcule la formule d'assurance groupe recommandé par défaut

Then la formule recommandée est "DC/PTIA/IPT-ITT90/PE"

Examples:
| age    | CSP  | contratTravail  | Formule |
| 30    | 22  | SALARIE_PRIVE  |DC/PTIA/IPT-ITT90/PE|
| 60    | 22  | SALARIE_PRIVE  |DC/PTIA/IPT-ITT90/PE|