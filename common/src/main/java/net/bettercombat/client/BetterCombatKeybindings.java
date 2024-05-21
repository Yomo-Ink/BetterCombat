package net.bettercombat.client;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class BetterCombatKeybindings {
    public static KeyBinding feintKeyBinding;
    public static KeyBinding toggleMineKeyBinding;
    public static KeyBinding slashKeyBinding;
    public static KeyBinding slamKeyBinding;
    public static KeyBinding stabKeyBinding;
    public static List<KeyBinding> all;

    static {
        feintKeyBinding = new KeyBinding(
                "keybinds.bettercombat.feint",
                InputUtil.Type.KEYSYM,
                InputUtil.GLFW_KEY_R,
                "Better Combat");

        toggleMineKeyBinding = new KeyBinding(
                "keybinds.bettercombat.toggle_mine_with_weapons",
                InputUtil.Type.KEYSYM,
                InputUtil.UNKNOWN_KEY.getCode(),
                "Better Combat");

        slashKeyBinding = new KeyBinding(
                "keybinds.bettercombat.slash",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_MOUSE_BUTTON_1,
                "Better Combat");

        slamKeyBinding = new KeyBinding(
                "keybinds.bettercombat.slam",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_MOUSE_BUTTON_2,
                "Better Combat");

        stabKeyBinding = new KeyBinding(
                "keybinds.bettercombat.stab",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_MOUSE_BUTTON_3,
                "Better Combat");

        all = List.of(feintKeyBinding, toggleMineKeyBinding);
    }
}
