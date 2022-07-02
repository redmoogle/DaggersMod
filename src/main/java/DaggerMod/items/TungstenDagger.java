package daggermod.items;

import necesse.inventory.item.toolItem.swordToolItem.CustomSwordToolItem;
import necesse.inventory.item.Item;

// Extends CustomSwordToolItem
public class TungstenDagger extends CustomSwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public TungstenDagger() {
        super(Item.Rarity.UNCOMMON, 125, 55, 25, 20, 100);
    }

}
