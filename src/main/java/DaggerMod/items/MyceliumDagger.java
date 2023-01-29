package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.CustomSwordToolItem;

// Extends CustomSwordToolItem
public class MyceliumDagger extends CustomSwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public MyceliumDagger() {
        super(125, 30, 25, 20, 100);
    }

}
