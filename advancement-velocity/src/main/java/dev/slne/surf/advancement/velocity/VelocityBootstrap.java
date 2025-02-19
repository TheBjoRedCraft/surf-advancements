package dev.slne.surf.advancement.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyShutdownEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import java.nio.file.Path;
import lombok.Getter;
import org.slf4j.Logger;

@Plugin(
    id = "surf-advancements",
    name = "SurfAdvancements",
    version = "1.0.0-1.21.4-SNAPSHOT",
    url = "https://server.castcrafter.de/",
    description = "The proxied surf advancement instance",
    authors = {"SLNE Development", "TheBjoRedCraft"}
)

@Getter
public class VelocityBootstrap {
  private final ProxyServer proxy;
  private final Logger logger;
  private final Path pluginFolder;

  @Getter
  private static VelocityBootstrap instance;

  @Inject
  public VelocityBootstrap(ProxyServer proxy, Logger logger, @DataDirectory Path pluginFolder) {
    this.proxy = proxy;
    this.logger = logger;
    this.pluginFolder = pluginFolder;
  }

  @Subscribe
  public void onProxyInitialization(ProxyInitializeEvent event) {
    instance = this;
  }

  @Subscribe
  public void onProxyShutdown(ProxyShutdownEvent event) {

  }
}
