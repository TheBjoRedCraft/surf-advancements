package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralClanCreateAdvancement extends AdvancementDisplay {

  public GeneralClanCreateAdvancement() {
    super(Material.POPPY,
        "In einer Gruppe vereint",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fIn einer Gruppe vereint\n\n\n§6Erstelle §7einen §6Clan.\n\n§7Informationen zum §6Clan System\n§7findest du auf §6unserer Website."
    );
  }
}
