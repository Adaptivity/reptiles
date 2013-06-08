//
// This work is licensed under the Creative Commons
// Attribution-ShareAlike 3.0 Unported License. To view a copy of this
// license, visit http://creativecommons.org/licenses/by-sa/3.0/
//

package reptiles.client;

import reptiles.common.EntitySalvadorii;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;


public class RenderSalvadorii extends RenderLiving
{
  public RenderSalvadorii(ModelBase modelbase, float shadowSize) {
    super(modelbase, shadowSize);
  }

  public void func_177_a(EntitySalvadorii entitySalvadorii, double d, double d1, double d2, float f, float f1) {
    super.doRenderLiving(entitySalvadorii, d, d1, d2, f, f1);
  }

  public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1) {
    func_177_a((EntitySalvadorii)entityliving, d, d1, d2, f, f1);
  }

  public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
    func_177_a((EntitySalvadorii)entity, d, d1, d2, f, f1);
  }
}
