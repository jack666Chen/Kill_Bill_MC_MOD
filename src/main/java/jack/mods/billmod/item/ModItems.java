package jack.mods.billmod.item;

import jack.mods.billmod.Kill_Bill;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BILL_SHIT =
            registerItems("bill_shit", new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        entries.add(BILL_SHIT);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(Kill_Bill.MOD_ID, name), item);
    }

    public static void registerModItems() {
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToItemGroup);
    }
}
