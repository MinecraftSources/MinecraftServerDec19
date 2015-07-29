package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aer;
import net.minecraft.server.Block;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_ahh;
import net.minecraft.server.class_ako;
import net.minecraft.server.IBlockData;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_any;
import net.minecraft.server.class_anz;
import net.minecraft.server.IBlockState;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_ny;

public class class_akk extends Block {
   public static final class_any a = class_any.a("north", class_akk.class_a_in_class_akk.class);
   public static final class_any b = class_any.a("east", class_akk.class_a_in_class_akk.class);
   public static final class_any N = class_any.a("south", class_akk.class_a_in_class_akk.class);
   public static final class_any O = class_any.a("west", class_akk.class_a_in_class_akk.class);
   public static final class_anz P = class_anz.a("power", 0, 15);
   private boolean Q = true;
   private final Set R = Sets.newHashSet();

   public class_akk() {
      super(class_atk.q);
      this.j(this.M.b().set(a, class_akk.class_a_in_class_akk.c).set(b, class_akk.class_a_in_class_akk.c).set(N, class_akk.class_a_in_class_akk.c).set(O, class_akk.class_a_in_class_akk.c).set(P, Integer.valueOf(0)));
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   public IBlockData a(IBlockData var1, class_aer var2, class_cj var3) {
      var1 = var1.set(O, this.c(var2, var3, class_cq.e));
      var1 = var1.set(b, this.c(var2, var3, class_cq.f));
      var1 = var1.set(a, this.c(var2, var3, class_cq.c));
      var1 = var1.set(N, this.c(var2, var3, class_cq.d));
      return var1;
   }

   private class_akk.class_a_in_class_akk c(class_aer var1, class_cj var2, class_cq var3) {
      class_cj var4 = var2.a(var3);
      Block var5 = var1.p(var2.a(var3)).getBlock();
      if(a(var1.p(var4), var3) || !var5.w() && d(var1.p(var4.b()))) {
         return class_akk.class_a_in_class_akk.b;
      } else {
         Block var6 = var1.p(var2.a()).getBlock();
         return !var6.w() && var5.w() && d(var1.p(var4.a()))?class_akk.class_a_in_class_akk.a:class_akk.class_a_in_class_akk.c;
      }
   }

   public class_awf a(class_aen var1, class_cj var2, IBlockData var3) {
      return null;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean d(class_aen var1, class_cj var2) {
      return class_aen.a((class_aer)var1, (class_cj)var2.b()) || var1.p(var2.b()).getBlock() == class_agk.aX;
   }

   private IBlockData e(class_aen var1, class_cj var2, IBlockData var3) {
      var3 = this.a(var1, var2, var2, var3);
      ArrayList var4 = Lists.newArrayList((Iterable)this.R);
      this.R.clear();
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         class_cj var6 = (class_cj)var5.next();
         var1.c((class_cj)var6, (Block)this);
      }

      return var3;
   }

   private IBlockData a(class_aen var1, class_cj var2, class_cj var3, IBlockData var4) {
      IBlockData var5 = var4;
      int var6 = ((Integer)var4.get(P)).intValue();
      byte var7 = 0;
      int var14 = this.a((class_aen)var1, (class_cj)var3, var7);
      this.Q = false;
      int var8 = var1.A(var2);
      this.Q = true;
      if(var8 > 0 && var8 > var14 - 1) {
         var14 = var8;
      }

      int var9 = 0;
      Iterator var10 = class_cq.class_c_in_class_cq.a.iterator();

      while(true) {
         while(var10.hasNext()) {
            class_cq var11 = (class_cq)var10.next();
            class_cj var12 = var2.a(var11);
            boolean var13 = var12.n() != var3.n() || var12.p() != var3.p();
            if(var13) {
               var9 = this.a(var1, var12, var9);
            }

            if(var1.p(var12).getBlock().x() && !var1.p(var2.a()).getBlock().x()) {
               if(var13 && var2.o() >= var3.o()) {
                  var9 = this.a(var1, var12.a(), var9);
               }
            } else if(!var1.p(var12).getBlock().x() && var13 && var2.o() <= var3.o()) {
               var9 = this.a(var1, var12.b(), var9);
            }
         }

         if(var9 > var14) {
            var14 = var9 - 1;
         } else if(var14 > 0) {
            --var14;
         } else {
            var14 = 0;
         }

         if(var8 > var14 - 1) {
            var14 = var8;
         }

         if(var6 != var14) {
            var4 = var4.set(P, Integer.valueOf(var14));
            if(var1.p(var2) == var5) {
               var1.a((class_cj)var2, (IBlockData)var4, 2);
            }

            this.R.add(var2);
            class_cq[] var15 = class_cq.values();
            int var16 = var15.length;

            for(int var17 = 0; var17 < var16; ++var17) {
               class_cq var18 = var15[var17];
               this.R.add(var2.a(var18));
            }
         }

         return var4;
      }
   }

   private void e(class_aen var1, class_cj var2) {
      if(var1.p(var2).getBlock() == this) {
         var1.c((class_cj)var2, (Block)this);
         class_cq[] var3 = class_cq.values();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            class_cq var6 = var3[var5];
            var1.c((class_cj)var2.a(var6), (Block)this);
         }

      }
   }

