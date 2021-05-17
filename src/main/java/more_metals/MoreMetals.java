package more_metals;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import more_metals.registry.ItemRegistry;

public class MoreMetals implements ModInitializer {

    public static final String MOD_ID = "more_metals";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        LOGGER.info("[More Metals] has been initiated.");
    }

}
