package DaggerMod.items;
import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class CopperDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public CopperDagger() {
        super(125);
        this.rarity = Rarity.NORMAL;
        this.attackAnimTime.setBaseValue(125);
        this.attackDamage.setBaseValue(19.0F).setUpgradedValue(1.0F, 150.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
