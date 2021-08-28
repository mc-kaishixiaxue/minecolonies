package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.tileentities.TileEntityEnchanter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.BlockGetter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BlockHutEnchanter extends AbstractBlockHut<BlockHutEnchanter>
{
    @NotNull
    @Override
    public String getHutName()
    {
        return "blockhutenchanter";
    }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.enchanter;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull final BlockPos blockPos, @NotNull final BlockState blockState)
    {
        final TileEntityEnchanter building = new TileEntityEnchanter(blockPos, blockState);
        building.registryName = this.getBuildingEntry().getRegistryName();
        return building;
    }
}
