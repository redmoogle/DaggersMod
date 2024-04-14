package DaggerMod.items;
import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem;

// Extends CustomSwordToolItem
public class DemonicDagger extends SwordToolItem {

    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>

    public DemonicDagger() {
        super(1250);
        this.rarity = Rarity.RARE;
        this.attackAnimTime.setBaseValue(125);
        this.attackDamage.setBaseValue(35.0F).setUpgradedValue(1.0F, 250.0F);
        this.attackRange.setBaseValue(25);
        this.knockback.setBaseValue(100);
    }

}
