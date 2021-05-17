package more_metals.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class MMHoeItem extends HoeItem {

    public MMHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, FabricItemSettings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}
