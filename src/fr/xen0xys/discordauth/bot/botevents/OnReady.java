package fr.xen0xys.discordauth.bot.botevents;

import fr.xen0xys.discordauth.bot.BotUtils;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class OnReady extends ListenerAdapter {
    @Override
    public void onReady(@NotNull ReadyEvent event) {
        super.onReady(event);
        // Send server start message
        BotUtils.sendMessage(BotUtils.getServerStartMessage());
        // Send MP to players to register their accounts
        // sendRegisterAccountMessages();
    }

    private void sendRegisterAccountMessages(){
        List<User> users = BotUtils.getUserWhoReact();
        BotUtils.initializeNoInitializedUsers(users);
    }
}
