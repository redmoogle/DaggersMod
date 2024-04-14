package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class GoldDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public GoldDagger() {
        super(300);
        this.rarity = Rarity.UNCOMMON;
        this.attackAnimTime.setBaseValue(125);
        this.attackDamage.setBaseValue(24.0F).setUpgradedValue(1.0F, 175.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
