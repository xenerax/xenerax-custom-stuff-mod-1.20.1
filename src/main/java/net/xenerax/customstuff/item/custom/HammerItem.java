package net.xenerax.customstuff.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.enchantment.SilkTouchEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ModifiableWorld;
import net.minecraft.world.World;
import net.xenerax.customstuff.item.ModToolMaterial;
import net.xenerax.customstuff.util.ModTags;

public class HammerItem extends PickaxeItem {

    public HammerItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient && state.getHardness(world, pos) != 0.0f) {
            stack.damage(1, miner, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        miningPos(miner, pos, world);
        }
        return true;
    }


    public void miningPos(LivingEntity miner, BlockPos pos, World world) {
        Direction facingDirection = Direction.getEntityFacingOrder(miner)[0];
        int[][] offsets = new int[8][3];

        switch(facingDirection) {
            case NORTH, SOUTH:
                offsets = new int[][]{  {-1,1,0},   {0,1,0},   {1,1,0},
                                        {-1,0,0},              {1,0,0},
                                        {-1,-1,0},  {0,-1,0},  {1,-1,0}};
                break;
            case EAST, WEST:
                offsets = new int[][]{  {0,1,-1},   {0,1,0},   {0,1,1},
                                        {0,0,-1},              {0,0,1},
                                        {0,-1,-1},  {0,-1,0},  {0,-1,1}};
                break;
            case UP, DOWN:
                offsets = new int[][]{  {1,0,-1},    {1,0,0},   {1,0,1},
                                        {0,0,-1},               {0,0,1},
                                        {-1,0,-1},   {-1,0,0},  {-1,0,1}};
                break;
        }

        for (int[] offset : offsets) {
            BlockPos targetPos = pos.add(offset[0], offset[1], offset[2]);
            BlockState targetState = world.getBlockState(targetPos);

            if (targetState.isIn(BlockTags.PICKAXE_MINEABLE) && this.isSuitableFor(targetState)) {
                world.breakBlock(targetPos, true);
            }
        }
    }
}
//if(EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, tool) == 0)