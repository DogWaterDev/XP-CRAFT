package me.duesslo;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import org.bukkit.util.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

public class Checkpoint extends Location {
    private World world;
    private Material material;
    private double x;
    private double y;
    private double z;
    public boolean isEnabled = false;

    public Checkpoint(World world, Material material, double x, double y, double z) {
        super(world, x, y, z);
        this.world = world;
        this.material = material;
        this.x = x;
        this.y = y;
        this.z = z;
        if (!isEnabled) {
            world.setType(new Location(world, x, y, z), Material.AIR);
        }
    }
    public Checkpoint get() {
        return this;
    }
    public void update() {
        if (isEnabled) {
            world.setType(new Location(world, x, y, z), material);
        }
    }
}