package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.CustomSwordToolItem;

// Extends CustomSwordToolItem
public class IronDagger extends CustomSwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public IronDagger() {
        super(125, 22, 25, 20, 100);
    }

}
