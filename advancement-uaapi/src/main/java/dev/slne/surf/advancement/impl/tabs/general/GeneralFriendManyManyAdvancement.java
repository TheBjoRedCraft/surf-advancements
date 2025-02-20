package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralFriendManyManyAdvancement extends AdvancementDisplay {

  public GeneralFriendManyManyAdvancement() {
    super(Material.POPPY,
        "Mega-Netzwerker",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fMega-Netzwerker\n\n\n§7Habe §6100 Freunde.\n\n§7Informationen zum §6Freunde System\n§7findest du auf §6unserer Website."
    );
  }
}
