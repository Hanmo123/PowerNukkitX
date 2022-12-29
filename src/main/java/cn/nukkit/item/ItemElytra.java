package cn.nukkit.item;

import cn.nukkit.api.PowerNukkitXOnly;
import cn.nukkit.api.Since;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public class ItemElytra extends ItemArmor {

    public ItemElytra() {
        this(0, 1);
    }

    public ItemElytra(Integer meta) {
        this(meta, 1);
    }

    public ItemElytra(Integer meta, int count) {
        super(ELYTRA, meta, count, "Elytra");
    }

    @Override
    public int getMaxDurability() {
        return 433;
    }

    @Override
    public boolean isArmor() {
        return false;
    }

    @Override
    public boolean isChestplate() {
        return true;
    }

    @PowerNukkitXOnly
    @Since("1.19.50-r4")
    public boolean canUse() {
        // 最大耐久为 433 但在 432、431 时即显示破损材质 即无法使用
        return this.getMaxDurability() - this.getDamage() > 2;
    }
}
