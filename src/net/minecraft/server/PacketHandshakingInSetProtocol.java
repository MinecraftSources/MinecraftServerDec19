package net.minecraft.server;

import java.io.IOException;

public class PacketHandshakingInSetProtocol implements Packet {
	private int a;
	private String b;
	private int c;
	private EnumProtocol d;

	@Override
	public void decode(PacketDataSerializer var1) throws IOException {
		a = var1.g();
		b = var1.c(255);
		c = var1.readUnsignedShort();
		d = EnumProtocol.a(var1.g());
	}

	@Override
	public void encode(PacketDataSerializer var1) throws IOException {
		var1.b(a);
		var1.a(b);
		var1.writeShort(c);
		var1.b(d.a());
	}

	public void a(class_jf var1) {
		var1.a(this);
	}

	public EnumProtocol a() {
		return d;
	}

	public int b() {
		return a;
	}

	// $FF: synthetic method
	// $FF: bridge method
	@Override
	public void handle(PacketListener var1) {
		this.a((class_jf) var1);
	}
}
