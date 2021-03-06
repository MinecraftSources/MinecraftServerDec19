package net.minecraft.server;


public class HandShakeListener implements class_jf {
	private final MinecraftServer a;
	private final class_ek b;

	public HandShakeListener(MinecraftServer var1, class_ek var2) {
		a = var1;
		b = var2;
	}

	@Override
	public void a(PacketHandshakingInSetProtocol var1) {
		switch (HandShakeListener.SyntheticClass_1.a[var1.a().ordinal()]) {
			case 1:
				b.a(EnumProtocol.LOGIN);
				class_fa var2;
				if (var1.b() > 66) {
					var2 = new class_fa("Outdated server! I\'m still on 15w35e");
					b.a((new class_jl(var2)));
					b.a(var2);
				} else if (var1.b() < 66) {
					var2 = new class_fa("Outdated client! Please use 15w35e");
					b.a((new class_jl(var2)));
					b.a(var2);
				} else {
					b.a((new class_lv(a, b)));
				}
				break;
			case 2:
				b.a(EnumProtocol.STATUS);
				b.a((new class_lw(a, b)));
				break;
			default:
				throw new UnsupportedOperationException("Invalid intention " + var1.a());
		}

	}

	@Override
	public void a(IChatBaseComponent var1) {
	}

	// $FF: synthetic class
	static class SyntheticClass_1 {
		// $FF: synthetic field
		static final int[] a = new int[EnumProtocol.values().length];

		static {
			try {
				a[EnumProtocol.LOGIN.ordinal()] = 1;
			} catch (NoSuchFieldError var2) {
				;
			}

			try {
				a[EnumProtocol.STATUS.ordinal()] = 2;
			} catch (NoSuchFieldError var1) {
				;
			}

		}
	}
}
