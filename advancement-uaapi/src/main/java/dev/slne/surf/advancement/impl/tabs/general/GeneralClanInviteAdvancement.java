package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralClanInviteAdvancement extends AdvancementDisplay {

  public GeneralClanInviteAdvancement() {
    super(Material.PLAYER_HEAD,
        "Teamplayer",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fTeamplayer\n\n\n§6Lade Mitglieder §7in deinen Clan ein.\n\n§7Informationen zum §6Clan System\n§7findest du auf §6unserer Website."
    );
  }
}
