package dev.slne.surf.advancement.velocity.database;

import dev.slne.surf.advancement.api.player.AdvancementPlayer;
import java.util.UUID;
import lombok.Getter;

public class DatabaseService {
  @Getter
  private static final DatabaseService instance = new DatabaseService();

  public void connect() {

  }

  public void disconnect() {

  }

  public AdvancementPlayer getPlayer(UUID uuid) {
    return null;
  }
}
