package net.aerik.grav_drones.item;

import net.aerik.grav_drones.GravDrones;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GRAVITIC_CRYSTAL = registerItem("gravitic_crystal", new Item(new Item.Settings()));
    public static final Item VACGUN = registerItem("vacgun", new Item(new Item.Settings()));

    private static Item registerItem(String id, Item item){
        Identifier itemID = Identifier.of(GravDrones.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void registerModItems(){
        GravDrones.LOGGER.info("Registering Mod Items for " + GravDrones.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GRAVITIC_CRYSTAL);
            entries.add(VACGUN);
        });
    }
}
