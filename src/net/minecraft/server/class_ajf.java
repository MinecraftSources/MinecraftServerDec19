package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aau;
import net.minecraft.server.Block;
import net.minecraft.server.IBlockData;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_atl;
import net.minecraft.server.CreativeTab;

public class class_ajf extends Block {
   protected class_ajf() {
      super(class_atk.C, class_atl.u);
      this.a(CreativeTab.b);
   }

   public class_aar a(IBlockData var1, Random var2, int var3) {
      return class_aau.bh;
   }

   public int a(Random var1) {
      return 3 + var1.nextInt(5);
   }

   public int a(int var1, Random var2) {
      return Math.min(9, this.a(var2) + var2.nextInt(1 + var1));
   }
}
