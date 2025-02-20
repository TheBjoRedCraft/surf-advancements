package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralFriendSelfAdvancement extends AdvancementDisplay {

  public GeneralFriendSelfAdvancement() {
    super(Material.POPPY,
        "Selbstgespräch",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fSelbstgespräch\n\n\n§6Füge dich selbst §7als Freund hinzu.\n\n§7Informationen zum §6Freunde System\n§7findest du auf §6unserer Website."
    );
  }
}
