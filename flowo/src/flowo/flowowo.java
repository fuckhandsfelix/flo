package flowo;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class flowowo {
	public static JDA jda;
	public static final String BOT_TOKEN = "Mjg3NDAyMTY2Nzg2OTgxODg4.C_ZqLQ.njcWG-5ovXJ_TuOlpJp5g2gr46A"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			jda=new JDABuilder(AccountType.BOT).addEventListener(new shehears()).setToken(BOT_TOKEN).buildBlocking();
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
