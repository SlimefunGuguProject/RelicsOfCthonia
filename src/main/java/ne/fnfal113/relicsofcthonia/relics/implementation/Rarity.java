package ne.fnfal113.relicsofcthonia.relics.implementation;

import javax.annotation.Nonnull;

public enum Rarity {

    COMMON("普通"),
    UNCOMMON("罕见"),
    RARE("稀有"),
    EPIC("史诗"),
    LEGENDARY("传说");

    private final String rarityName;

    Rarity(String name) {
        rarityName = name;
    }

    @Nonnull
    public String getRarityName() {
        return rarityName;
    }
}
