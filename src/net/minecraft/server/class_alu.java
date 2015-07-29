package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aer;
import net.minecraft.server.Block;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_amg;
import net.minecraft.server.IBlockData;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anw;
import net.minecraft.server.IBlockState;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_nc;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_xa;
import net.minecraft.server.CreativeTab;

public class class_alu extends Block {
   public static final class_anw a = class_anw.a("up");
   public static final class_anw b = class_anw.a("north");
   public static final class_anw N = class_anw.a("east");
   public static final class_anw O = class_anw.a("south");
   public static final class_anw P = class_anw.a("west");
   public static final class_anw[] Q;

   public class_alu() {
      super(class_atk.l);
      this.j(this.M.b().set(a, Boolean.valueOf(false)).set(b, Boolean.valueOf(false)).set(N, Boolean.valueOf(false)).set(O, Boolean.valueOf(false)).set(P, Boolean.valueOf(false)));
      this.a(true);
      this.a((CreativeTab)CreativeTab.c);
   }

   public IBlockData a(IBlockData var1, class_aer var2, class_cj var3) {
      return var1.set(a, Boolean.valueOf(var2.p(var3.a()).getBlock().w()));
   }

   public void j() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean a(class_aen var1, class_cj var2) {
      return true;
   }

   public void a(class_aer var1, class_cj var2) {
      float var3 = 0.0625F;
      float var4 = 1.0F;
      float var5 = 1.0F;
      float var6 = 1.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      boolean var10 = false;
      if(((Boolean)var1.p(var2).get(P)).booleanValue()) {
         var7 = Math.max(var7, 0.0625F);
         var4 = 0.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var6 = 0.0F;
         var9 = 1.0F;
         var10 = true;
      }

      if(((Boolean)var1.p(var2).get(N)).booleanValue()) {
         var4 = Math.min(var4, 0.9375F);
         var7 = 1.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var6 = 0.0F;
         var9 = 1.0F;
         var10 = true;
      }

      if(((Boolean)var1.p(var2).get(b)).booleanValue()) {
         var9 = Math.max(var9, 0.0625F);
         var6 = 0.0F;
         var4 = 0.0F;
         var7 = 1.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var10 = true;
      }

      if(((Boolean)var1.p(var2).get(O)).booleanValue()) {
         var6 = Math.min(var6, 0.9375F);
         var9 = 1.0F;
         var4 = 0.0F;
         var7 = 1.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var10 = true;
      }

      if(!var10 && this.c(var1.p(var2.a()).getBlock())) {
         var5 = Math.min(var5, 0.9375F);
         var8 = 1.0F;
         var4 = 0.0F;
         var7 = 1.0F;
         var6 = 0.0F;
         var9 = 1.0F;
      }

      this.a(var4, var5, var6, var7, var8, var9);
   }

   public class_awf a(class_aen var1, class_cj var2, IBlockData var3) {
      return null;
   }

   public boolean b(class_aen var1, class_cj var2, class_cq var3) {
      switch(class_alu.SyntheticClass_1.a[var3.ordinal()]) {
      case 1:
         return this.c(var1.p(var2.a()).getBlock());
      case 2:
      case 3:
      case 4:
      case 5:
         return this.c(var1.p(var2.a(var3.d())).getBlock());
      default:
         return false;
      }
   }

   private boolean c(Block var1) {
      return var1.d() && var1.J.c();
   }

   private boolean e(class_aen var1, class_cj var2, IBlockData var3) {
      IBlockData var4 = var3;
      Iterator var5 = class_cq.class_c_in_class_cq.a.iterator();

      while(true) {
         class_anw var7;
         IBlockData var8;
         do {
            class_cq var6;
            do {
               do {
                  if(!var5.hasNext()) {
                     if(d(var3) == 0) {
                        return false;
                     }

                     if(var4 != var3) {
                        var1.a((class_cj)var2, (IBlockData)var3, 2);
                     }

                     return true;
                  }

                  var6 = (class_cq)var5.next();
                  var7 = a(var6);
               } while(!((Boolean)var3.get(var7)).booleanValue());
            } while(this.c(var1.p(var2.a(var6)).getBlock()));

            var8 = var1.p(var2.a());
         } while(var8.getBlock() == this && ((Boolean)var8.get(var7)).booleanValue());

         var3 = var3.set(var7, Boolean.valueOf(false));
      }
   }

   public void a(class_aen var1, class_cj var2, IBlockData var3, Block var4) {
      if(!var1.D && !this.e(var1, var2, var3)) {
         this.b(var1, var2, var3, 0);
         var1.g(var2);
      }

   }

