package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.CustomSwordToolItem;

// Extends CustomSwordToolItem
public class GoldDagger extends CustomSwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public GoldDagger() {
        super(125, 24, 25, 20, 100);
    }

}
