package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aet;
import net.minecraft.server.Block;
import net.minecraft.server.IBlockData;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_cj;
import net.minecraft.server.CreativeTab;

public class class_akx extends Block {
   protected class_akx() {
      super(class_atk.z);
      this.a(true);
      this.a(CreativeTab.b);
   }

   public class_aar a(IBlockData var1, Random var2, int var3) {
      return class_aau.aF;
   }

   public int a(Random var1) {
      return 4;
   }

   public void b(class_aen var1, class_cj var2, IBlockData var3, Random var4) {
      if(var1.b(class_aet.b, var2) > 11) {
         this.b(var1, var2, var1.p(var2), 0);
         var1.g(var2);
      }

   }
}
