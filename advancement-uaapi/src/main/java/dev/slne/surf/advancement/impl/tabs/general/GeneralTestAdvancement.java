package dev.slne.surf.advancement.impl.tabs.general;

import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;

public class GeneralTestAdvancement extends AdvancementDisplay {
  public GeneralTestAdvancement() {
    super(Material.QUARTZ, "§f§lTesten...", AdvancementFrameType.TASK, true, true, 1, 0, "§7Test §ferfolgreich!");
  }
}
