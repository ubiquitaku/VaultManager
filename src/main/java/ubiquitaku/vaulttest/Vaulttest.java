package ubiquitaku.vaulttest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vaulttest extends JavaPlugin {
    VaultManager vault = new VaultManager();

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("test")) {
            if (args.length == 0) {
                vault.deposit((Player) sender,1000000);
                sender.sendMessage("ageru");
            } else {
                vault.withdraw((Player) sender,10);
                sender.sendMessage("morau");
            }
            return true;
        }
        return true;
    }
}
