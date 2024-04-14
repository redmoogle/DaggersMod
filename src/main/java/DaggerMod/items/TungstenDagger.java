package DaggerMod.items;

import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class TungstenDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public TungstenDagger() {
        super(2000);
        this.rarity = Rarity.RARE;
        this.attackAnimTime.setBaseValue(125);
        this.attackDamage.setBaseValue(55.0F).setUpgradedValue(1.0F, 375.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
