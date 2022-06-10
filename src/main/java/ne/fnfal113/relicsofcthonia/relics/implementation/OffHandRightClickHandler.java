package ne.fnfal113.relicsofcthonia.relics.implementation;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public interface OffHandRightClickHandler {

    void onItemRightClick(PlayerInteractEvent event, Player player, ItemStack itemInOffhand);

}
