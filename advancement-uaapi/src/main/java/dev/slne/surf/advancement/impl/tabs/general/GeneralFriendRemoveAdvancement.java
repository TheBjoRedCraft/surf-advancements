package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralFriendRemoveAdvancement extends AdvancementDisplay {

  public GeneralFriendRemoveAdvancement() {
    super(Material.POPPY,
        "Ende einer Freundschaft",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fEnde einer Freundschaft\n\n\n§6Entferne einen Freund.\n\n§7Informationen zum §6Freunde System\n§7findest du auf §6unserer Website."
    );
  }
}
