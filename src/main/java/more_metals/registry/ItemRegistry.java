package more_metals.registry;

import more_metals.MMItemGroups;
import more_metals.Utils;
import more_metals.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private ItemRegistry(){}

    private static final HashMap<String, Item> ITEMS = new HashMap<>();
	
	static {
        ITEMS.put("bronze_pickaxe", new MMPickaxeItem(MMToolMaterials.BRONZE, 1, -2.8F, new FabricItemSettings().group(MMItemGroups.MORE_METALS)));
        ITEMS.put("bronze_axe", new MMAxeItem(MMToolMaterials.BRONZE, 6, -3.1F, new FabricItemSettings().group(MMItemGroups.MORE_METALS)));
        ITEMS.put("bronze_shovel", new MMShovelItem(MMToolMaterials.BRONZE, 1.5F, -3.0F, new FabricItemSettings().group(MMItemGroups.MORE_METALS)));
        ITEMS.put("bronze_sword", new MMSwordItem(MMToolMaterials.BRONZE, 3, -2.4F, new FabricItemSettings().group(MMItemGroups.MORE_METALS)));
        ITEMS.put("bronze_hoe", new MMHoeItem(MMToolMaterials.BRONZE, -2, -1, new FabricItemSettings().group(MMItemGroups.MORE_METALS)));

        ITEMS.put("bronze_ingot", new Item(new FabricItemSettings().group(MMItemGroups.MORE_METALS)));
    }

    public static void register() {
        for (Map.Entry<String, Item> item : ITEMS.entrySet()) {
            Registry.register(Registry.ITEM, Utils.ID(item.getKey()), item.getValue());
        }
    }

    public static Item get(String id) {
	    return ITEMS.getOrDefault(id, Items.AIR);
    }

}
