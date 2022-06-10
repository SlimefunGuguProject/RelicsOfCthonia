package ne.fnfal113.relicsofcthonia.relics.implementation;

import org.bukkit.Material;

import java.util.List;

public enum NetherMaterials {

    BASE_STONES_NETHER(Material.NETHERRACK, Material.BLACKSTONE, Material.BASALT),
    INFINIBURN_BLOCKS(Material.MAGMA_BLOCK),
    SOUL_BLOCKS(Material.SOUL_SOIL, Material.SOUL_SAND),
    WART_BLOCKS(Material.NETHER_WART_BLOCK, Material.WARPED_WART_BLOCK),
    GROW_MUSHROOM_BLOCKS(Material.CRIMSON_NYLIUM, Material.MYCELIUM, Material.PODZOL, Material.WARPED_NYLIUM),
    OTHER_BLOCKS(Material.GRAVEL, Material.NETHER_GOLD_ORE, Material.NETHER_QUARTZ_ORE, Material.ANCIENT_DEBRIS)
    ;

    List<Material> materials;

    NetherMaterials(Material... materials) {
        this.materials = List.of(materials);
    }

    public List<Material> getMaterial(){
        return this.materials;
    }

}
