package DaggerMod;

import DaggerMod.items.*;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

@ModEntry
public class DaggerMod {

    public void init() {
        System.out.println("Thank you for using Daggers by Redmoogle!");
        ItemRegistry.registerItem("wooddagger", new WoodDagger(), 20, true);
        ItemRegistry.registerItem("copperdagger", new CopperDagger(), 50, true);
        ItemRegistry.registerItem("irondagger", new IronDagger(), 80, true);
        ItemRegistry.registerItem("golddagger", new GoldDagger(), 120, true);
        ItemRegistry.registerItem("frostdagger", new FrostDagger(), 200, true);
        ItemRegistry.registerItem("demonicdagger", new DemonicDagger(), 400, true);
        ItemRegistry.registerItem("tungstendagger", new TungstenDagger(), 600, true);
        ItemRegistry.registerItem("myceliumdagger", new MyceliumDagger(), 700, true);
    }

    public void postInit() {
        Recipes.registerModRecipe(new Recipe(
                "wooddagger",
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("anylog", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "copperdagger",
                RecipeTechRegistry.IRON_ANVIL,
                new Ingredient[]{
                        new Ingredient("copperbar", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "irondagger",
                RecipeTechRegistry.IRON_ANVIL,
                new Ingredient[]{
                        new Ingredient("ironbar", 10)
                }
        ).showAfter("copperdagger"));
        Recipes.registerModRecipe(new Recipe(
                "golddagger",
                RecipeTechRegistry.IRON_ANVIL,
                new Ingredient[]{
                        new Ingredient("goldbar", 10)
                }
        ).showAfter("irondagger"));
        Recipes.registerModRecipe(new Recipe(
                "frostdagger",
                RecipeTechRegistry.IRON_ANVIL,
                new Ingredient[]{
                        new Ingredient("frostshard", 10)
                }
        ).showAfter("golddagger"));
        Recipes.registerModRecipe(new Recipe(
                "demonicdagger",
                RecipeTechRegistry.DEMONIC,
                new Ingredient[]{
                        new Ingredient("demonicbar", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "tungstendagger",
                RecipeTechRegistry.ADVANCED_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("tungstenbar", 10)
                }
        ));

        Recipes.registerModRecipe(new Recipe(
                "myceliumdagger",
                RecipeTechRegistry.ADVANCED_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("myceliumbar", 10)
                }
        ));
    }

}
