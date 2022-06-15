package ne.fnfal113.relicsofcthonia.relics.items.legendary;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import ne.fnfal113.relicsofcthonia.relics.abstracts.AbstractRelic;
import ne.fnfal113.relicsofcthonia.relics.implementation.Rarity;
import ne.fnfal113.relicsofcthonia.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class MysteriousHolocron extends AbstractRelic {

    @ParametersAreNonnullByDefault
    public MysteriousHolocron(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                       double dropChance, int piglinRewardAmount, int defaultDropSize) {
        super(itemGroup, item, recipeType, recipe, dropChance, piglinRewardAmount, defaultDropSize);
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public void onItemRightClick(PlayerInteractEvent event, Player player, ItemStack itemInOffhand) {
        List<Entity> entityList = new ArrayList<>();

        for (Entity en : player.getNearbyEntities(30, 30, 30)) {
            if(!(en instanceof Player) && Slimefun.getProtectionManager().hasPermission(Bukkit.getOfflinePlayer(player.getUniqueId()), en.getLocation(), Interaction.INTERACT_ENTITY)){
                entityList.add(en);

                en.getWorld().spawnParticle(Particle.FLASH, en.getLocation(), 0);
                en.remove();
            }
        }

        consumeRelic(itemInOffhand);
        if(!entityList.isEmpty()) {
            Utils.sendRelicMessage("&e哇, 那些实体发生什么事了? 它们是消失了么?!", player);
        } else {
            Utils.sendRelicMessage("&e异端跨越直接消失了?! 我想知道当附近有其他实体时, 会发生什么.", player);
        }
    }

}