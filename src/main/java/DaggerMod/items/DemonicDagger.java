package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.CustomSwordToolItem;
import necesse.inventory.item.Item;

// Extends CustomSwordToolItem
public class DemonicDagger extends CustomSwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public DemonicDagger() {
        super(Item.Rarity.COMMON, 125, 35, 25, 20, 100);
    }

}
