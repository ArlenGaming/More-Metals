package more_metals;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import more_metals.registry.ItemRegistry;

public class MMItemGroups {

    public static final ItemGroup MORE_METALS = FabricItemGroupBuilder.create(Utils.ID("moremetals")).icon(() -> new ItemStack(ItemRegistry.get("bronze_pickaxe"))).build();

}
