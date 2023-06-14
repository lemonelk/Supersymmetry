def soldering_alloys = [
        liquid('tin') * 144,
        liquid('soldering_alloy') * 72
]

def name_removals = [
"computronics:iron_note_block0",
"computronics:audio_cable1",
"computronics:speaker5",
"computronics:tape_reader7",
"computronics:camera3",
"computronics:chat_box4",
"computronics:cipher8",
"computronics:cipher_advanced10",
"computronics:colorful_lamp2",
"computronics:parts21", //tape track
"computronics:tape12", //tapes
"computronics:tape13",
"computronics:tape14",
"computronics:tape15",
"computronics:tape16",
"computronics:tape17",
"computronics:tape18",
"computronics:tape19",
"computronics:tape20",
"computronics:portable_tape_drive11",
"computronics:oc_parts22",
"computronics:oc_parts23",
"computronics:oc_parts24",
"computronics:oc_parts25",
"computronics:oc_parts26",
"computronics:oc_parts27",
"computronics:oc_parts28",
"computronics:oc_parts29",
"computronics:oc_parts30",
"computronics:oc_parts31",
"computronics:oc_parts32",
"computronics:oc_parts33",
"computronics:oc_parts34",
"computronics:oc_parts35",
"computronics:speech_box6",
]

for (item in name_removals) {
    crafting.remove(item);
}



