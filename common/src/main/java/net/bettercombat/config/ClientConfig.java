package net.bettercombat.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "client")
public class ClientConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip
    public boolean isHoldToAttackEnabled = false;
    @ConfigEntry.Gui.Tooltip
    public boolean isMiningWithWeaponsEnabled = false;
    @ConfigEntry.Gui.Tooltip
    public boolean isSwingThruGrassEnabled = true;
    @ConfigEntry.Gui.Tooltip
    public boolean isAttackInsteadOfMineWhenEnemiesCloseEnabled = true;
    @ConfigEntry.Gui.Tooltip
    public boolean isHighlightCrosshairEnabled = false;
    @ConfigEntry.ColorPicker
    @ConfigEntry.Gui.Tooltip
    public int hudHighlightColor = 0xFF0000;
    @ConfigEntry.Gui.Tooltip
    public boolean isShowingArmsInFirstPerson = true;
    @ConfigEntry.Gui.Tooltip
    public boolean isShowingOtherHandFirstPerson = true;
    @ConfigEntry.Gui.Tooltip
    public boolean isSweepingParticleEnabled = true;
    @ConfigEntry.Gui.Tooltip
    public boolean isTooltipAttackRangeEnabled = true;
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int weaponSwingSoundVolume = 100;
    @ConfigEntry.Gui.Tooltip
    public boolean isDebugOBBEnabled = true;
    @ConfigEntry.Gui.Tooltip
    public String swingThruGrassBlacklist = "farmersdelight";
    @ConfigEntry.Gui.Tooltip
    public String mineWithWeaponBlacklist = "";
}
