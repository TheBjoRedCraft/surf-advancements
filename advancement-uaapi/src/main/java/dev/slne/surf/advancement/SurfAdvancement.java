package dev.slne.surf.advancement;

import com.fren_gor.ultimateAdvancementAPI.UltimateAdvancementAPI;
import dev.slne.surf.advancement.provider.AdvancementProvider;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class SurfAdvancement extends JavaPlugin {
  private UltimateAdvancementAPI advancementAPI;

  private final AdvancementProvider advancementProvider = new AdvancementProvider();

  @Override
  public void onEnable() {
    advancementAPI = UltimateAdvancementAPI.getInstance(this);

    this.advancementProvider.registerGeneral();
  }

  public static SurfAdvancement getInstance() {
    return getPlugin(SurfAdvancement.class);
  }
}