   public void b(class_aen var1, class_cj var2, IBlockData var3, Random var4) {
      if(!var1.D) {
         if(var1.s.nextInt(4) == 0) {
            byte var5 = 4;
            int var6 = 5;
            boolean var7 = false;

            label191:
            for(int var8 = -var5; var8 <= var5; ++var8) {
               for(int var9 = -var5; var9 <= var5; ++var9) {
                  for(int var10 = -1; var10 <= 1; ++var10) {
                     if(var1.p(var2.a(var8, var10, var9)).getBlock() == this) {
                        --var6;
                        if(var6 <= 0) {
                           var7 = true;
                           break label191;
                        }
                     }
                  }
               }
            }

            class_cq var18 = class_cq.a(var4);
            class_cj var19 = var2.a();
            class_cq var24;
            if(var18 == class_cq.b && var2.o() < 255 && var1.d(var19)) {
               if(!var7) {
                  IBlockData var21 = var3;
                  Iterator var23 = class_cq.class_c_in_class_cq.a.iterator();

                  while(true) {
                     do {
                        if(!var23.hasNext()) {
                           if(((Boolean)var21.get(b)).booleanValue() || ((Boolean)var21.get(N)).booleanValue() || ((Boolean)var21.get(O)).booleanValue() || ((Boolean)var21.get(P)).booleanValue()) {
                              var1.a((class_cj)var19, (IBlockData)var21, 2);
                           }

                           return;
                        }

                        var24 = (class_cq)var23.next();
                     } while(!var4.nextBoolean() && this.c(var1.p(var19.a(var24)).getBlock()));

                     var21 = var21.set(a(var24), Boolean.valueOf(false));
                  }
               }
            } else {
               class_cj var20;
               if(var18.k().c() && !((Boolean)var3.get(a(var18))).booleanValue()) {
                  if(!var7) {
                     var20 = var2.a(var18);
                     Block var22 = var1.p(var20).getBlock();
                     if(var22.J == class_atk.a) {
                        var24 = var18.e();
                        class_cq var25 = var18.f();
                        boolean var26 = ((Boolean)var3.get(a(var24))).booleanValue();
                        boolean var27 = ((Boolean)var3.get(a(var25))).booleanValue();
                        class_cj var28 = var20.a(var24);
                        class_cj var17 = var20.a(var25);
                        if(var26 && this.c(var1.p(var28).getBlock())) {
                           var1.a((class_cj)var20, (IBlockData)this.S().set(a(var24), Boolean.valueOf(true)), 2);
                        } else if(var27 && this.c(var1.p(var17).getBlock())) {
                           var1.a((class_cj)var20, (IBlockData)this.S().set(a(var25), Boolean.valueOf(true)), 2);
                        } else if(var26 && var1.d(var28) && this.c(var1.p(var2.a(var24)).getBlock())) {
                           var1.a((class_cj)var28, (IBlockData)this.S().set(a(var18.d()), Boolean.valueOf(true)), 2);
                        } else if(var27 && var1.d(var17) && this.c(var1.p(var2.a(var25)).getBlock())) {
                           var1.a((class_cj)var17, (IBlockData)this.S().set(a(var18.d()), Boolean.valueOf(true)), 2);
                        } else if(this.c(var1.p(var20.a()).getBlock())) {
                           var1.a((class_cj)var20, (IBlockData)this.S(), 2);
                        }
                     } else if(var22.J.k() && var22.d()) {
                        var1.a((class_cj)var2, (IBlockData)var3.set(a(var18), Boolean.valueOf(true)), 2);
                     }

                  }
               } else {
                  if(var2.o() > 1) {
                     var20 = var2.b();
                     IBlockData var11 = var1.p(var20);
                     Block var12 = var11.getBlock();
                     IBlockData var13;
                     Iterator var14;
                     class_cq var15;
                     if(var12.J == class_atk.a) {
                        var13 = var3;
                        var14 = class_cq.class_c_in_class_cq.a.iterator();

                        while(var14.hasNext()) {
                           var15 = (class_cq)var14.next();
                           if(var4.nextBoolean()) {
                              var13 = var13.set(a(var15), Boolean.valueOf(false));
                           }
                        }

                        if(((Boolean)var13.get(b)).booleanValue() || ((Boolean)var13.get(N)).booleanValue() || ((Boolean)var13.get(O)).booleanValue() || ((Boolean)var13.get(P)).booleanValue()) {
                           var1.a((class_cj)var20, (IBlockData)var13, 2);
                        }
                     } else if(var12 == this) {
                        var13 = var11;
                        var14 = class_cq.class_c_in_class_cq.a.iterator();

                        while(var14.hasNext()) {
                           var15 = (class_cq)var14.next();
                           class_anw var16 = a(var15);
                           if(var4.nextBoolean() && ((Boolean)var3.get(var16)).booleanValue()) {
                              var13 = var13.set(var16, Boolean.valueOf(true));
                           }
                        }

                        if(((Boolean)var13.get(b)).booleanValue() || ((Boolean)var13.get(N)).booleanValue() || ((Boolean)var13.get(O)).booleanValue() || ((Boolean)var13.get(P)).booleanValue()) {
                           var1.a((class_cj)var20, (IBlockData)var13, 2);
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public IBlockData a(class_aen var1, class_cj var2, class_cq var3, float var4, float var5, float var6, int var7, class_qa var8) {
      IBlockData var9 = this.S().set(a, Boolean.valueOf(false)).set(b, Boolean.valueOf(false)).set(N, Boolean.valueOf(false)).set(O, Boolean.valueOf(false)).set(P, Boolean.valueOf(false));
      return var3.k().c()?var9.set(a(var3.d()), Boolean.valueOf(true)):var9;
   }

   public class_aar a(IBlockData var1, Random var2, int var3) {
      return null;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(class_aen var1, class_xa var2, class_cj var3, IBlockData var4, class_amg var5, class_aas var6) {
      if(!var1.D && var6 != null && var6.b() == class_aau.bg) {
         var2.b(class_nc.ab[Block.getId((Block)this)]);
         a((class_aen)var1, (class_cj)var3, (class_aas)(new class_aas(class_agk.bn, 1, 0)));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public IBlockData a(int var1) {
      return this.S().set(O, Boolean.valueOf((var1 & 1) > 0)).set(P, Boolean.valueOf((var1 & 2) > 0)).set(b, Boolean.valueOf((var1 & 4) > 0)).set(N, Boolean.valueOf((var1 & 8) > 0));
   }

   public int c(IBlockData var1) {
      int var2 = 0;
      if(((Boolean)var1.get(O)).booleanValue()) {
         var2 |= 1;
      }

      if(((Boolean)var1.get(P)).booleanValue()) {
         var2 |= 2;
      }

      if(((Boolean)var1.get(b)).booleanValue()) {
         var2 |= 4;
      }

      if(((Boolean)var1.get(N)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   protected class_anm e() {
      return new class_anm(this, new IBlockState[]{a, b, N, O, P});
   }

   public IBlockData a(IBlockData var1, Block.class_c_in_class_agj var2) {
      if(var1.getBlock() != this) {
         return var1;
      } else {
         switch(class_alu.SyntheticClass_1.b[var2.ordinal()]) {
         case 1:
            return var1.set(b, var1.get(O)).set(N, var1.get(P)).set(O, var1.get(b)).set(P, var1.get(N));
         case 2:
            return var1.set(b, var1.get(N)).set(N, var1.get(O)).set(O, var1.get(P)).set(P, var1.get(b));
         case 3:
            return var1.set(b, var1.get(P)).set(N, var1.get(b)).set(O, var1.get(N)).set(P, var1.get(O));
         default:
            return var1;
         }
      }
   }

   public IBlockData a(IBlockData var1, Block.class_a_in_class_agj var2) {
      if(var1.getBlock() != this) {
         return var1;
      } else {
         switch(class_alu.SyntheticClass_1.c[var2.ordinal()]) {
         case 1:
            return var1.set(b, var1.get(O)).set(O, var1.get(b));
         case 2:
            return var1.set(N, var1.get(P)).set(P, var1.get(N));
         default:
            return super.a(var1, var2);
         }
      }
   }

   public static class_anw a(class_cq var0) {
      switch(class_alu.SyntheticClass_1.a[var0.ordinal()]) {
      case 1:
         return a;
      case 2:
         return b;
      case 3:
         return O;
      case 4:
         return N;
      case 5:
         return P;
      default:
         throw new IllegalArgumentException(var0 + " is an invalid choice");
      }
   }

   public static int d(IBlockData var0) {
      int var1 = 0;
      class_anw[] var2 = Q;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         class_anw var5 = var2[var4];
         if(((Boolean)var0.get(var5)).booleanValue()) {
            ++var1;
         }
      }

      return var1;
   }

   static {
      Q = new class_anw[]{a, b, O, P, N};
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] a;
      // $FF: synthetic field
      static final int[] b;
      // $FF: synthetic field
      static final int[] c = new int[Block.class_a_in_class_agj.values().length];

      static {
         try {
            c[Block.class_a_in_class_agj.b.ordinal()] = 1;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            c[Block.class_a_in_class_agj.c.ordinal()] = 2;
         } catch (NoSuchFieldError var9) {
            ;
         }

         b = new int[Block.class_c_in_class_agj.values().length];

         try {
            b[Block.class_c_in_class_agj.c.ordinal()] = 1;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            b[Block.class_c_in_class_agj.d.ordinal()] = 2;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            b[Block.class_c_in_class_agj.b.ordinal()] = 3;
         } catch (NoSuchFieldError var6) {
            ;
         }

         a = new int[class_cq.values().length];

         try {
            a[class_cq.b.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            a[class_cq.c.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            a[class_cq.d.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            a[class_cq.f.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            a[class_cq.e.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
