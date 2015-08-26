package net.minecraft.server;

import java.util.Set;

import com.google.common.collect.Sets;

public class Blocks {
	
	private static final Set BLOCK_REGISTRY;
	public static final Block AIR;
	public static final Block STONE;
	public static final BlockGrass GRASS;
	public static final Block DIRT;
	public static final Block COBBLESTONE;
	public static final Block PLANKS;
	public static final Block SAPLING;
	public static final Block BEDROCK;
	public static final BlockFlowing FLOWING_WATER;
	public static final BlockStationary WATER;
	public static final BlockFlowing FLOWING_LAVA;
	public static final BlockStationary LAVA;
	public static final BlockSand SAND;
	public static final Block GRAVEL;
	public static final Block GOLD_ORE;
	public static final Block IRON_ORE;
	public static final Block COAL_ORE;
	public static final Block LOG;
	public static final Block LOG2;
	public static final class_alc LEAVES;
	public static final class_alc LEAVES2;
	public static final Block SPONGE;
	public static final Block GLASS;
	public static final Block LAPIS_ORE;
	public static final Block LAPIS_BLOCK;
	public static final Block DISPENSER;
	public static final Block SANDSTONE;
	public static final Block NOTEBLOCK;
	public static final Block BED;
	public static final Block GOLDEN_RAIL;
	public static final Block DETECTOR_RAIL;
	public static final BlockPiston STICKY_PISTON;
	public static final Block WEB;
	public static final BlockLongGrass TALLGRASS;
	public static final BlockDeadBush DEADBUSH;
	public static final BlockPiston PISTON;
	public static final BlockPistonExtension PISTON_HEAD;
	public static final Block WOOL;
	public static final BlockPistonMoving PISTON_EXTENSION;
	public static final BlockFlowers YELLOW_FLOWER;
	public static final BlockFlowers RED_FLOWER;
	public static final BlockPlant BROWN_MUSHROOM;
	public static final BlockPlant RED_MUSHROOM;
	public static final Block GOLD_BLOCK;
	public static final Block IRON_BLOCK;
	public static final BlockStepAbstract DOUBLE_SANDSTONE_SLAB;
	public static final BlockStepAbstract STONE_SLAB;
	public static final Block BRICK_BLOCK;
	public static final Block TNT;
	public static final Block BOOKSHELF;
	public static final Block MOSSY_COBBLESTONE;
	public static final Block OBSIDIAN;
	public static final Block TORCH;
	public static final BlockFire FIRE;
	public static final Block MOB_SPAWNER;
	public static final Block OAK_STAIRS;
	public static final BlockChest CHEST;
	public static final BlockRedstoneWire REDSTONE_WIRE;
	public static final Block DIAMOND_ORE;
	public static final Block DIAMOND_BLOCK;
	public static final Block CRAFTING_TABLE;
	public static final Block WHEAT;
	public static final Block FARMLAND;
	public static final Block FURNACE;
	public static final Block LIT_FURNACE;
	public static final Block STANDING_SIGN;
	public static final Block WOODEN_DOOR;
	public static final Block SPRUCE_DOOR;
	public static final Block BIRCH_DOOR;
	public static final Block JUNGLE_DOOR;
	public static final Block ACACIA_DOOR;
	public static final Block DARK_OAK_DOOR;
	public static final Block LADDER;
	public static final Block RAIL;
	public static final Block STONE_STAIRS;
	public static final Block WALL_SIGN;
	public static final Block LEVER;
	public static final Block STONE_PRESSURE_PLATE;
	public static final Block IRON_DOOR;
	public static final Block WOODEN_PRESSURE_PLATE;
	public static final Block REDSTONE_ORE;
	public static final Block LIT_REDSTONE_TORCH;
	public static final Block UNLIN_REDSTONE_TORCH;
	public static final Block REDSTONE_TORCH;
	public static final Block STONE_BUTTON;
	public static final Block SNOW_LAYER;
	public static final Block ICE;
	public static final Block SNOW;
	public static final BlockCactus CACTUS;
	public static final Block CLAY;
	public static final BlockReed REEDS;
	public static final Block JUKEBOX;
	public static final Block FENCE;
	public static final Block SPRUCE_FENCE;
	public static final Block BIRCH_FENCE;
	public static final Block JUNGLE_FENCE;
	public static final Block DARK_OAK_FENCE;
	public static final Block ACACIA_FENCE;
	public static final Block PUMPKIN;
	public static final Block NETHERRACK;
	public static final Block SOUL_SAND;
	public static final Block GLOWSTONE;
	public static final BlockPortal PORTAL;
	public static final Block LIT_PUMPKIN;
	public static final Block CAKE;
	public static final BlockRedstoneRepeater UNPOWERED_REPEATER;
	public static final BlockRedstoneRepeater POWERED_REPEATER;
	public static final Block TRAPDOOR;
	public static final Block MONSTER_EGG;
	public static final Block STONE_BRICK;
	public static final Block BROWN_MUSHROOM_BLOCK;
	public static final Block RED_MUSHROOM_BLOCK;
	public static final Block IRON_BARS;
	public static final Block GLASS_PANE;
	public static final Block MELON_BLOCK;
	public static final Block PUMPKIN_STEM;
	public static final Block MELON_STEM;
	public static final Block VINE;
	public static final Block FENCE_GATE;
	public static final Block SPRUCE_FENCE_GATE;
	public static final Block BIRCH_FENCE_GATE;
	public static final Block JUNGLE_FENCE_GATE;
	public static final Block DARK_OAK_FENCE_GATE;
	public static final Block ACACIA_FENCE_GATE;
	public static final Block BRICK_STAIRS;
	public static final Block STONE_BRICK_STAIRS;
	public static final BlockMycel MYCELIUM;
	public static final Block WATERLILY;
	public static final Block NETHER_BRICK;
	public static final Block NETHER_BRICK_FENCE;
	public static final Block NETHER_BRICK_STAIRS;
	public static final Block NETHER_WART;
	public static final Block ENCHANTING_TABLE;
	public static final Block BRWEWING_STAND;
	public static final BlockCauldron CAULDRON;
	public static final Block END_PORTAL;
	public static final Block END_PORTAL_FRAME;
	public static final Block END_STONE;
	public static final Block DRAGON_EGG;
	public static final Block REDSTONE_LAMP;
	public static final Block LIT_REDSTONE_LAMP;
	public static final BlockStepAbstract DOUBLE_WOODEN_SLAB;
	public static final BlockStepAbstract WOODEN_SLAB;
	public static final Block COCOA;
	public static final Block SANDSTONE_STAIRS;
	public static final Block EMERALD_ORE;
	public static final Block ENDER_CHEST;
	public static final BlockTripwireHook TRIPWIRE_HOOK;
	public static final Block TRIPWIRE;
	public static final Block EMERALD_BLOCK;
	public static final Block SPRUCE_STAIRS;
	public static final Block BIRCH_STAIRS;
	public static final Block JUNGLE_STAIRS;
	public static final Block COMMAND_BLOCK;
	public static final BlockBeacon BEACON;
	public static final Block COBBLESTONE_WALL;
	public static final Block FLOWER_POT;
	public static final Block CARROTS;
	public static final Block POTATOES;
	public static final Block WOODEN_BUTTON;
	public static final BlockSkull SKULL;
	public static final Block ANVIL;
	public static final Block TRAPPED_CHEST;
	public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE;
	public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE;
	public static final BlockRedstoneComparator UNPOWERED_COMPARATOR;
	public static final BlockRedstoneComparator POWERED_COMPARATOR;
	public static final BlockRedstoneDetector DAYLIGHT_DETECTOR;
	public static final BlockRedstoneDetector DAYLIGHT_DETECTOR_INVERTED;
	public static final Block REDSTONE_BLOCK;
	public static final Block QUARTZ_ORE;
	public static final BlockHopper HOPPER;
	public static final Block QUARTZ_BLOCK;
	public static final Block QUARTZ_STAIRS;
	public static final Block ACTIVATOR_RAIL;
	public static final Block DROPPER;
	public static final Block STAINED_HARDENED_CLAY;
	public static final Block BARRIER;
	public static final Block IRON_TRAPDOOR;
	public static final Block HAY_BLOCK;
	public static final Block CARPET;
	public static final Block HARDENED_CLAY;
	public static final Block COAL_BLOCK;
	public static final Block PACKED_ICE;
	public static final Block ACACIA_STAIRS;
	public static final Block DARK_OAK_STAIRS;
	public static final Block SLIME;
	public static final BlockTallPlant DOUBLE_PLANT;
	public static final BlockStainedGlass STAINED_GLASS;
	public static final BlockStainedGlassPane STAINED_GLASS_PANE;
	public static final Block PRISMARINE;
	public static final Block SEA_LANTERN;
	public static final Block STANDING_BANNER;
	public static final Block WALL_BANNER;
	public static final Block RED_SANDSTONE;
	public static final Block RED_SANDSTONE_STAIRS;
	public static final BlockStepAbstract DOUBLE_STONE_SLAB2;
	public static final BlockStepAbstract STONE_SLAB2;
	public static final Block END_ROD;
	public static final Block CHORUS_PLANT;
	public static final Block CHORUS_FLOWER;
	public static final Block PURPUR_BLOCK;
	public static final Block PURPUR_PILLAR;
	public static final Block PURPUR_STAIRS;
	public static final BlockStepAbstract PURPUR_DOUBLE_SLAB;
	public static final BlockStepAbstract PURPUR_SLAB;
	public static final Block END_BRICKS;
	public static final Block BEETROOTS;
	public static final Block GRASS_PATH;
	public static final Block END_GATEWAY;
	public static final Block REPEATING_COMMAND_BLOCK;
	public static final Block CHAIN_COMMAND_BLOCK;
	public static final Block STRUCTURE_BLOCK;

