package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;

public class class_alk extends BlockPlant implements class_ain {
	protected class_alk() {
		float var1 = 0.2F;
		this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var1 * 2.0F, 0.5F + var1);
		this.a(true);
	}

	@Override
	public void b(class_ago var1, class_cj var2, class_apn var3, Random var4) {
		if (var4.nextInt(25) == 0) {
			int var5 = 5;
			boolean var6 = true;
			Iterator var7 = class_cj.b(var2.a(-4, -1, -4), var2.a(4, 1, 4)).iterator();

			while (var7.hasNext()) {
				class_cj var8 = (class_cj) var7.next();
				if (var1.p(var8).c() == this) {
					--var5;
					if (var5 <= 0) {
						return;
					}
				}
			}

			class_cj var9 = var2.a(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);

			for (int var10 = 0; var10 < 4; ++var10) {
				if (var1.d(var9) && this.g(var1, var9, getBlockData())) {
					var2 = var9;
				}

				var9 = var2.a(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
			}

			if (var1.d(var9) && this.g(var1, var9, getBlockData())) {
				var1.a(var9, getBlockData(), 2);
			}
		}

	}

	@Override
	public boolean c(class_ago var1, class_cj var2) {
		return super.c(var1, var2) && this.g(var1, var2, getBlockData());
	}

	@Override
	protected boolean c(Block var1) {
		return var1.q();
	}

	@Override
	public boolean g(class_ago var1, class_cj var2, class_apn var3) {
		if ((var2.o() >= 0) && (var2.o() < 256)) {
			class_apn var4 = var1.p(var2.b());
			return var4.c() == Blocks.MYCELIUM ? true : ((var4.c() == Blocks.DIRT) && (var4.b(class_ajl.a) == class_ajl.class_a_in_class_ajl.c) ? true : (var1.k(var2) < 13) && this.c(var4.c()));
		} else {
			return false;
		}
	}

	public boolean d(class_ago var1, class_cj var2, class_apn var3, Random var4) {
		var1.g(var2);
		class_asv var5 = null;
		if (this == Blocks.BROWN_MUSHROOM) {
			var5 = new class_asv(Blocks.BROWN_MUSHROOM_BLOCK);
		} else if (this == Blocks.RED_MUSHROOM) {
			var5 = new class_asv(Blocks.RED_MUSHROOM_BLOCK);
		}

		if ((var5 != null) && var5.b(var1, var4, var2)) {
			return true;
		} else {
			var1.a(var2, var3, 3);
			return false;
		}
	}

	@Override
	public boolean a(class_ago var1, class_cj var2, class_apn var3, boolean var4) {
		return true;
	}

	@Override
	public boolean a(class_ago var1, Random var2, class_cj var3, class_apn var4) {
		return var2.nextFloat() < 0.4D;
	}

	@Override
	public void b(class_ago var1, Random var2, class_cj var3, class_apn var4) {
		this.d(var1, var3, var4, var2);
	}
}
