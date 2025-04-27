package jack.mods.billmod.item;

import jack.mods.billmod.Kill_Bill;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup KILL_BILL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Kill_Bill.MOD_ID, "kill_bill_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.kill_bill_group"))
                    .icon(() -> new ItemStack(ModItems.BILL_SHIT)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.BILL_SHIT);
                    })).build());

    public static void registerModItemGroup() {

    }
}
