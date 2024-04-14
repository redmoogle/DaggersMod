package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class WoodDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public WoodDagger() {
        super(25);
        this.rarity = Rarity.COMMON;
        this.attackAnimTime.setBaseValue(125);
        this.attackDamage.setBaseValue(15.0F).setUpgradedValue(1.0F, 80.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
