package flowo;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
 
public class shehears extends ListenerAdapter {
 
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if (e.getMessage().getRawContent().equalsIgnoreCase("hey flo!")) {
            e.getChannel().sendMessage( " hey! im flo").queue();
        }
        if (e.getMessage().getRawContent().equalsIgnoreCase("hey! im flo")) {
            e.getChannel().sendMessage( "im the bot that fuckhandsfelix made!").queue();
        }
        if (e.getMessage().getRawContent().equalsIgnoreCase("im the bot that fuckhandsfelix made!")) {
            e.getChannel().sendMessage( "wanna switch to progressive? ").queue();
           // e.getMessage().addReaction("<:bbboy:312401499655241740>").queue();
           
        }
        if (e.getMessage().getRawContent().equals("wanna switch to progressive?") ){
        	if (e.getMessage().getRawContent().equals("yes") ){
        		e.getChannel().sendMessage("fuck off").queue();
        	}
        	if (e.getMessage().getRawContent().equals("no") ){
        		e.getChannel().sendMessage("well thats too bad, maybe next time, bitch").queue();
        	}
        	}
       
        
    }
 
}