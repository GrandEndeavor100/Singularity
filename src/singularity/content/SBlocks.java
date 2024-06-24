package singularity.content;
import arc.graphics.Color;
import arc.graphics.gl.Shader;
import singularity.Singularity;
import singularity.entities.bullet.LightningLaserBulletType;
import singularity.world.blocks.power.PowerConduit;
import singularity.world.blocks.unit.UnitCapUnitCargoLoader;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.entities.pattern.ShootMulti;
import mindustry.entities.pattern.ShootPattern;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.distribution.BufferedItemBridge;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.distribution.Router;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.environment.StaticWall;
import mindustry.world.blocks.environment.SteamVent;
import mindustry.world.blocks.heat.HeatProducer;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidBridge;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.blocks.units.UnitCargoLoader;
import mindustry.world.blocks.units.UnitCargoUnloadPoint;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.Category.*;
import static mindustry.type.ItemStack.with;

public class SBlocks {
    public static Block
            //defense
            IronWall;

    //public static final Attribute
            //meat = Attribute.add("meat"),
            //calcitic = Attribute.add("calcitic");

    public static void load() {
        //defense
        IronWall = new Wall("Iron-wall"){{
            //researchCost = with(SItems.Iron, 300);
            requirements(Category.defense, with(SItems.Iron, 15));
            researchCost = with(SItems.Iron, 50);
            health = 1000;
        }};
        //endregion
    }
}