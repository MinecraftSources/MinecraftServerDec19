package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agd;
import net.minecraft.server.Block;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_aiv;
import net.minecraft.server.class_amg;
import net.minecraft.server.class_amp;
import net.minecraft.server.IBlockData;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anx;
import net.minecraft.server.IBlockState;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_nc;
import net.minecraft.server.class_oj;
import net.minecraft.server.class_oo;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_xa;
import net.minecraft.server.class_yu;
import net.minecraft.server.CreativeTab;

public class class_ahv extends class_agd {
   public static final class_anx a;

   protected class_ahv() {
      super(class_atk.e);
      this.j(this.M.b().set(a, class_cq.c));
      this.a(CreativeTab.c);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 2;
   }

   public class_aar a(IBlockData var1, Random var2, int var3) {
      return class_aar.a(class_agk.Z);
   }

   public int a(Random var1) {
      return 8;
   }

   protected boolean K() {
      return true;
   }

   public IBlockData a(class_aen var1, class_cj var2, class_cq var3, float var4, float var5, float var6, int var7, class_qa var8) {
      return this.S().set(a, var8.aR().d());
   }

   public void a(class_aen var1, class_cj var2, IBlockData var3, class_qa var4, class_aas var5) {
      var1.a((class_cj)var2, (IBlockData)var3.set(a, var4.aR().d()), 2);
   }

   public boolean a(class_aen var1, class_cj var2, IBlockData var3, class_xa var4, class_oo var5, class_aas var6, class_cq var7, float var8, float var9, float var10) {
      class_yu var11 = var4.cq();
      class_amg var12 = var1.s(var2);
      if(var11 != null && var12 instanceof class_amp) {
         if(var1.p(var2.a()).getBlock().x()) {
            return true;
         } else if(var1.D) {
            return true;
         } else {
            var11.a((class_amp)var12);
            var4.a((class_oj)var11);
            var4.b(class_nc.V);
            return true;
         }
      } else {
         return true;
      }
   }

   public class_amg a(class_aen var1, int var2) {
      return new class_amp();
   }

   public IBlockData a(int var1) {
      class_cq var2 = class_cq.a(var1);
      if(var2.k() == class_cq.class_a_in_class_cq.b) {
         var2 = class_cq.c;
      }

      return this.S().set(a, var2);
   }

   public int c(IBlockData var1) {
      return ((class_cq)var1.get(a)).a();
   }

   public IBlockData a(IBlockData var1, Block.class_c_in_class_agj var2) {
      return var1.getBlock() != this?var1:var1.set(a, var2.a((class_cq)var1.get(a)));
   }

   public IBlockData a(IBlockData var1, Block.class_a_in_class_agj var2) {
      return var1.getBlock() != this?var1:this.a(var1, var2.a((class_cq)var1.get(a)));
   }

   protected class_anm e() {
      return new class_anm(this, new IBlockState[]{a});
   }

   static {
      a = class_aiv.O;
   }
}
