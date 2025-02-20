package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralClanMemberAdvancement extends AdvancementDisplay {

  public GeneralClanMemberAdvancement() {
    super(Material.PLAYER_HEAD,
        "Nicht alleine",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fNicht alleine\n\n\n§7Habe mindestens §6ein Clan-Mitglied.\n\n§7Informationen zum §6Clan System\n§7findest du auf §6unserer Website."
    );
  }
}
