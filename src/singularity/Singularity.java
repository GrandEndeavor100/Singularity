package singularity;

import arc.*;
import arc.util.*;
import singularity.content.*;
import mindustry.content.Planets;
import mindustry.game.EventType.*;
import mindustry.game.Schematic;
import mindustry.game.Schematics;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Singularity extends Mod{

    public Singularity(){
        //AAAAAA
    }

    @Override
    public void loadContent(){
        SItems.load();
        SBlocks.load();

        //Planets.erekir.hiddenItems.addAll(BioItems.andoriItems);
      //Planets.serpulo.hiddenItems.addAll(BioItems.andoriItems);
    }
}