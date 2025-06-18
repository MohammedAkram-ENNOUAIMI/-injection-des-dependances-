# Projet Injection de Dépendances

Ce projet est un exemple simple d'injection de dépendances en utilisant des interfaces et des classes implémentant ces interfaces.

## Structure du Projet

Le projet est organisé comme suit :

- **Interfaces :**
  - `IDao`: Définit une méthode `getData()` qui retourne un double.
  - `IMetier`: Définit une méthode `calcul()` qui retourne un double.

- **Implémentations :**
  - `DaoImpl`: Implémente l'interface `IDao` en fournissant une implémentation concrète de la méthode `getData()`.
  - `MetierImpl`: Implémente l'interface `IMetier` en utilisant l'interface `IDao` pour effectuer des opérations de gestion.

- **Classes Additionnelles :**
  - `DaoImpl2` : Une autre implémentation de l'interface `IDao`.
  - `DaoImplWS` : Une implémentation de l'interface `IDao` qui utilise un service web.

- **Injection de Dépendances :**
  - `Presentation` : Utilise une injection de dépendances basée sur l'instanciation statique (`new`) pour obtenir des instances de `DaoImpl` et `MetierImpl`.
  - `Pres2` : Effectue l'injection de dépendance basée sur un fichier de configuration `config.txt`.

## Utilisation

Pour utiliser ce projet, veuillez suivre ces étapes :

1. Clonez le dépôt vers votre système local.
2. Importez le projet dans votre environnement de développement préféré.
3. Exécutez le programme en exécutant la classe principale.
