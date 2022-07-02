package daggermod.daggers;

import necesse.inventory.item.toolItem.swordToolItem.CustomSwordToolItem;

// Extends CustomSwordToolItem
public class FrostDagger extends CustomSwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public FrostDagger() {
        super(125, 30, 25, 20, 100);
    }

}
