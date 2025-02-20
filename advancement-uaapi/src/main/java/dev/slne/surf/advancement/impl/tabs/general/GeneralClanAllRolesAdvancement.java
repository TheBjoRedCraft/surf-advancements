package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralClanAllRolesAdvancement extends AdvancementDisplay {

  public GeneralClanAllRolesAdvancement() {
    super(Material.PLAYER_HEAD,
        "Clan-Organisation",
        AdvancementFrameType.TASK,
        true,
        false,
        0,
        0,
        "§fClan-Organisation\n\n\n§7Besetzte §6alle Rollen§7 innerhalb deines Clans.\n\n§7Informationen zum §6Clan System\n§7findest du auf §6unserer Website."
    );
  }
}
