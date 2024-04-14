package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class FrostDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public FrostDagger() {
        super(1000);
        this.rarity = Rarity.RARE;
        this.attackAnimTime.setBaseValue(125);
        this.attackDamage.setBaseValue(30.0F).setUpgradedValue(1.0F, 200.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
