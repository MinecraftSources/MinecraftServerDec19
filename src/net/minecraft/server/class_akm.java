package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aer;
import net.minecraft.server.Block;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_alp;
import net.minecraft.server.IBlockData;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_cy;
import net.minecraft.server.CreativeTab;

public class class_akm extends class_alp {
   private static Map b = Maps.newHashMap();
   private final boolean N;

   private boolean a(class_aen var1, class_cj var2, boolean var3) {
      if(!b.containsKey(var1)) {
         b.put(var1, Lists.newArrayList());
      }

      List var4 = (List)b.get(var1);
      if(var3) {
         var4.add(new class_akm.class_a_in_class_akm(var2, var1.L()));
      }

      int var5 = 0;

      for(int var6 = 0; var6 < var4.size(); ++var6) {
         class_akm.class_a_in_class_akm var7 = (class_akm.class_a_in_class_akm)var4.get(var6);
         if(var7.a.equals(var2)) {
            ++var5;
            if(var5 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected class_akm(boolean var1) {
      this.N = var1;
      this.a(true);
      this.a((CreativeTab)null);
   }

   public int a(class_aen var1) {
      return 2;
   }

   public void c(class_aen var1, class_cj var2, IBlockData var3) {
      if(this.N) {
         class_cq[] var4 = class_cq.values();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            class_cq var7 = var4[var6];
            var1.c((class_cj)var2.a(var7), (Block)this);
         }
      }

   }

   public void b(class_aen var1, class_cj var2, IBlockData var3) {
      if(this.N) {
         class_cq[] var4 = class_cq.values();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            class_cq var7 = var4[var6];
            var1.c((class_cj)var2.a(var7), (Block)this);
         }
      }

   }

   public int a(class_aer var1, class_cj var2, IBlockData var3, class_cq var4) {
      return this.N && var3.get(a) != var4?15:0;
   }

   private boolean g(class_aen var1, class_cj var2, IBlockData var3) {
      class_cq var4 = ((class_cq)var3.get(a)).d();
      return var1.b(var2.a(var4), var4);
   }

   public void a(class_aen var1, class_cj var2, IBlockData var3, Random var4) {
   }

   public void b(class_aen var1, class_cj var2, IBlockData var3, Random var4) {
      boolean var5 = this.g(var1, var2, var3);
      List var6 = (List)b.get(var1);

      while(var6 != null && !var6.isEmpty() && var1.L() - ((class_akm.class_a_in_class_akm)var6.get(0)).b > 60L) {
         var6.remove(0);
      }

      if(this.N) {
         if(var5) {
            var1.a((class_cj)var2, (IBlockData)class_agk.aE.S().set(a, var3.get(a)), 3);
            if(this.a(var1, var2, true)) {
               var1.a((double)((float)var2.n() + 0.5F), (double)((float)var2.o() + 0.5F), (double)((float)var2.p() + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.s.nextFloat() - var1.s.nextFloat()) * 0.8F);

               for(int var7 = 0; var7 < 5; ++var7) {
                  double var8 = (double)var2.n() + var4.nextDouble() * 0.6D + 0.2D;
                  double var10 = (double)var2.o() + var4.nextDouble() * 0.6D + 0.2D;
                  double var12 = (double)var2.p() + var4.nextDouble() * 0.6D + 0.2D;
                  var1.a(class_cy.l, var8, var10, var12, 0.0D, 0.0D, 0.0D, new int[0]);
               }

               var1.a((class_cj)var2, (Block)var1.p(var2).getBlock(), 160);
            }
         }
      } else if(!var5 && !this.a(var1, var2, false)) {
         var1.a((class_cj)var2, (IBlockData)class_agk.aF.S().set(a, var3.get(a)), 3);
      }

   }

   public void a(class_aen var1, class_cj var2, IBlockData var3, Block var4) {
      if(!this.e(var1, var2, var3)) {
         if(this.N == this.g(var1, var2, var3)) {
            var1.a((class_cj)var2, (Block)this, this.a(var1));
         }

      }
   }

   public int b(class_aer var1, class_cj var2, IBlockData var3, class_cq var4) {
      return var4 == class_cq.a?this.a(var1, var2, var3, var4):0;
   }

   public class_aar a(IBlockData var1, Random var2, int var3) {
      return class_aar.a(class_agk.aF);
   }

   public boolean i() {
      return true;
   }

   public boolean b(Block var1) {
      return var1 == class_agk.aE || var1 == class_agk.aF;
   }

   static class class_a_in_class_akm {
      class_cj a;
      long b;

      public class_a_in_class_akm(class_cj var1, long var2) {
         this.a = var1;
         this.b = var2;
      }
   }
}
