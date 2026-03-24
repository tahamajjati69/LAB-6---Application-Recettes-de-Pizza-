# Android Java – Application Pizza Recipes

## 📖 Description
Ce projet Android Java est une application mobile permettant de consulter différentes recettes de pizzas.  
- Elle illustre la mise en place d’un **système DAO/Service**
- L’utilisation d’un **Adapter personnalisé** pour alimenter une `ListView`
- Navigation entre plusieurs **Activities** (Splash, Liste, Détail).

---

## 📂 Structure du projet

```
app/
└── src/
└── main/
├── java/com/example/pizzarecipes/
│   ├── adapter/PizzaAdapter.java
│   ├── classes/Produit.java
│   ├── dao/IDao.java
│   ├── service/ProduitService.java
│   └── ui/
│       ├── SplashActivity.java
│       ├── ListPizzaActivity.java
│       └── PizzaDetailActivity.java
└── res/
├── layout/
│   ├── activity_list_pizza.xml
│   ├── activity_pizza_detail.xml
│   ├── activity_splash.xml
│   └── row_pizza.xml
└── mipmap/
└── pizza1.png ... pizza10.png
```
---

## ⚙️ Fonctionnalités
- **SplashActivity** : écran d’accueil avec logo, redirection automatique vers la liste après 2 secondes.
- **ListPizzaActivity** :
  - Affiche toutes les pizzas via `ListView`.
  - Utilise `PizzaAdapter` pour personnaliser l’affichage (image, nom, durée, prix).
  - Navigation vers le détail d’une pizza au clic.
- **PizzaDetailActivity** :
  - Affiche les informations complètes d’une pizza : image, titre, durée, prix, ingrédients, description, étapes.
  - Interface structurée avec `CardView` pour séparer les sections.
- **ProduitService** :
  - Singleton qui initialise les données (recettes de pizzas).
  - Implémente l’interface `IDao` pour les opérations CRUD.
- **PizzaAdapter** :
  - Adapter personnalisé pour afficher chaque pizza dans la liste.

---

## 🖥️ Exemple d’exécution
 



https://github.com/user-attachments/assets/8beb56dc-46cf-464c-bcfa-cd798b73388e




## 💡 Concepts pratiqués
- **DAO Pattern** pour la gestion des données.
- **Singleton** pour centraliser le service des produits.
- **ListView + Adapter personnalisé** pour l’affichage dynamique.
- **Intent & Extras** pour la navigation entre activités.
- **Layouts XML** (`ScrollView`, `CardView`, `FrameLayout`, `RelativeLayout`) pour une interface moderne et responsive.

---

## 🧑‍💻 Auteur
👤 **Majjati Mohamed Taha**  
📱 Développement Android Java  
🎓 Instructor : **Mr. LACHGAR**  
📅 13 Mars 2026
