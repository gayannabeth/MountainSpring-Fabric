package gay.mountainspring.client.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class MSModMenu implements ModMenuApi {
	public MSModMenu() {}
	
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return screen -> null;
	}
}