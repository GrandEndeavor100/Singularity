package singularity.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

public class SItems {
    public static Item
        //t1
        Iron;

   // public static final Seq<Item> andoriItems = new Seq<>();
    public static void load() {
        Iron = new Item("Iron", Color.valueOf("ff5959")){{
            hardness = 1;
            cost = 0.7f;
            alwaysUnlocked = true;
        }};

        

        //andoriItems.addAll(
               // carbonicTissue, calciticFragment, magnesium, potash,
              //  carminite, phosphorus, dustClump, proteicPaste, stemCapsule
        //);
    }
}