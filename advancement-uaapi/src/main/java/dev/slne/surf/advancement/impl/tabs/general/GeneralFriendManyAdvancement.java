package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralFriendManyAdvancement extends AdvancementDisplay {

  public GeneralFriendManyAdvancement() {
    super(Material.POPPY,
        "Sozialer Schmetterling",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fSozialer Schmetterling\n\n\n§7Habe §630 Freunde.\n\n§7Informationen zum §6Freunde System\n§7findest du auf §6unserer Website."
    );
  }
}
