package net.guizhanss.relicsofcthonia.handlers;

import net.guizhanss.relicsofcthonia.types.LoreType;

public interface RelicLoreHandler {
    String handle(String raw, LoreType type);
}
