package ne.fnfal113.relicsofcthonia.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import ne.fnfal113.relicsofcthonia.RelicsOfCthonia;
import org.bukkit.NamespacedKey;

public class RelicItems {

    public static final NestedItemGroup RELIC_MAIN_GROUP = new NestedItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "main_group"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "caf59b8aa0f83546ef0d178ccf87e7ed88cf7858caae79b3633cbd75b650525f")),
                    "&6克苏尼亚遗物"));

    public static final SubItemGroup COMMON_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "47ec41e0df8e170d97f9b9af1d65edad4979c78c89b01b180f389ee08a61af82")),
                    "&a普通遗物"));

    public static final SubItemGroup UNCOMMON_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ba6dac8035d361ba7f2c2a614b4ebaafc1e5e3101f85beef683536f337e5090")),
                    "&7罕见遗物"));

    public static final SubItemGroup RARE_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "38c0f04bcabab2e0f0eee0dbdfc6ec4b4c65ecc1c1e3237c3d1d98b863b2f73")),
                    "&9稀有遗物"));

    public static final SubItemGroup EPIC_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2ee4a5cd4ee6e989a63dc41c4b40d83f0d58598e7ecdf2c94dfeec0ada02ec93")),
                    "&d史诗遗物"));

    public static final SubItemGroup LEGENDARY_RELIC = new SubItemGroup(
            new NamespacedKey(RelicsOfCthonia.getInstance(), "relic_items"),
            RELIC_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2d0bdf39b54f49692fb379b4eb04d1eb4a00e78ed3911ad3b63a7e5bf3176837")),
                    "&6传说遗物"));

    public static final SlimefunItemStack COMMON_RELIC_CTHONIAN_PEARL = new SlimefunItemStack(
            "COMMON_RELIC_CTHONIAN_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "377d4a206d7757f479f332ec1a2bbbee57cef97568dd88df81f4864aee7d3d98")),
            "&a克苏尼亚珍珠",
            "",
            "&b通常被克苏尼亚人用于交通运输,",
            "&b因为被大量生产,",
            "&b所以在荒野随处可见",
            "",
            "&d稀有度: &a普通",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_RING_OF_SUFFERING = new SlimefunItemStack(
            "COMMON_RELIC_RING_OF_SUFFERING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2462ba9115b808a6b7ff16851ff3b4c9e85add489deb7c15110f8cc6bb6d95aa")),
            "&a苦难之戒",
            "",
            "&b这种戒指是给克苏尼亚的罪犯的,",
            "&b作为他们对政体或城市所犯罪行的惩罚.",
            "",
            "&d稀有度: &a普通",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_FISHING_SACK = new SlimefunItemStack(
            "COMMON_RELIC_FISHING_SACK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "be8cd3f57d9fe1ac3cd54fb85f3c96a95479b14f99d2e5a0119f5a52c21ec327")),
            "&a钓鱼袋",
            "",
            "&b曾被克苏尼亚的渔夫们用于",
            "&b存放钓到的鱼, 并且可以作为",
            "&b背包或斗篷使用, 非常方便",
            "",
            "&d稀有度: &a普通",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_PETTY_MARBLE_BLOCK = new SlimefunItemStack(
            "COMMON_RELIC_PETTY_MARBLE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "785a206697d35709ce271f3853933d8a4b4ef105629d2d74e4ad93ce70b1fc0c")),
            "&a一小块大理石",
            "",
            "&b一块来自克苏尼亚采石场的",
            "&b普通大理石, 虽然只剩下一小块,",
            "&b但仍有一些价值",
            "",
            "&d稀有度: &a普通",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_HEALING_POTION = new SlimefunItemStack(
            "COMMON_RELIC_HEALING_POTION",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6b4a5c29d901721851d8868b9075f49c476a894098c7ef2665813c552bbc9add")),
            "&a治疗药水",
            "",
            "&b这种曾经克苏尼亚人都使用的",
            "&b治疗药水保存至今, 也许",
            "&b并不像以前那么有效,",
            "&b但它使用起来依然很方便",
            "",
            "&d稀有度: &a普通",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_LEATHER_HELMET = new SlimefunItemStack(
            "COMMON_RELIC_LEATHER_HELMET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "a804b82567acbae7c0fafe6538fd0ad6a826bd2f1ffa9f2ffa0cb78c0c2d28d2")),
            "&a皮革头盔",
            "",
            "&b通常是克苏尼亚军队使用,",
            "&b特别是那些普通士兵.",
            "&b非常轻便, 能让人更加灵活.",
            "",
            "&d稀有度: &a普通",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack COMMON_RELIC_MUSHROOM = new SlimefunItemStack(
            "COMMON_RELIC_MUSHROOM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "c9d9df8213a1ad4660589c8318608d791bac3a77e373a3fb55d36e95e7234c04")),
            "&a蘑菇",
            "",
            "&b通常被封存于地下,",
            "&b是一种生存佳肴,",
            "&b常见于克苏尼亚的郊区.",
            "&b食用后可获得大量能量.",
            "",
            "&d稀有度: &a普通",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_PINK_SALT = new SlimefunItemStack(
            "UNCOMMON_RELIC_PINK_SALT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6d9d3005c9368ced2992eaf386acfdc958ae24845a72fd5b335a780cb3e12a31")),
            "&7粉盐",
            "",
            "&b是用来酿制药水的材料,",
            "&b可以在克苏尼亚的thrace区域找到.",
            "",
            "&d稀有度: &7罕见",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_SKULL_HAT = new SlimefunItemStack(
            "UNCOMMON_RELIC_SKULL_HAT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "567c420bdba7ca36c968d4d1368564af7956379637aa431db68198d6254bbedb")),
            "&7骷髅帽",
            "",
            "&b在纪念亡灵时穿戴.",
            "&b它并不常见, 因为它只是",
            "&b一件季节性物品.",
            "",
            "&d稀有度: &7罕见",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_CTHONIAN_TOKEN = new SlimefunItemStack(
            "UNCOMMON_RELIC_CTHONIAN_TOKEN",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1326cafa585acf7c04f19a3d9359ba778557ae4cd790021afc648988653bb99b")),
            "&7克苏尼亚代币",
            "",
            "&b用于支付商品和服务的一种货币.",
            "&b但没有人知道实际的货币是什么样的.",
            "",
            "&d稀有度: &7罕见",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_AGED_WINE = new SlimefunItemStack(
            "UNCOMMON_RELIC_AGED_WINE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "bd2b65b79b4904514a0fc7232ea89a9e8c6ac60ee3dba1b5975b7755127338a4")),
            "&7陈年老酒",
            "",
            "&b200年以上的老酒,",
            "&b是荒芜的克苏尼亚",
            "&b仅存的物品之一.",
            "",
            "&d稀有度: &7罕见",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_TANZANITE_BLOCK = new SlimefunItemStack(
            "UNCOMMON_RELIC_TANZANITE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e32b72ad6ea8149dda6690f76db523f5bb11579af32242397265641b60090246")),
            "&7坦桑石块",
            "",
            "&b在克苏尼亚采石场中开采出的",
            "&b罕见的矿物块, 它还没有被",
            "&b完全挖掘出来",
            "",
            "&d稀有度: &7罕见",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_BLUE_GLOWSTONE = new SlimefunItemStack(
            "UNCOMMON_RELIC_BLUE_GLOWSTONE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "904bef1ff44f5c979639c574b55187ce236c3cf173295ad45b50407fef4e92")),
            "&7蓝色荧石",
            "",
            "&b一种在克苏尼亚建筑中",
            "&b并不常见的发光方块.",
            "",
            "&d稀有度: &7罕见",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack UNCOMMON_RELIC_GRAY_BERRY = new SlimefunItemStack(
            "UNCOMMON_RELIC_GRAY_BERRY",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6e7653873d0a3a29d4c6a32552ee7db0c2342a1b700171c4cd337c9e9aff68f2")),
            "&7灰莓",
            "",
            "&b我想知道它们为什么是灰色的,",
            "&b但它们在地下却保存完好?",
            "",
            "&d稀有度: &7罕见",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_MARRIAGE_RING = new SlimefunItemStack(
            "RARE_RELIC_MARRIAGE_RING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "12ed9a330d08be07d17cfa6a296e7f1b5f82bf9f4144596f1d23d72d9721b7f8")),
            "&9结婚戒指",
            "",
            "&b一种克苏尼亚研究员",
            "&b所追求的特殊戒指.",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_BLAZE_ASHES = new SlimefunItemStack(
            "RARE_RELIC_BLAZE_ASHES",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "93068a116f66d4cf13b5febe23719186421bce6a8ab51e321b3a182b5d0f0169")),
            "&9烈焰余烬",
            "",
            "&b在克苏尼亚荒废后",
            "&b留下的一些灰烬,",
            "&b其中包含了克苏尼亚研究员",
            "&b都不了解的未知元素",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_CROSSED_SWORDS = new SlimefunItemStack(
            "RARE_RELIC_CROSSED_SWORDS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6a5361b52daf4f1c5c5480a39faaa10897595fa5763f757bdda3956588fec678")),
            "&9交叉双剑",
            "",
            "&b在克苏尼亚玫瑰战争期间",
            "&b被士兵丢弃.",
            "&b虽然已经无法使用,",
            "&b但作为稀有遗物它仍有价值.",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_CERULEAN_GEM = new SlimefunItemStack(
            "RARE_RELIC_CERULEAN_GEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e4e71671db5f69d2c46a0d72766b249c1236d726782c00a0e22668df5772d4b9")),
            "&9天蓝宝石",
            "",
            "&b一种稀有的宝石, 只能在",
            "&b克苏尼亚的波罗的海区域找到.",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_TERRACOTTA_POT = new SlimefunItemStack(
            "RARE_RELIC_TERRACOTTA_POT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "79e73f08459f2053f6acabeedbd6c0ef2c508830222ab1c0066ca9d9ffb7935e")),
            "&9陶罐",
            "",
            "&b稀有的陶器,",
            "&b上面有丰富的花鸟画, ",
            "&b描绘了克苏尼亚人的日常",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_GOLDEN_JAR = new SlimefunItemStack(
            "RARE_RELIC_GOLDEN_JAR",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7b32617ae031163baf549b6e113f6c401470faac4bdbe9beb75c19d9aad83f8e")),
            "&9黄金罐头",
            "",
            "&b来自早期克苏尼亚的",
            "&b闪亮黄金罐头, ",
            "&b通常只有高级贵族拥有.",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RARE_RELIC_HORN_OF_TAURUS = new SlimefunItemStack(
            "RARE_RELIC_HORN_OF_TAURUS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "79b8d0cf93532c1b6c70223cdd0440ef6def2ad436b51e2850ca8e5c64e84470")),
            "&9金牛号角",
            "",
            "&b另一个因其历史价值",
            "&b而被猪灵追捧的稀有物品.",
            "",
            "&d稀有度: &9稀有",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_LUMINOUS_PEARL = new SlimefunItemStack(
            "EPIC_RELIC_LUMINOUS_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "2dbd4e5d3d9c05a036fb62e6e70faf9e6f98d294f9d006781c144c9f15b87715")),
            "&d发光珍珠",
            "",
            "&b只能在克苏尼亚的黑海中",
            "&b找到的闪亮珍珠.",
            "",
            "&d稀有度: &d史诗",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_VALIANT_TALISMAN = new SlimefunItemStack(
            "EPIC_RELIC_VALIANT_TALISMAN",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "50857d0860dc9e21461126a444262b8d70d5ed9a8aed51144a0be03bb5a41899")),
            "&d勇敢者护身符",
            "",
            "&b仅授予克苏尼亚的高级士兵,",
            "&b象征着在消耗战争中的英勇行为",
            "",
            "&d稀有度: &d史诗",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_FLAWLESS_AQUA_GEM = new SlimefunItemStack(
            "EPIC_RELIC_FLAWLESS_AQUA_GEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "a11067bae82704b15490af20a8a60626321fe677195b9e5bd57e6aa79059503d")),
            "&d完美的水之宝石",
            "",
            "&b宝石收藏家对这种宝石充满期待,",
            "&b它只能在克苏尼亚辽阔的白海中找到.",
            "",
            "&d稀有度: &d史诗",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_BOTTLE_O_POWER = new SlimefunItemStack(
            "EPIC_RELIC_BOTTLE_O_POWER",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "348a7ea198ec4efd8b56bcda8aa4230039e04d1338ee98fa85897bd4f342d632")),
            "&d力量之瓶",
            "",
            "&b一种用魔法填充的瓶子,",
            "&b可以通过增强克苏尼亚士兵",
            "&b的力量, 速度, 让他们在战斗中",
            "&b获得优势.",
            "",
            "&d稀有度: &d史诗",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_FERVOR_HELMET = new SlimefunItemStack(
            "EPIC_RELIC_FERVOR_HELMET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d47cf6e12d12a5eb161759ba95689a9237ec111473e92a140ecab0158dfd258")),
            "&d狂热者头盔",
            "",
            "&b狂热者会拥抱战斗的荣耀,",
            "&b&m直到需要重新集结部队.",
            "&b这种复刻品非常容易受到",
            "&b贸易商人的青睐.",
            "",
            "&d稀有度: &d史诗",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack EPIC_RELIC_THUNDER_IN_A_BOTTLE = new SlimefunItemStack(
            "EPIC_RELIC_THUNDER_IN_A_BOTTLE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ab3616f523bf5a00bf2b3e9fb8314c47390b90a5ca68c5db3684acd567430cd3")),
            "&d闪电之瓶",
            "",
            "&b这个充满能量的瓶子",
            "&b可以召唤闪电.",
            "",
            "&d稀有度: &d史诗",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_MYSTERIOUS_HOLOCRON = new SlimefunItemStack(
            "LEGENDARY_RELIC_MYSTERIOUS_HOLOCRON",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "b069c4498b7e4e90276fee28786bf5e9b3ff8b39d667d36a6923d880a627ab77")),
            "&6异端跨越",
            "",
            "&b在克苏尼亚的地牢中发现,",
            "&b因其具有的研究以及历史价值,",
            "&b它被研究人员高度关注",
            "",
            "&d稀有度: &6传说",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_EYE_OF_SAURON = new SlimefunItemStack(
            "LEGENDARY_RELIC_EYE_OF_SAURON",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "86648a14748a3b00ef6391f669ca19b8a91ec2f31f43a99cdff9f7b511869f62")),
            "&6索伦之眼",
            "",
            "&b传说中索伦的眼睛,",
            "&b据说可通过击杀索伦之塔",
            "&b中的高阶阿努尔卫队获得.",
            "",
            "&d稀有度: &6传说",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_SKULL_OF_PROMETHEUS = new SlimefunItemStack(
            "LEGENDARY_RELIC_SKULL_OF_PROMETHEUS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "662196e42def995819298fbd2a9bbfc2f45564fd448faf9ac9bed7bb87754574")),
            "&6普罗米修斯头骨",
            "",
            "&bThe legendary skull of prometheus",
            "&bdroppped by slaying prometheus mobs",
            "&bin the dark valleys of cthonia",
            "",
            "&d稀有度: &6传说",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_MAGMA_GAUNTLET = new SlimefunItemStack(
            "LEGENDARY_RELIC_MAGMA_GAUNTLET",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "168a2bfe6e56ddea103de8cec000efa83ebb9a959c68d82402543c01d4137d26")),
            "&6Magma Gauntlet",
            "",
            "&bOnly the mighty can obtain this item",
            "&bfrom the depths of hellica, a magma",
            "&bformed gauntlet from the ancient past",
            "&bduring the golden age of cthonia",
            "",
            "&d稀有度: &6传说",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_GLAZING_PEARL = new SlimefunItemStack(
            "LEGENDARY_RELIC_GLAZING_PEARL",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "46e0a3cc6657d4205818ffef5cc7b7e36c381d4269b69010c7297a6fa68d83d7")),
            "&6Glazing Pearl",
            "",
            "&bOh glazing pearl, I seek for wisdom",
            "&band knowledge to relive the past for",
            "&bwhen cthonia still exist",
            "",
            "&d稀有度: &6传说",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack LEGENDARY_RELIC_SAPPHIRE_RING = new SlimefunItemStack(
            "LEGENDARY_RELIC_SAPPHIRE_RING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "dd8df6feff41a987f53a1e03c298017771767b263808203386b7737a9c86613f")),
            "&6蓝宝石戒指",
            "",
            "&b只有克苏尼亚的国王",
            "&b才能佩戴的戒指,",
            "&b象征着克苏尼亚的繁荣.",
            "",
            "&d稀有度: &6传说",
            "&d完整度: " + "&d%",
            "",
            "&e掉落几率: " + "&e%",
            "&e掉落于:",
            "",
            "&a猪灵交易成功率:",
            "&a‣ 基于遗物完整度",
            "",
            "&a猪灵交换物列表:",
            "",
            "&e右键点击猪灵可与其交易遗物",
            "",
            "&e副手手持该遗物并右键点击",
            "&e可以使用该遗物",
            "",
            "&6Φ 克苏尼亚遗物 Φ"
    );

    public static final SlimefunItemStack RELIC_DROP_TYPE = new SlimefunItemStack(
            "RELIC_DROP_TYPE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7406e45318e9a4a6bfe132f202fe3ceac15d11eaedbef1eb06a376db433090a8")),
            "&6获取遗物",
            "",
            "&e你需要根据遗物的说明",
            "&e破坏指定方块或击杀指定生物",
            "&e来获取该遗物"
    );

}
