package dev.slne.surf.advancement.provider;

import com.fren_gor.ultimateAdvancementAPI.AdvancementTab;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.RootAdvancement;
import dev.slne.surf.advancement.SurfAdvancement;
import dev.slne.surf.advancement.impl.tabs.general.GeneralRootAdvancement;
import dev.slne.surf.advancement.impl.tabs.general.GeneralTestAdvancement;
import lombok.Getter;

@Getter
public class AdvancementProvider {
  private AdvancementTab generalTab;
  private final String generalNamespace = "surf_general";

  private RootAdvancement generalRootAdvancement;
  private BaseAdvancement generalTestAdvancement;


  public void registerGeneral() {
    generalTab = SurfAdvancement.getInstance().getAdvancementAPI().createAdvancementTab(generalNamespace);

    this.generalRootAdvancement = new RootAdvancement(this.getGeneralTab(), this.generalNamespace + ".root", new GeneralRootAdvancement(), "textures/block/stone.png");
    this.generalTestAdvancement = new BaseAdvancement(this.generalNamespace + ".test", new GeneralTestAdvancement(), this.generalRootAdvancement);


    generalTab.registerAdvancements(
        this.generalRootAdvancement,
        this.generalTestAdvancement
    );
    generalTab.automaticallyShowToPlayers();
  }
}
