package DaggerMod.items;
import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class IronDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public IronDagger() {
        super(200);
        this.rarity = Rarity.NORMAL;
        this.attackAnimTime.setBaseValue(200);
        this.attackDamage.setBaseValue(22.0F).setUpgradedValue(1.0F, 120.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
