package net.minecraft.server;


public class class_tu extends class_sr {
	EntityCreeper a;
	EntityLiving b;

	public class_tu(EntityCreeper var1) {
		a = var1;
		this.a(1);
	}

	@Override
	public boolean a() {
		EntityLiving var1 = a.w();
		return (a.cF() > 0) || ((var1 != null) && (a.h(var1) < 9.0D));
	}

	@Override
	public void c() {
		a.u().n();
		b = a.w();
	}

	@Override
	public void d() {
		b = null;
	}

	@Override
	public void e() {
		if (b == null) {
			a.a(-1);
		} else if (a.h(b) > 49.0D) {
			a.a(-1);
		} else if (!a.v().a(b)) {
			a.a(-1);
		} else {
			a.a(1);
		}
	}
}