   public void c(class_aen var1, class_cj var2, IBlockData var3) {
      if(!var1.D) {
         this.e(var1, var2, var3);
         Iterator var4 = class_cq.class_c_in_class_cq.b.iterator();

         class_cq var5;
         while(var4.hasNext()) {
            var5 = (class_cq)var4.next();
            var1.c((class_cj)var2.a(var5), (Block)this);
         }

         var4 = class_cq.class_c_in_class_cq.a.iterator();

         while(var4.hasNext()) {
            var5 = (class_cq)var4.next();
            this.e(var1, var2.a(var5));
         }

         var4 = class_cq.class_c_in_class_cq.a.iterator();

         while(var4.hasNext()) {
            var5 = (class_cq)var4.next();
            class_cj var6 = var2.a(var5);
            if(var1.p(var6).getBlock().x()) {
               this.e(var1, var6.a());
            } else {
               this.e(var1, var6.b());
            }
         }

      }
   }

   public void b(class_aen var1, class_cj var2, IBlockData var3) {
      super.b(var1, var2, var3);
      if(!var1.D) {
         class_cq[] var4 = class_cq.values();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            class_cq var7 = var4[var6];
            var1.c((class_cj)var2.a(var7), (Block)this);
         }

         this.e(var1, var2, var3);
         Iterator var8 = class_cq.class_c_in_class_cq.a.iterator();

         class_cq var9;
         while(var8.hasNext()) {
            var9 = (class_cq)var8.next();
            this.e(var1, var2.a(var9));
         }

         var8 = class_cq.class_c_in_class_cq.a.iterator();

         while(var8.hasNext()) {
            var9 = (class_cq)var8.next();
            class_cj var10 = var2.a(var9);
            if(var1.p(var10).getBlock().x()) {
               this.e(var1, var10.a());
            } else {
               this.e(var1, var10.b());
            }
         }

      }
   }

   private int a(class_aen var1, class_cj var2, int var3) {
      if(var1.p(var2).getBlock() != this) {
         return var3;
      } else {
         int var4 = ((Integer)var1.p(var2).get(P)).intValue();
         return var4 > var3?var4:var3;
      }
   }

   public void a(class_aen var1, class_cj var2, IBlockData var3, Block var4) {
      if(!var1.D) {
         if(this.d(var1, var2)) {
            this.e(var1, var2, var3);
         } else {
            this.b(var1, var2, var3, 0);
            var1.g(var2);
         }

      }
   }

   public class_aar a(IBlockData var1, Random var2, int var3) {
      return class_aau.aE;
   }

   public int b(class_aer var1, class_cj var2, IBlockData var3, class_cq var4) {
      return !this.Q?0:this.a(var1, var2, var3, var4);
   }

   public int a(class_aer var1, class_cj var2, IBlockData var3, class_cq var4) {
      if(!this.Q) {
         return 0;
      } else {
         int var5 = ((Integer)var3.get(P)).intValue();
         if(var5 == 0) {
            return 0;
         } else if(var4 == class_cq.b) {
            return var5;
         } else {
            EnumSet var6 = EnumSet.noneOf(class_cq.class);
            Iterator var7 = class_cq.class_c_in_class_cq.a.iterator();

            while(var7.hasNext()) {
               class_cq var8 = (class_cq)var7.next();
               if(this.d(var1, var2, var8)) {
                  var6.add(var8);
               }
            }

            if(var4.k().c() && var6.isEmpty()) {
               return var5;
            } else if(var6.contains(var4) && !var6.contains(var4.f()) && !var6.contains(var4.e())) {
               return var5;
            } else {
               return 0;
            }
         }
      }
   }

   private boolean d(class_aer var1, class_cj var2, class_cq var3) {
      class_cj var4 = var2.a(var3);
      IBlockData var5 = var1.p(var4);
      Block var6 = var5.getBlock();
      boolean var7 = var6.x();
      boolean var8 = var1.p(var2.a()).getBlock().x();
      return !var8 && var7 && e(var1, var4.a())?true:(a(var5, var3)?true:(var6 == class_agk.bc && var5.get(class_ahh.O) == var3?true:!var7 && e(var1, var4.b())));
   }

   protected static boolean e(class_aer var0, class_cj var1) {
      return d(var0.p(var1));
   }

   protected static boolean d(IBlockData var0) {
      return a(var0, (class_cq)null);
   }

   protected static boolean a(IBlockData var0, class_cq var1) {
      Block var2 = var0.getBlock();
      if(var2 == class_agk.af) {
         return true;
      } else if(class_agk.bb.e(var2)) {
         class_cq var3 = (class_cq)var0.get(class_ako.O);
         return var3 == var1 || var3.d() == var1;
      } else {
         return var2.i() && var1 != null;
      }
   }

   public boolean i() {
      return this.Q;
   }

   public IBlockData a(int var1) {
      return this.S().set(P, Integer.valueOf(var1));
   }

   public int c(IBlockData var1) {
      return ((Integer)var1.get(P)).intValue();
   }

   public IBlockData a(IBlockData var1, Block.class_c_in_class_agj var2) {
      if(var1.getBlock() != this) {
         return var1;
      } else {
         switch(class_akk.SyntheticClass_1.a[var2.ordinal()]) {
         case 1:
            return var1.set(a, var1.get(N)).set(b, var1.get(O)).set(N, var1.get(a)).set(O, var1.get(b));
         case 2:
            return var1.set(a, var1.get(b)).set(b, var1.get(N)).set(N, var1.get(O)).set(O, var1.get(a));
         case 3:
            return var1.set(a, var1.get(O)).set(b, var1.get(a)).set(N, var1.get(b)).set(O, var1.get(N));
         default:
            return var1;
         }
      }
   }

   public IBlockData a(IBlockData var1, Block.class_a_in_class_agj var2) {
      if(var1.getBlock() != this) {
         return var1;
      } else {
         switch(class_akk.SyntheticClass_1.b[var2.ordinal()]) {
         case 1:
            return var1.set(a, var1.get(N)).set(N, var1.get(a));
         case 2:
            return var1.set(b, var1.get(O)).set(O, var1.get(b));
         default:
            return super.a(var1, var2);
         }
      }
   }

   protected class_anm e() {
      return new class_anm(this, new IBlockState[]{a, b, N, O, P});
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] a;
      // $FF: synthetic field
      static final int[] b = new int[Block.class_a_in_class_agj.values().length];

      static {
         try {
            b[Block.class_a_in_class_agj.b.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            b[Block.class_a_in_class_agj.c.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         a = new int[Block.class_c_in_class_agj.values().length];

         try {
            a[Block.class_c_in_class_agj.c.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            a[Block.class_c_in_class_agj.d.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            a[Block.class_c_in_class_agj.b.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   static enum class_a_in_class_akk implements class_ny {
      a("up"),
      b("side"),
      c("none");

      private final String d;

      private class_a_in_class_akk(String var3) {
         this.d = var3;
      }

      public String toString() {
         return this.l();
      }

      public String l() {
         return this.d;
      }
   }
}
