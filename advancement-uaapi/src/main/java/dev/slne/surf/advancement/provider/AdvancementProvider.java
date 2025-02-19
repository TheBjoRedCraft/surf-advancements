package dev.slne.surf.advancement.provider;

import com.fren_gor.ultimateAdvancementAPI.AdvancementTab;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.RootAdvancement;
import dev.slne.surf.advancement.SurfAdvancement;
import dev.slne.surf.advancement.impl.tabs.general.GeneralRootAdvancement;
import lombok.Getter;

@Getter
public class AdvancementProvider {
  private AdvancementTab generalTab;
  private AdvancementTab eventTab;
  private AdvancementTab survivalTab;

  private final String generalNamespace = "surf_general";
  private final String eventNamespace = "surf_event";
  private final String survivalNamespace = "surf_survival";

  private RootAdvancement generalRootAdvancement;

  private RootAdvancement eventRootAdvancement;

  private RootAdvancement survivalRootAdvancement;


  public void registerGeneral() {
    generalTab = SurfAdvancement.getInstance().getAdvancementAPI().createAdvancementTab(generalNamespace);
    eventTab = SurfAdvancement.getInstance().getAdvancementAPI().createAdvancementTab(eventNamespace);
    survivalTab = SurfAdvancement.getInstance().getAdvancementAPI().createAdvancementTab(survivalNamespace);

    this.generalRootAdvancement = new RootAdvancement(this.getGeneralTab(), this.generalNamespace + ".root", new GeneralRootAdvancement(), "textures/block/stone.png");


    generalTab.registerAdvancements(
        this.generalRootAdvancement
    );
    generalTab.automaticallyShowToPlayers();
  }
}
