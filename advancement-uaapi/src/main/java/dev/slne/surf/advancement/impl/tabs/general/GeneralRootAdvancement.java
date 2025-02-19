package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralRootAdvancement extends AdvancementDisplay {
  public GeneralRootAdvancement() {
    super(Material.COMPASS, "§f§lHallo!", AdvancementFrameType.CHALLENGE, true, false, 0, 0, "§7Willkommen auf dem §fServer!");
  }
}
