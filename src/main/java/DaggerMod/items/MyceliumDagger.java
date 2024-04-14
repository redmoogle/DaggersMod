package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class MyceliumDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public MyceliumDagger() {
        super(1000);
        this.rarity = Rarity.UNCOMMON;
        this.attackAnimTime.setBaseValue(125);
        this.attackDamage.setBaseValue(30.0F).setUpgradedValue(1.0F, 200.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
