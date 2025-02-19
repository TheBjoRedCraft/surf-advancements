package dev.slne.surf.advancement.api.object;

import dev.slne.surf.advancements.api.object.AdvancementKey;
import dev.slne.surf.advancements.api.player.AdvancementPlayer;
import lombok.Builder;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Range;

@Getter
@Builder
public class Advancement {
  private String name;
  private AdvancementKey key;
  private Component displayName;
  private Component description;

  @Range(from = 0, to = 100)
  private int progress;

  public void grant(AdvancementPlayer player) {

  }

  public void discover(AdvancementPlayer player) {

  }

  public void revoke(AdvancementPlayer player) {

  }
}
