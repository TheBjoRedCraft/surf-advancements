package dev.slne.surf.advancement.api.player;

import dev.slne.surf.advancement.api.object.Advancement;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AdvancementPlayer {
  private final UUID uuid;

  private ObjectSet<Advancement> discoveredAdvancements;
}
