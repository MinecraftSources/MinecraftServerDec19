package net.minecraft.server;

import net.minecraft.server.Item;
import net.minecraft.server.ItemStack;
import net.minecraft.server.Items;
import net.minecraft.server.World;
import net.minecraft.server.Material;
import net.minecraft.server.MovingObjectPosition;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.StatisticList;
import net.minecraft.server.EnumUsedHand;
import net.minecraft.server.UseResult;
import net.minecraft.server.class_or;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.CreativeTab;

public class class_zk extends Item {
   public class_zk() {
      this.a(CreativeTab.BREWING);
   }

   public class_or a(ItemStack var1, World var2, EntityHuman var3, EnumUsedHand var4) {
      MovingObjectPosition var5 = this.a(var2, var3, true);
      if(var5 == null) {
         return new class_or(UseResult.CANT_USE, var1);
      } else {
         if(var5.a == MovingObjectPosition.class_a_in_class_awg.b) {
            BlockPosition var6 = var5.a();
            if(!var2.a(var3, var6)) {
               return new class_or(UseResult.CANT_USE, var1);
            }

            if(!var3.a(var6.shift(var5.b), var5.b, var1)) {
               return new class_or(UseResult.CANT_USE, var1);
            }

            if(var2.getType(var6).getBlock().getMaterial() == Material.WATER) {
               --var1.count;
               var3.b(StatisticList.ad[Item.getId((Item)this)]);
               if(var1.count <= 0) {
                  return new class_or(UseResult.SUCCESS, new ItemStack(Items.bB));
               }

               if(!var3.inventory.a(new ItemStack(Items.bB))) {
                  var3.a(new ItemStack(Items.bB), false);
               }

               return new class_or(UseResult.SUCCESS, var1);
            }
         }

         return new class_or(UseResult.CANT_USE, var1);
      }
   }
}
