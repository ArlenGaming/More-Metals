package more_metals.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class MMAxeItem extends AxeItem {

    public MMAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, FabricItemSettings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}
