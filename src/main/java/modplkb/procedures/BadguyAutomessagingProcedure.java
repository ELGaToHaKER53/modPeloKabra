package modplkb.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import modplkb.ModplkbMod;

import java.util.Map;

public class BadguyAutomessagingProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ModplkbMod.LOGGER.warn("Failed to load dependency entity for procedure BadguyAutomessaging!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<???> hi there,"), (false));
		}
	}
}
