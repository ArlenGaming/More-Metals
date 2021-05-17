package more_metals.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class MMSwordItem extends SwordItem {

    public MMSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, FabricItemSettings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}
