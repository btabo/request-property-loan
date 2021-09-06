Feature: Initialiser une nouvelle demande de crédit immo

  Background:
    Given un client de la banque
      | customerId | firstName | lastName | email             | mobilePhone |
      | 1          | Pierre    | Currie   | client1@banque.fr | 06666666666 |
      | 2          | Marie     | Currie   | client2@banque.fr | 07777777777 |

  Scenario Outline: "Achat Ancien" avec 2 empruneurs
    Given une nouvelle demande de crédit
      | transactionType   | propertyNature   | propertyUsage   | purchaseAmount   |
      | <transactionType> | <propertyNature> | <propertyUsage> | <purchaseAmount> |
    And cette demande de crédit est réalisée par des emprunteurs
      | customerId | borrowerType      | borowerRelationShip
      | 1          | PERSONNE_PHYSIQUE | MARRIED
      | 2          | PERSONNE_PHYSIQUE | MARRIED
    When on tente d'enregistrer cette demande
    Then la demande de crédit est enregistrée
    Examples:
      | transactionType    | purchaseAmount | propertyNature | propertyUsage        |
      | ACHAT_ANCIEN       | 300000         | APPARTEMENT    | RESIDENCE_PRINCIPALE |
      | ACHAT_CONSTRUCTION | 300000         | MAISON         | RESIDENCE_SECONDAIRE |


