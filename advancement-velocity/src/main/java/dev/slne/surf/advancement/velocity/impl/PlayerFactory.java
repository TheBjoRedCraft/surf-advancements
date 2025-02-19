package dev.slne.surf.advancement.velocity.impl;

import dev.slne.surf.advancement.api.player.AdvancementPlayer;
import dev.slne.surf.advancement.api.player.AdvancementPlayerFactory;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import java.util.UUID;

import dev.slne.surf.advancement.velocity.database.DatabaseService;

public class PlayerFactory implements AdvancementPlayerFactory {
  private final DatabaseService databaseService = DatabaseService.getInstance();
  private final LoadingCache<UUID, AdvancementPlayer> playerCache = Caffeine
      .newBuilder()
      .build(databaseService::getPlayer);

  @Override
  public AdvancementPlayer getPlayer(UUID uuid) {
    return playerCache.get(uuid);
  }
}
