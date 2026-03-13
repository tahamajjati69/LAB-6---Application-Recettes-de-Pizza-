package com.example.pizzarecipes.services;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {


    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed();
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProduitService();
        }
        return INSTANCE;
    }

    private void seed() {

        data.add(new Produit(
                "BARBECUED CHICKEN PIZZA",
                3,
                R.mipmap.pizza1,
                "35 min",
                "- chicken breast\n- barbecue sauce\n- pizza crust\n- gouda cheese\n- onion\n- cilantro",
                "Pizza au poulet barbecue simple et rapide.",
                "STEP 1: Griller le poulet.\nSTEP 2: Ajouter la garniture.\nSTEP 3: Cuire la pizza."
        ));

        data.add(new Produit(
                "BRUSCHETTA PIZZA",
                5,
                R.mipmap.pizza2,
                "35 min",
                "- sausage\n- pepperoni\n- mozzarella\n- tomatoes\n- basil\n- garlic",
                "Pizza italienne avec tomates fraîches et basilic.",
                "STEP 1: Cuire la saucisse.\nSTEP 2: Ajouter les ingrédients.\nSTEP 3: Cuire au four."
        ));

        data.add(new Produit(
                "SPINACH PIZZA",
                2,
                R.mipmap.pizza3,
                "25 min",
                "- pizza crust\n- Alfredo sauce\n- tomatoes\n- spinach\n- Italian cheese",
                "Pizza végétarienne facile à préparer.",
                "STEP 1: Préparer la pâte.\nSTEP 2: Ajouter la garniture.\nSTEP 3: Cuire."
        ));

        data.add(new Produit(
                "DEEP-DISH SAUSAGE PIZZA",
                8,
                R.mipmap.pizza4,
                "45 min",
                "- yeast\n- flour\n- herbs\n- mozzarella\n- sausage",
                "Pizza épaisse très savoureuse.",
                "STEP 1: Préparer la pâte.\nSTEP 2: Ajouter les couches.\nSTEP 3: Cuire au four."
        ));

        data.add(new Produit(
                "HOMEMADE PIZZA",
                4,
                R.mipmap.pizza5,
                "50 min",
                "- yeast\n- flour\n- tomato sauce\n- beef\n- onion\n- mozzarella",
                "Pizza maison classique.",
                "STEP 1: Préparer la pâte.\nSTEP 2: Ajouter la sauce et les ingrédients.\nSTEP 3: Cuire."
        ));

        data.add(new Produit(
                "PESTO CHICKEN PIZZA",
                3,
                R.mipmap.pizza6,
                "50 min",
                "- chicken\n- pesto\n- peppers\n- mushrooms\n- mozzarella",
                "Pizza au poulet et pesto.",
                "STEP 1: Cuire le poulet.\nSTEP 2: Ajouter la garniture.\nSTEP 3: Cuire."
        ));

        data.add(new Produit(
                "LOADED MEXICAN PIZZA",
                3,
                R.mipmap.pizza7,
                "30 min",
                "- black beans\n- tomatoes\n- jalapeno\n- spinach\n- cheese",
                "Pizza mexicaine épicée.",
                "STEP 1: Préparer les ingrédients.\nSTEP 2: Ajouter sur la pâte.\nSTEP 3: Cuire."
        ));

        data.add(new Produit(
                "BACON CHEESEBURGER PIZZA",
                2,
                R.mipmap.pizza8,
                "20 min",
                "- ground beef\n- bacon\n- pickles\n- mozzarella\n- cheddar",
                "Pizza inspirée du cheeseburger.",
                "STEP 1: Cuire la viande.\nSTEP 2: Ajouter sur la pizza.\nSTEP 3: Cuire."
        ));

        data.add(new Produit(
                "PIZZA MARGHERITA",
                1,
                R.mipmap.pizza9,
                "30 min",
                "- tomatoes\n- mozzarella\n- basil\n- olive oil",
                "Pizza italienne classique.",
                "STEP 1: Préparer la pâte.\nSTEP 2: Ajouter les ingrédients.\nSTEP 3: Cuire."
        ));

        data.add(new Produit(
                "PEPPERONI SAUSAGE PIZZA",
                5,
                R.mipmap.pizza10,
                "45 min",
                "- pepperoni\n- sausage\n- mozzarella\n- pizza sauce",
                "Pizza riche avec pepperoni et saucisse.",
                "STEP 1: Préparer la pâte.\nSTEP 2: Ajouter la garniture.\nSTEP 3: Cuire."
        ));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }

}
