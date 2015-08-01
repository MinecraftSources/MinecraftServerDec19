package net.minecraft.server;

import java.io.PrintStream;
import java.util.Random;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mojang.authlib.GameProfile;

public class Bootstrap {

	private static final PrintStream a = System.out;
	private static boolean init = false;
	private static final Logger logger = LogManager.getLogger();

	public static boolean isInitDone() {
		return init;
	}

	static void b() {
		BlockDispenser.REGISTRY.register(Items.g, new class_kb() {
			@Override
			protected class_xi a(World var1, class_cz var2, ItemStack var3) {
				class_xd var4 = new class_xd(var1, var2.getX(), var2.getY(), var2.getZ());
				var4.c = 1;
				return var4;
			}
		});
		BlockDispenser.REGISTRY.register(Items.i, new class_kb() {
			@Override
			protected class_xi a(World var1, class_cz var2, ItemStack var3) {
				class_xt var4 = new class_xt(var1, var2.getX(), var2.getY(), var2.getZ(), var3);
				var4.c = 1;
				return var4;
			}
		});
		BlockDispenser.REGISTRY.register(Items.h, new class_kb() {
			@Override
			protected class_xi a(World var1, class_cz var2, ItemStack var3) {
				class_xn var4 = new class_xn(var1, var2.getX(), var2.getY(), var2.getZ());
				var4.c = 1;
				return var4;
			}
		});
		BlockDispenser.REGISTRY.register(Items.aR, new class_kb() {
			@Override
			protected class_xi a(World var1, class_cz var2, ItemStack var3) {
				return new class_xp(var1, var2.getX(), var2.getY(), var2.getZ());
			}
		});
		BlockDispenser.REGISTRY.register(Items.aF, new class_kb() {
			@Override
			protected class_xi a(World var1, class_cz var2, ItemStack var3) {
				return new class_xm(var1, var2.getX(), var2.getY(), var2.getZ());
			}
		});
		BlockDispenser.REGISTRY.register(Items.bN, new class_kb() {
			@Override
			protected class_xi a(World var1, class_cz var2, ItemStack var3) {
				return new class_xr(var1, var2.getX(), var2.getY(), var2.getZ());
			}

			@Override
			protected float a() {
				return super.a() * 0.5F;
			}

			@Override
			protected float b() {
				return super.b() * 1.25F;
			}
		});
		BlockDispenser.REGISTRY.register(Items.bC, new IDispenseBehavior() {
			private final DispenseBehaviorItem b = new DispenseBehaviorItem();

			@Override
			public ItemStack a(ISourceBlock var1, final ItemStack var2) {
				return (new class_kb() {
					@Override
					protected class_xi a(World var1, class_cz var2x, ItemStack var3) {
						return new class_xs(var1, var2x.getX(), var2x.getY(), var2x.getZ(), var2.clone());
					}

					@Override
					protected float a() {
						return super.a() * 0.5F;
					}

					@Override
					protected float b() {
						return super.b() * 1.25F;
					}
				}).a(var1, var2);
			}
		});
		BlockDispenser.REGISTRY.register(Items.bM, new DispenseBehaviorItem() {
			@Override
			public ItemStack b(ISourceBlock var1, ItemStack var2) {
				EnumDirection var3 = BlockDispenser.b(var1.getData());
				double var4 = var1.getX() + var3.getAdjacentX();
				double var6 = var1.getPosition().getY() + 0.2F;
				double var8 = var1.getZ() + var3.getAdjacentZ();
				Entity var10 = class_abt.a(var1.getWorld(), var2.i(), var4, var6, var8);
				if((var10 instanceof EntityLiving) && var2.hasDisplayName()) {
					((class_qb)var10).a(var2.getDisplayName());
				}

				var2.a(1);
				return var2;
			}
		});
		BlockDispenser.REGISTRY.register(Items.ce, new DispenseBehaviorItem() {
			@Override
			public ItemStack b(ISourceBlock var1, ItemStack var2) {
				EnumDirection var3 = BlockDispenser.b(var1.getData());
				double var4 = var1.getX() + var3.getAdjacentX();
				double var6 = var1.getPosition().getY() + 0.2F;
				double var8 = var1.getZ() + var3.getAdjacentZ();
				class_xg var10 = new class_xg(var1.getWorld(), var4, var6, var8, var2);
				var1.getWorld().addEntity(var10);
				var2.a(1);
				return var2;
			}

			@Override
			protected void a(ISourceBlock var1) {
				var1.getWorld().b(1002, var1.getPosition(), 0);
			}
		});
		BlockDispenser.REGISTRY.register(Items.bO, new DispenseBehaviorItem() {
			@Override
			public ItemStack b(ISourceBlock var1, ItemStack var2) {
				EnumDirection var3 = BlockDispenser.b(var1.getData());
				class_cz var4 = BlockDispenser.a(var1);
				double var5 = var4.getX() + var3.getAdjacentX() * 0.3F;
				double var7 = var4.getY() + var3.getAdjacentY() * 0.3F;
				double var9 = var4.getZ() + var3.getAdjacentZ() * 0.3F;
				World var11 = var1.getWorld();
				Random var12 = var11.random;
				double var13 = (var12.nextGaussian() * 0.05D) + var3.getAdjacentX();
				double var15 = (var12.nextGaussian() * 0.05D) + var3.getAdjacentY();
				double var17 = (var12.nextGaussian() * 0.05D) + var3.getAdjacentZ();
				var11.addEntity((new class_xl(var11, var5, var7, var9, var13, var15, var17)));
				var2.a(1);
				return var2;
			}

			@Override
			protected void a(ISourceBlock var1) {
				var1.getWorld().b(1009, var1.getPosition(), 0);
			}
		});
		BlockDispenser.REGISTRY.register(Items.aG, new DispenseBehaviorItem() {
			private final DispenseBehaviorItem b = new DispenseBehaviorItem();

			@Override
			public ItemStack b(ISourceBlock var1, ItemStack var2) {
				EnumDirection var3 = BlockDispenser.b(var1.getData());
				World var4 = var1.getWorld();
				double var5 = var1.getX() + var3.getAdjacentX() * 1.125F;
				double var7 = var1.getY() + var3.getAdjacentY() * 1.125F;
				double var9 = var1.getZ() + var3.getAdjacentZ() * 1.125F;
				BlockPosition var11 = var1.getPosition().shift(var3);
				Material var12 = var4.getType(var11).getBlock().getMaterial();
				double var13;
				if(Material.WATER.equals(var12)) {
					var13 = 1.0D;
				} else {
					if(!Material.AIR.equals(var12) || !Material.WATER.equals(var4.getType(var11.down()).getBlock().getMaterial())) {
						return b.a(var1, var2);
					}

					var13 = 0.0D;
				}

				class_vk var15 = new class_vk(var4, var5, var7 + var13, var9);
				var4.addEntity(var15);
				var2.a(1);
				return var2;
			}

			@Override
			protected void a(ISourceBlock var1) {
				var1.getWorld().b(1000, var1.getPosition(), 0);
			}
		});
		DispenseBehaviorItem var0 = new DispenseBehaviorItem() {
			private final DispenseBehaviorItem b = new DispenseBehaviorItem();

			@Override
			public ItemStack b(ISourceBlock var1, ItemStack var2) {
				class_zn var3 = (class_zn)var2.getItem();
				BlockPosition var4 = var1.getPosition().shift(BlockDispenser.b(var1.getData()));
				if(var3.a(var1.getWorld(), var4)) {
					var2.a(Items.ay);
					var2.count = 1;
					return var2;
				} else {
					return b.a(var1, var2);
				}
			}
		};
		BlockDispenser.REGISTRY.register(Items.aA, var0);
		BlockDispenser.REGISTRY.register(Items.az, var0);
		BlockDispenser.REGISTRY.register(Items.ay, new DispenseBehaviorItem() {
			private final DispenseBehaviorItem b = new DispenseBehaviorItem();

			@Override
			public ItemStack b(ISourceBlock var1, ItemStack var2) {
				World var3 = var1.getWorld();
				BlockPosition var4 = var1.getPosition().shift(BlockDispenser.b(var1.getData()));
				IBlockData var5 = var3.getType(var4);
				Block var6 = var5.getBlock();
				Material var7 = var6.getMaterial();
				Item var8;
				if(Material.WATER.equals(var7) && (var6 instanceof BlockFluids) && (((Integer)var5.get(BlockFluids.LEVEL)).intValue() == 0)) {
					var8 = Items.az;
				} else {
					if(!Material.LAVA.equals(var7) || !(var6 instanceof BlockFluids) || (((Integer)var5.get(BlockFluids.LEVEL)).intValue() != 0)) {
						return super.b(var1, var2);
					}

					var8 = Items.aA;
				}

				var3.setAir(var4);
				if(--var2.count == 0) {
					var2.a(var8);
					var2.count = 1;
				} else if(((TileEntityDispenser)var1.getTileEntity()).a(new ItemStack(var8)) < 0) {
					b.a(var1, new ItemStack(var8));
				}

				return var2;
			}
		});
		BlockDispenser.REGISTRY.register(Items.d, new DispenseBehaviorItem() {
			private boolean b = true;

			@Override
			protected ItemStack b(ISourceBlock var1, ItemStack var2) {
				World var3 = var1.getWorld();
				BlockPosition var4 = var1.getPosition().shift(BlockDispenser.b(var1.getData()));
				if(var3.isEmpty(var4)) {
					var3.setTypeUpdate(var4, Blocks.FIRE.getBlockData());
					if(var2.a(1, var3.random)) {
						var2.count = 0;
					}
				} else if(var3.getType(var4).getBlock() == Blocks.TNT) {
					Blocks.TNT.postBreak(var3, var4, Blocks.TNT.getBlockData().set(class_alo.a, Boolean.valueOf(true)));
					var3.setAir(var4);
				} else {
					b = false;
				}

				return var2;
			}

			@Override
			protected void a(ISourceBlock var1) {
				if(b) {
					var1.getWorld().b(1000, var1.getPosition(), 0);
				} else {
					var1.getWorld().b(1001, var1.getPosition(), 0);
				}

			}
		});
		BlockDispenser.REGISTRY.register(Items.aY, new DispenseBehaviorItem() {
			private boolean b = true;

			@Override
			protected ItemStack b(ISourceBlock var1, ItemStack var2) {
				if(EnumColor.a == EnumColor.a(var2.i())) {
					World var3 = var1.getWorld();
					BlockPosition var4 = var1.getPosition().shift(BlockDispenser.b(var1.getData()));
					if(class_zz.a(var2, var3, var4)) {
						if(!var3.isClientSide) {
							var3.b(2005, var4, 0);
						}
					} else {
						b = false;
					}

					return var2;
				} else {
					return super.b(var1, var2);
				}
			}

			@Override
			protected void a(ISourceBlock var1) {
				if(b) {
					var1.getWorld().b(1000, var1.getPosition(), 0);
				} else {
					var1.getWorld().b(1001, var1.getPosition(), 0);
				}

			}
		});
		BlockDispenser.REGISTRY.register(Item.getByBlock(Blocks.TNT), new DispenseBehaviorItem() {
			@Override
			protected ItemStack b(ISourceBlock var1, ItemStack var2) {
				World var3 = var1.getWorld();
				BlockPosition var4 = var1.getPosition().shift(BlockDispenser.b(var1.getData()));
				EntityTNTPrimed var5 = new EntityTNTPrimed(var3, var4.getX() + 0.5D, var4.getY(), var4.getZ() + 0.5D, (EntityLiving)null);
				var3.addEntity(var5);
				var3.a(var5, "game.tnt.primed", 1.0F, 1.0F);
				--var2.count;
				return var2;
			}
		});
		BlockDispenser.REGISTRY.register(Items.ca, new DispenseBehaviorItem() {
			private boolean b = true;

			@Override
			protected ItemStack b(ISourceBlock var1, ItemStack var2) {
				World var3 = var1.getWorld();
				EnumDirection var4 = BlockDispenser.b(var1.getData());
				BlockPosition var5 = var1.getPosition().shift(var4);
				class_akv var6 = Blocks.SKULL;
				if(var3.isEmpty(var5) && var6.b(var3, var5, var2)) {
					if(!var3.isClientSide) {
						var3.setTypeAndData(var5, var6.getBlockData().set(class_akv.a, EnumDirection.UP), 3);
						TileEntity var7 = var3.getTileEntity(var5);
						if(var7 instanceof TileEntitySkull) {
							if(var2.i() == 3) {
								GameProfile var8 = null;
								if(var2.hasTag()) {
									NBTTagCompound var9 = var2.getTag();
									if(var9.hasOfType("SkullOwner", 10)) {
										var8 = class_dy.a(var9.getCompound("SkullOwner"));
									} else if(var9.hasOfType("SkullOwner", 8)) {
										String var10 = var9.getString("SkullOwner");
										if(!class_nz.b(var10)) {
											var8 = new GameProfile((UUID)null, var10);
										}
									}
								}

								((TileEntitySkull)var7).a(var8);
							} else {
								((TileEntitySkull)var7).a(var2.i());
							}

							((TileEntitySkull)var7).b(var4.opposite().getHorizontalId() * 4);
							Blocks.SKULL.a(var3, var5, (TileEntitySkull)var7);
						}

						--var2.count;
					}
				} else {
					b = false;
				}

				return var2;
			}

			@Override
			protected void a(ISourceBlock var1) {
				if(b) {
					var1.getWorld().b(1000, var1.getPosition(), 0);
				} else {
					var1.getWorld().b(1001, var1.getPosition(), 0);
				}

			}
		});
		BlockDispenser.REGISTRY.register(Item.getByBlock(Blocks.PUMPKIN), new DispenseBehaviorItem() {
			private boolean b = true;

			@Override
			protected ItemStack b(ISourceBlock var1, ItemStack var2) {
				World var3 = var1.getWorld();
				BlockPosition var4 = var1.getPosition().shift(BlockDispenser.b(var1.getData()));
				class_akd var5 = (class_akd)Blocks.PUMPKIN;
				if(var3.isEmpty(var4) && var5.e(var3, var4)) {
					if(!var3.isClientSide) {
						var3.setTypeAndData(var4, var5.getBlockData(), 3);
					}

					--var2.count;
				} else {
					b = false;
				}

				return var2;
			}

			@Override
			protected void a(ISourceBlock var1) {
				if(b) {
					var1.getWorld().b(1000, var1.getPosition(), 0);
				} else {
					var1.getWorld().b(1001, var1.getPosition(), 0);
				}

			}
		});
	}

	public static void init() {
		if(!init) {
			init = true;
			if(logger.isDebugEnabled()) {
				rerouteStreams();
			}

			Block.init();
			class_aib.l();
			class_pk.k();
			class_adi.e();
			Item.init();
			class_acd.c();
			class_ace.a();
			StatisticList.a();
			b();
		}
	}

	private static void rerouteStreams() {
		System.setErr(new class_kh("STDERR", System.err));
		System.setOut(new class_kh("STDOUT", a));
	}

}