	private static Block getByName(String var0) {
		Block var1 = (Block) Block.c.c(new class_ke(var0));
		if (!BLOCK_REGISTRY.add(var1)) {
			throw new IllegalStateException("Invalid Block requested: " + var0);
		} else {
			return var1;
		}
	}

	static {
		if (!Bootstrap.isInitDone()) {
			throw new RuntimeException("Accessed Blocks before Bootstrap!");
		} else {
			BLOCK_REGISTRY = Sets.newHashSet();
			AIR = getByName("air");
			STONE = getByName("stone");
			GRASS = (BlockGrass) getByName("grass");
			DIRT = getByName("dirt");
			COBBLESTONE = getByName("cobblestone");
			PLANKS = getByName("planks");
			SAPLING = getByName("sapling");
			BEDROCK = getByName("bedrock");
			FLOWING_WATER = (BlockFlowing) getByName("flowing_water");
			WATER = (BlockStationary) getByName("water");
			FLOWING_LAVA = (BlockFlowing) getByName("flowing_lava");
			LAVA = (BlockStationary) getByName("lava");
			SAND = (BlockSand) getByName("sand");
			GRAVEL = getByName("gravel");
			GOLD_ORE = getByName("gold_ore");
			IRON_ORE = getByName("iron_ore");
			COAL_ORE = getByName("coal_ore");
			LOG = getByName("log");
			LOG2 = getByName("log2");
			LEAVES = (class_alc) getByName("leaves");
			LEAVES2 = (class_alc) getByName("leaves2");
			SPONGE = getByName("sponge");
			GLASS = getByName("glass");
			LAPIS_ORE = getByName("lapis_ore");
			LAPIS_BLOCK = getByName("lapis_block");
			DISPENSER = getByName("dispenser");
			SANDSTONE = getByName("sandstone");
			NOTEBLOCK = getByName("noteblock");
			BED = getByName("bed");
			GOLDEN_RAIL = getByName("golden_rail");
			DETECTOR_RAIL = getByName("detector_rail");
			STICKY_PISTON = (BlockPiston) getByName("sticky_piston");
			WEB = getByName("web");
			TALLGRASS = (BlockLongGrass) getByName("tallgrass");
			DEADBUSH = (BlockDeadBush) getByName("deadbush");
			PISTON = (BlockPiston) getByName("piston");
			PISTON_HEAD = (BlockPistonExtension) getByName("piston_head");
			WOOL = getByName("wool");
			PISTON_EXTENSION = (BlockPistonMoving) getByName("piston_extension");
			YELLOW_FLOWER = (BlockFlowers) getByName("yellow_flower");
			RED_FLOWER = (BlockFlowers) getByName("red_flower");
			BROWN_MUSHROOM = (BlockPlant) getByName("brown_mushroom");
			RED_MUSHROOM = (BlockPlant) getByName("red_mushroom");
			GOLD_BLOCK = getByName("gold_block");
			IRON_BLOCK = getByName("iron_block");
			DOUBLE_SANDSTONE_SLAB = (BlockStepAbstract) getByName("double_stone_slab");
			STONE_SLAB = (BlockStepAbstract) getByName("stone_slab");
			BRICK_BLOCK = getByName("brick_block");
			TNT = getByName("tnt");
			BOOKSHELF = getByName("bookshelf");
			MOSSY_COBBLESTONE = getByName("mossy_cobblestone");
			OBSIDIAN = getByName("obsidian");
			TORCH = getByName("torch");
			FIRE = (BlockFire) getByName("fire");
			MOB_SPAWNER = getByName("mob_spawner");
			OAK_STAIRS = getByName("oak_stairs");
			CHEST = (BlockChest) getByName("chest");
			REDSTONE_WIRE = (BlockRedstoneWire) getByName("redstone_wire");
			DIAMOND_ORE = getByName("diamond_ore");
			DIAMOND_BLOCK = getByName("diamond_block");
			CRAFTING_TABLE = getByName("crafting_table");
			WHEAT = getByName("wheat");
			FARMLAND = getByName("farmland");
			FURNACE = getByName("furnace");
			LIT_FURNACE = getByName("lit_furnace");
			STANDING_SIGN = getByName("standing_sign");
			WOODEN_DOOR = getByName("wooden_door");
			SPRUCE_DOOR = getByName("spruce_door");
			BIRCH_DOOR = getByName("birch_door");
			JUNGLE_DOOR = getByName("jungle_door");
			ACACIA_DOOR = getByName("acacia_door");
			DARK_OAK_DOOR = getByName("dark_oak_door");
			LADDER = getByName("ladder");
			RAIL = getByName("rail");
			STONE_STAIRS = getByName("stone_stairs");
			WALL_SIGN = getByName("wall_sign");
			LEVER = getByName("lever");
			STONE_PRESSURE_PLATE = getByName("stone_pressure_plate");
			IRON_DOOR = getByName("iron_door");
			WOODEN_PRESSURE_PLATE = getByName("wooden_pressure_plate");
			REDSTONE_ORE = getByName("redstone_ore");
			LIT_REDSTONE_TORCH = getByName("lit_redstone_ore");
			UNLIN_REDSTONE_TORCH = getByName("unlit_redstone_torch");
			REDSTONE_TORCH = getByName("redstone_torch");
			STONE_BUTTON = getByName("stone_button");
			SNOW_LAYER = getByName("snow_layer");
			ICE = getByName("ice");
			SNOW = getByName("snow");
			CACTUS = (BlockCactus) getByName("cactus");
			CLAY = getByName("clay");
			REEDS = (BlockReed) getByName("reeds");
			JUKEBOX = getByName("jukebox");
			FENCE = getByName("fence");
			SPRUCE_FENCE = getByName("spruce_fence");
			BIRCH_FENCE = getByName("birch_fence");
			JUNGLE_FENCE = getByName("jungle_fence");
			DARK_OAK_FENCE = getByName("dark_oak_fence");
			ACACIA_FENCE = getByName("acacia_fence");
			PUMPKIN = getByName("pumpkin");
			NETHERRACK = getByName("netherrack");
			SOUL_SAND = getByName("soul_sand");
			GLOWSTONE = getByName("glowstone");
			PORTAL = (BlockPortal) getByName("portal");
			LIT_PUMPKIN = getByName("lit_pumpkin");
			CAKE = getByName("cake");
			UNPOWERED_REPEATER = (BlockRedstoneRepeater) getByName("unpowered_repeater");
			POWERED_REPEATER = (BlockRedstoneRepeater) getByName("powered_repeater");
			TRAPDOOR = getByName("trapdoor");
			MONSTER_EGG = getByName("monster_egg");
			STONE_BRICK = getByName("stonebrick");
			BROWN_MUSHROOM_BLOCK = getByName("brown_mushroom_block");
			RED_MUSHROOM_BLOCK = getByName("red_mushroom_block");
			IRON_BARS = getByName("iron_bars");
			GLASS_PANE = getByName("glass_pane");
			MELON_BLOCK = getByName("melon_block");
			PUMPKIN_STEM = getByName("pumpkin_stem");
			MELON_STEM = getByName("melon_stem");
			VINE = getByName("vine");
			FENCE_GATE = getByName("fence_gate");
			SPRUCE_FENCE_GATE = getByName("spruce_fence_gate");
			BIRCH_FENCE_GATE = getByName("birch_fence_gate");
			JUNGLE_FENCE_GATE = getByName("jungle_fence_gate");
			DARK_OAK_FENCE_GATE = getByName("dark_oak_fence_gate");
			ACACIA_FENCE_GATE = getByName("acacia_fence_gate");
			BRICK_STAIRS = getByName("brick_stairs");
			STONE_BRICK_STAIRS = getByName("stone_brick_stairs");
			MYCELIUM = (BlockMycel) getByName("mycelium");
			WATERLILY = getByName("waterlily");
			NETHER_BRICK = getByName("nether_brick");
			NETHER_BRICK_FENCE = getByName("nether_brick_fence");
			NETHER_BRICK_STAIRS = getByName("nether_brick_stairs");
			NETHER_WART = getByName("nether_wart");
			ENCHANTING_TABLE = getByName("enchanting_table");
			BRWEWING_STAND = getByName("brewing_stand");
			CAULDRON = (BlockCauldron) getByName("cauldron");
			END_PORTAL = getByName("end_portal");
			END_PORTAL_FRAME = getByName("end_portal_frame");
			END_STONE = getByName("end_stone");
			DRAGON_EGG = getByName("dragon_egg");
			REDSTONE_LAMP = getByName("redstone_lamp");
			LIT_REDSTONE_LAMP = getByName("lit_redstone_lamp");
			DOUBLE_WOODEN_SLAB = (BlockStepAbstract) getByName("double_wooden_slab");
			WOODEN_SLAB = (BlockStepAbstract) getByName("wooden_slab");
			COCOA = getByName("cocoa");
			SANDSTONE_STAIRS = getByName("sandstone_stairs");
			EMERALD_ORE = getByName("emerald_ore");
			ENDER_CHEST = getByName("ender_chest");
			TRIPWIRE_HOOK = (BlockTripwireHook) getByName("tripwire_hook");
			TRIPWIRE = getByName("tripwire");
			EMERALD_BLOCK = getByName("emerald_block");
			SPRUCE_STAIRS = getByName("spruce_stairs");
			BIRCH_STAIRS = getByName("birch_stairs");
			JUNGLE_STAIRS = getByName("jungle_stairs");
			COMMAND_BLOCK = getByName("command_block");
			BEACON = (BlockBeacon) getByName("beacon");
			COBBLESTONE_WALL = getByName("cobblestone_wall");
			FLOWER_POT = getByName("flower_pot");
			CARROTS = getByName("carrots");
			POTATOES = getByName("potatoes");
			WOODEN_BUTTON = getByName("wooden_button");
			SKULL = (BlockSkull) getByName("skull");
			ANVIL = getByName("anvil");
			TRAPPED_CHEST = getByName("trapped_chest");
			LIGHT_WEIGHTED_PRESSURE_PLATE = getByName("light_weighted_pressure_plate");
			HEAVY_WEIGHTED_PRESSURE_PLATE = getByName("heavy_weighted_pressure_plate");
			UNPOWERED_COMPARATOR = (BlockRedstoneComparator) getByName("unpowered_comparator");
			POWERED_COMPARATOR = (BlockRedstoneComparator) getByName("powered_comparator");
			DAYLIGHT_DETECTOR = (BlockRedstoneDetector) getByName("daylight_detector");
			DAYLIGHT_DETECTOR_INVERTED = (BlockRedstoneDetector) getByName("daylight_detector_inverted");
			REDSTONE_BLOCK = getByName("redstone_block");
			QUARTZ_ORE = getByName("quartz_ore");
			HOPPER = (BlockHopper) getByName("hopper");
			QUARTZ_BLOCK = getByName("quartz_block");
			QUARTZ_STAIRS = getByName("quartz_stairs");
			ACTIVATOR_RAIL = getByName("activator_rail");
			DROPPER = getByName("dropper");
			STAINED_HARDENED_CLAY = getByName("stained_hardened_clay");
			BARRIER = getByName("barrier");
			IRON_TRAPDOOR = getByName("iron_trapdoor");
			HAY_BLOCK = getByName("hay_block");
			CARPET = getByName("carpet");
			HARDENED_CLAY = getByName("hardened_clay");
			COAL_BLOCK = getByName("coal_block");
			PACKED_ICE = getByName("packed_ice");
			ACACIA_STAIRS = getByName("acacia_stairs");
			DARK_OAK_STAIRS = getByName("dark_oak_stairs");
			SLIME = getByName("slime");
			DOUBLE_PLANT = (BlockTallPlant) getByName("double_plant");
			STAINED_GLASS = (BlockStainedGlass) getByName("stained_glass");
			STAINED_GLASS_PANE = (BlockStainedGlassPane) getByName("stained_glass_pane");
			PRISMARINE = getByName("prismarine");
			SEA_LANTERN = getByName("sea_lantern");
			STANDING_BANNER = getByName("standing_banner");
			WALL_BANNER = getByName("wall_banner");
			RED_SANDSTONE = getByName("red_sandstone");
			RED_SANDSTONE_STAIRS = getByName("red_sandstone_stairs");
			DOUBLE_STONE_SLAB2 = (BlockStepAbstract) getByName("double_stone_slab2");
			STONE_SLAB2 = (BlockStepAbstract) getByName("stone_slab2");
			END_ROD = getByName("end_rod");
			CHORUS_PLANT = getByName("chorus_plant");
			CHORUS_FLOWER = getByName("chorus_flower");
			PURPUR_BLOCK = getByName("purpur_block");
			PURPUR_PILLAR = getByName("purpur_pillar");
			PURPUR_STAIRS = getByName("purpur_stairs");
			PURPUR_DOUBLE_SLAB = (BlockStepAbstract) getByName("purpur_double_slab");
			PURPUR_SLAB = (BlockStepAbstract) getByName("purpur_slab");
			END_BRICKS = getByName("end_bricks");
			BEETROOTS = getByName("beetroots");
			GRASS_PATH = getByName("grass_path");
			END_GATEWAY = getByName("end_gateway");
			REPEATING_COMMAND_BLOCK = getByName("repeating_command_block");
			CHAIN_COMMAND_BLOCK = getByName("chain_command_block");
			STRUCTURE_BLOCK = getByName("structure_block");
			BLOCK_REGISTRY.clear();
		}
	}
}
