package dev.slne.surf.advancement.api.player;

import java.util.UUID;

public interface AdvancementPlayerFactory {
  AdvancementPlayer getPlayer(UUID uuid);;
}