for (solder in soldering_alloys) {

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('plateRubber'))
			.inputs(ore('wireFineCopper') * 3)
            .outputs(item('computronics:audio_cable'))
			.circuitMeta([5])
            .duration(400)
            .EUt(30)
            .buildAndRegister();
			
	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('circuitMv'))
			.inputs(metaitem('hull.mv'))
			.inputs(item('minecraft:noteblock'))
            .outputs(item('computronics:audio_cable'))
            .duration(400)
            .EUt(120)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('circuitMv'))
			.inputs(metaitem('hull.mv'))
			.inputs(ore('wireFineRedAlloy') * 4)
            .outputs(item('computronics:tape_reader'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('circuitMv'))
			.inputs(metaitem('hull.mv'))
			.inputs(ore('lensGlass'))
            .outputs(item('computronics:camera'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('circuitHv'))
			.inputs(metaitem('hull.hv'))
			.inputs(ore('wireGtSingleGold') * 2)
			.inputs(ore('oc:ram3'))
            .outputs(item('computronics:chat_box'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('circuitHv'))
			.inputs(metaitem('hull.hv'))
			.inputs(ore('wireGtSingleGold') * 2)
			.inputs(item('opencomputers:card', 10))
			.inputs(ore('oc:ram3'))
            .outputs(item('computronics:cipher'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('circuitHv'))
			.inputs(metaitem('hull.hv'))
			.inputs(ore('wireGtSingleGold') * 2)
			.inputs(item('opencomputers:card', 11))
			.inputs(ore('oc:ram3'))
            .outputs(item('computronics:cipher_advanced'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('circuitHv'))
			.inputs(metaitem('hull.hv'))
			.inputs(ore('wireGtSingleGold') * 2)
			.inputs(item('opencomputers:motionsensor'))
			.inputs(ore('oc:ram3'))
            .outputs(item('computronics:radar'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('stickSteel') * 4)
			.inputs(ore('blockGlass') * 4)
			.inputs(item('gregtech:borderless_white_lamp') * 4)
            .outputs(item('computronics:colorful_lamp'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('foilPlastic') * 4)
			.inputs(ore('dustTinyMagneticIron'))
            .outputs(item('computronics:parts'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 4)
			.inputs(ore('gearSmallIron') * 2)
			.inputs(item('computronics:parts') * 4)
            .outputs(item('computronics:tape'))
			.circuitMeta([1])
            .duration(40)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 4)
			.inputs(ore('gearSmallIron') * 2)
			.inputs(item('computronics:parts') * 8)
            .outputs(item('computronics:tape', 1))
			.circuitMeta([2])
            .duration(80)
            .EUt(30)
            .buildAndRegister();
			
	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 8)
			.inputs(ore('gearSmallIron') * 2)
			.inputs(item('computronics:parts') * 16)
            .outputs(item('computronics:tape', 2))
			.circuitMeta([3])
            .duration(160)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 16)
			.inputs(ore('gearSmallIron') * 4)
			.inputs(item('computronics:parts') * 32)
            .outputs(item('computronics:tape', 3))
			.circuitMeta([4])
            .duration(320)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 16)
			.inputs(ore('gearSmallIron') * 4)
			.inputs(item('computronics:parts') * 64)
            .outputs(item('computronics:tape', 4))
			.circuitMeta([5])
            .duration(640)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 4)
			.inputs(ore('gearSmallIron') * 2)
			.inputs(item('computronics:parts') * 2)
            .outputs(item('computronics:tape', 5))
			.circuitMeta([6])
            .duration(20)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 4)
			.inputs(ore('gearSmallIron') * 2)
			.inputs(item('computronics:parts') * 6)
            .outputs(item('computronics:tape', 6))
			.circuitMeta([7])
            .duration(60)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 8)
			.inputs(ore('gearSmallIron') * 2)
			.inputs(item('computronics:parts') * 16)
            .outputs(item('computronics:tape', 7))
			.circuitMeta([8])
            .duration(160)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('platePlastic') * 32)
			.inputs(ore('gearSmallIron') * 6)
			.inputs(item('computronics:parts') * 64)
			.inputs(item('computronics:parts') * 64)
            .outputs(item('computronics:tape', 8))
			.circuitMeta([8])
            .duration(1280)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(metaitem('power_unit.mv'))
			.inputs(metaitem('plateAluminium') * 4)
			.inputs(ore('wireFineRedAlloy') * 4)
            .outputs(item('computronics:portable_tape_drive'))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('lensGlass'))
			.inputs(ore('wireGtSingleGold') * 4)
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([1])
            .outputs(item('computronics:oc_parts'))
            .duration(400)
            .EUt(120)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(ore('wireGtSingleGold') * 4)
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([10])
            .outputs(item('computronics:oc_parts', 1))
            .duration(400)
            .EUt(120)
            .buildAndRegister();

	mods.gregtech.assembler.recipeBuilder()
			.inputs(metaitem('sensor.hv'))
			.inputs(ore('wireGtDoubleAluminium') * 4)
			.inputs(metaitem('circuit_board.advanced'))
            .fluidInputs(solder)
			.circuitMeta([10])
            .outputs(item('computronics:oc_parts', 2))
            .duration(400)
            .EUt(120)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('wireGtSingleGold') * 4)
			.inputs(ore('oc:cpu1'))
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([15])
            .outputs(item('computronics:oc_parts', 3))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(item('opencomputers:card', 6))
			.inputs(ore('oc:cpu2'))
			.inputs(ore('oc:ram3'))
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([15])
            .outputs(item('computronics:oc_parts', 4))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('oc:cpu2'))
			.inputs(item('minecraft:noteblock'))
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([16])
            .outputs(item('computronics:oc_parts', 5))
            .duration(400)
            .EUt(30)
            .buildAndRegister();
			
	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('oc:cpu1'))
			.inputs(metaitem('circuit_board.good'))
            .fluidInputs(solder)
			.circuitMeta([20])
            .outputs(item('computronics:oc_parts', 6))
            .duration(400)
            .EUt(30)
            .buildAndRegister();
			
	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('oc:cpu2'))
			.inputs(item('gregtech:borderless_white_lamp') * 4)
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([1])
            .outputs(item('computronics:oc_parts', 7))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('oc:cpu2'))
			.inputs(item('minecraft:noteblock') * 4)
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([17])
            .outputs(item('computronics:oc_parts', 8))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('oc:cpu2'))
			.inputs(item('minecraft:noteblock') * 8)
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([18])
            .outputs(item('computronics:oc_parts', 9))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('oc:cpu1'))
			.inputs(item('gregtech:borderless_white_lamp') * 4)
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([1])
            .outputs(item('computronics:oc_parts', 10))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('oc:cpu1'))
			.inputs(item('computronics:oc_parts', 6))
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([1])
            .outputs(item('computronics:oc_parts', 11))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('batteryMv'))
			.inputs(ore('wireGtDoubleCopper'))
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([1])
            .outputs(item('computronics:oc_parts', 12))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('batteryMv'))
			.inputs(item('opencomputers:material', 14))
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([1])
            .outputs(item('computronics:oc_parts', 13))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

	mods.gregtech.circuit_assembler.recipeBuilder()
			.inputs(ore('batteryMv'))
			.inputs(item('opencomputers:material', 14))
			.inputs(metaitem('circuit_board.plastic'))
            .fluidInputs(solder)
			.circuitMeta([1])
            .outputs(item('computronics:oc_parts', 13))
            .duration(400)
            .EUt(30)
            .buildAndRegister();

}




crafting.addShaped('computronics:iron_note_block0', item('computronics:iron_note_block'), [
    [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')],
    [ore('plateSteel'), item('minecraft:noteblock'), ore('plateSteel')],
    [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')]])