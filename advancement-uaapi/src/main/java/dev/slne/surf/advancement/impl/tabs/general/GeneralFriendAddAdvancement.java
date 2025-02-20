package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralFriendAddAdvancement extends AdvancementDisplay {

  public GeneralFriendAddAdvancement() {
    super(Material.POPPY,
        "Neue Freundschaft",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fNeue Freundschaft\n\n\n§6Füge einen Freund §7hinzu.\n\n§7Informationen zum §6Freunde System\n§7findest du auf §6unserer Website."
    );
  }
}
