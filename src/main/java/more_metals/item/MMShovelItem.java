package more_metals.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class MMShovelItem extends ShovelItem {

    public MMShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, FabricItemSettings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}
