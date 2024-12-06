package me.mchiappinam.pdghemotion;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import br.com.devpaulo.legendchat.api.events.ChatMessageEvent;

public class Listeners implements Listener {
	
	//private Main plugin;
	public Listeners(Main main) {
		//plugin=main;
	}

	//AdicionarParaPlacas
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void emotion(ChatMessageEvent e) {
		if((e.getMessage().contains("(1)"))||
			(e.getMessage().contains("(2)"))||
			(e.getMessage().contains("(3)"))||
			(e.getMessage().contains("(4)"))||
			(e.getMessage().contains("(5)"))||
			(e.getMessage().contains("(6)"))||
			(e.getMessage().contains("(7)"))||
			(e.getMessage().contains("(8)"))||
			(e.getMessage().contains("(9)"))||
			(e.getMessage().contains("(10)"))||
			(e.getMessage().toLowerCase().contains("(a)"))||
			(e.getMessage().toLowerCase().contains("(b)"))||
			(e.getMessage().toLowerCase().contains("(c)"))||
			(e.getMessage().toLowerCase().contains("(ç)"))||
			(e.getMessage().toLowerCase().contains("(d)"))||
			(e.getMessage().toLowerCase().contains("(e)"))||
			(e.getMessage().toLowerCase().contains("(f)"))||
			(e.getMessage().toLowerCase().contains("(g)"))||
			(e.getMessage().toLowerCase().contains("(h)"))||
			(e.getMessage().toLowerCase().contains("(i)"))||
			(e.getMessage().toLowerCase().contains("(j)"))||
			(e.getMessage().toLowerCase().contains("(k)"))||
			(e.getMessage().toLowerCase().contains("(l)"))||
			(e.getMessage().toLowerCase().contains("(m)"))||
			(e.getMessage().toLowerCase().contains("(n)"))||
			(e.getMessage().toLowerCase().contains("(o)"))||
			(e.getMessage().toLowerCase().contains("(p)"))||
			(e.getMessage().toLowerCase().contains("(q)"))||
			(e.getMessage().toLowerCase().contains("(r)"))||
			(e.getMessage().toLowerCase().contains("(s)"))||
			(e.getMessage().toLowerCase().contains("(t)"))||
			(e.getMessage().toLowerCase().contains("(u)"))||
			(e.getMessage().toLowerCase().contains("(v)"))||
			(e.getMessage().toLowerCase().contains("(w)"))||
			(e.getMessage().toLowerCase().contains("(x)"))||
			(e.getMessage().toLowerCase().contains("(y)"))||
			(e.getMessage().toLowerCase().contains("(z)"))||
			/**(e.getMessage().contains("(A)"))||
			(e.getMessage().contains("(B)"))||
			(e.getMessage().contains("(C)"))||
			(e.getMessage().contains("(Ç)"))||
			(e.getMessage().contains("(D)"))||
			(e.getMessage().contains("(E)"))||
			(e.getMessage().contains("(F)"))||
			(e.getMessage().contains("(G)"))||
			(e.getMessage().contains("(H)"))||
			(e.getMessage().contains("(I)"))||
			(e.getMessage().contains("(J)"))||
			(e.getMessage().contains("(K)"))||
			(e.getMessage().contains("(L)"))||
			(e.getMessage().contains("(M)"))||
			(e.getMessage().contains("(N)"))||
			(e.getMessage().contains("(O)"))||
			(e.getMessage().contains("(P)"))||
			(e.getMessage().contains("(Q)"))||
			(e.getMessage().contains("(R)"))||
			(e.getMessage().contains("(S)"))||
			(e.getMessage().contains("(T)"))||
			(e.getMessage().contains("(U)"))||
			(e.getMessage().contains("(V)"))||
			(e.getMessage().contains("(W)"))||
			(e.getMessage().contains("(X)"))||
			(e.getMessage().contains("(Y)"))||
			(e.getMessage().contains("(Z)"))||*/
			(e.getMessage().contains("=)"))||
			(e.getMessage().contains(":)"))||
			(e.getMessage().contains(";)"))||
			(e.getMessage().contains("=("))||
			(e.getMessage().contains(":("))||
			(e.getMessage().contains(";("))||
			(e.getMessage().toLowerCase().contains("(o/)"))||
			(e.getMessage().contains("(0/)"))||
			(e.getMessage().toLowerCase().contains("o.o"))||
			(e.getMessage().contains("0.0"))||
			(e.getMessage().toLowerCase().contains("0.o"))||
			(e.getMessage().toLowerCase().contains("o.0"))||
			(e.getMessage().toLowerCase().contains("(vv)"))||
			(e.getMessage().toLowerCase().contains("(xx)"))||
			(e.getMessage().contains(">>"))||
			(e.getMessage().contains("<<"))||
			(e.getMessage().contains("^^"))||
			(e.getMessage().contains("<3"))||
			(e.getMessage().toLowerCase().contains("s2"))||
			(e.getMessage().contains("(("))||
			(e.getMessage().contains("))"))||
			(e.getMessage().contains("(*)"))) {
			e.setMessage(e.getMessage().replace("(1)", "➊"));
			e.setMessage(e.getMessage().replace("(2)", "➋"));
			e.setMessage(e.getMessage().replace("(3)", "➌"));
			e.setMessage(e.getMessage().replace("(4)", "➍"));
			e.setMessage(e.getMessage().replace("(5)", "➎"));
			e.setMessage(e.getMessage().replace("(6)", "➏"));
			e.setMessage(e.getMessage().replace("(7)", "➐"));
			e.setMessage(e.getMessage().replace("(8)", "➑"));
			e.setMessage(e.getMessage().replace("(9)", "➒"));
			e.setMessage(e.getMessage().replace("(10)", "➓"));
			e.setMessage(e.getMessage().toLowerCase().replace("(a)", "ⓐ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(b)", "ⓑ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(c)", "ⓒ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(ç)", "ⓒ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(d)", "ⓓ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(e)", "ⓔ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(f)", "ⓕ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(g)", "ⓖ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(h)", "ⓗ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(i)", "ⓘ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(j)", "ⓙ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(k)", "ⓚ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(l)", "ⓛ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(m)", "ⓜ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(n)", "ⓝ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(o)", "ⓞ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(p)", "ⓟ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(q)", "ⓠ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(r)", "ⓡ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(s)", "ⓢ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(t)", "ⓣ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(u)", "ⓤ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(v)", "ⓥ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(w)", "ⓦ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(x)", "ⓧ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(y)", "ⓨ"));
			e.setMessage(e.getMessage().toLowerCase().replace("(z)", "ⓩ"));
			/**e.setMessage(e.getMessage().replace("(A)", "Ⓐ"));
			e.setMessage(e.getMessage().replace("(B)", "Ⓑ"));
			e.setMessage(e.getMessage().replace("(C)", "Ⓒ"));
			e.setMessage(e.getMessage().replace("(Ç)", "Ⓒ"));
			e.setMessage(e.getMessage().replace("(D)", "Ⓓ"));
			e.setMessage(e.getMessage().replace("(E)", "Ⓔ"));
			e.setMessage(e.getMessage().replace("(F)", "Ⓕ"));
			e.setMessage(e.getMessage().replace("(G)", "Ⓖ"));
			e.setMessage(e.getMessage().replace("(H)", "Ⓗ"));
			e.setMessage(e.getMessage().replace("(I)", "Ⓘ"));
			e.setMessage(e.getMessage().replace("(J)", "Ⓙ"));
			e.setMessage(e.getMessage().replace("(K)", "Ⓚ"));
			e.setMessage(e.getMessage().replace("(L)", "Ⓛ"));
			e.setMessage(e.getMessage().replace("(M)", "Ⓜ"));
			e.setMessage(e.getMessage().replace("(N)", "Ⓝ"));
			e.setMessage(e.getMessage().replace("(O)", "Ⓞ"));
			e.setMessage(e.getMessage().replace("(P)", "Ⓟ"));
			e.setMessage(e.getMessage().replace("(Q)", "Ⓠ"));
			e.setMessage(e.getMessage().replace("(R)", "Ⓡ"));
			e.setMessage(e.getMessage().replace("(S)", "Ⓢ"));
			e.setMessage(e.getMessage().replace("(T)", "Ⓣ"));
			e.setMessage(e.getMessage().replace("(U)", "Ⓤ"));
			e.setMessage(e.getMessage().replace("(V)", "Ⓥ"));
			e.setMessage(e.getMessage().replace("(W)", "Ⓦ"));
			e.setMessage(e.getMessage().replace("(X)", "Ⓧ"));
			e.setMessage(e.getMessage().replace("(Y)", "Ⓨ"));
			e.setMessage(e.getMessage().replace("(Z)", "Ⓩ"));*/
			e.setMessage(e.getMessage().replace("=)", "☺"));
			e.setMessage(e.getMessage().replace(":)", "⊙‿⊙"));
			e.setMessage(e.getMessage().replace(";)", "≻‿⊙"));
			e.setMessage(e.getMessage().replace("=(", "☹"));
			e.setMessage(e.getMessage().replace(":(", "⊙︵⊙"));
			e.setMessage(e.getMessage().replace(";(", "≻︵⊙"));
			e.setMessage(e.getMessage().toLowerCase().replace("(o/)", "¯╲_(ツ)_╱¯"));
			e.setMessage(e.getMessage().replace("(0/)", "¯╲_(ツ)_╱¯"));
			e.setMessage(e.getMessage().toLowerCase().replace("o.o", "●.•"));
			e.setMessage(e.getMessage().replace("0.0", "●.•"));
			e.setMessage(e.getMessage().toLowerCase().replace("0.o", "●.•"));
			e.setMessage(e.getMessage().toLowerCase().replace("o.0", "●.•"));
			e.setMessage(e.getMessage().toLowerCase().replace("(vv)", "✔"));
			e.setMessage(e.getMessage().toLowerCase().replace("(xx)", "✕"));
			e.setMessage(e.getMessage().replace(">>", "»"));
			e.setMessage(e.getMessage().replace("<<", "«"));
			e.setMessage(e.getMessage().replace("^^", "⌃‿⌃"));
			e.setMessage(e.getMessage().replace("<3", "❤"));
			e.setMessage(e.getMessage().toLowerCase().replace("s2", "❤"));
			e.setMessage(e.getMessage().replace("((", "﴾"));
			e.setMessage(e.getMessage().replace("))", "﴿"));
			e.setMessage(e.getMessage().replace("(*)", "✯"));
		}
	}
}