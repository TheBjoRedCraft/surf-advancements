package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralRootAdvancement extends AdvancementDisplay {
  public GeneralRootAdvancement() {
    super(
        Material.COMPASS,
        "§x§0§a§8§8§a§b§lC§x§0§f§8§c§a§d§la§x§1§3§8§f§b§0§ls§x§1§8§9§3§b§2§lt§x§1§d§9§7§b§4§lC§x§2§2§9§a§b§7§lr§x§2§6§9§e§b§9§la§x§2§b§a§1§b§b§lf§x§3§0§a§5§b§e§lt§x§3§4§a§9§c§0§le§x§3§9§a§c§c§2§lr §x§3§e§b§0§c§5§lC§x§4§3§b§4§c§7§lo§x§4§7§b§7§c§9§lm§x§4§c§b§b§c§b§lm§x§5§1§b§f§c§e§lu§x§5§6§c§2§d§0§ln§x§5§a§c§6§d§2§li§x§5§f§c§a§d§5§lt§x§6§4§c§d§d§7§ly §x§6§8§d§1§d§9§lS§x§6§d§d§4§d§c§le§x§7§2§d§8§d§e§lr§x§7§7§d§c§e§0§lv§x§7§b§d§f§e§3§le§x§8§0§e§3§e§5§lr",
        AdvancementFrameType.CHALLENGE,
        true,
        false,
        0,
        0,
        "§fBetrete diesen Server. \n\n\n§7Hier findest du §6Events §7sowie \nden §6Survival Server. \n\n§6Weitere Informationen §7findest du auf §6unserer Website."
    );
  }
}
