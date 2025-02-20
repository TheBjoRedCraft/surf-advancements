package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralClanManyMembersAdvancement extends AdvancementDisplay {

  public GeneralClanManyMembersAdvancement() {
    super(Material.PLAYER_HEAD,
        "Clangemeinschaft",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fClangemeinschaft\n\n\n§7Erreiche §630 Clan-Mitglieder.\n\n§7Informationen zum §6Clan System\n§7findest du auf §6unserer Website."
    );
  }
}
