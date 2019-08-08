package fr.icdc.ebad.plugin.plugin;

import fr.icdc.ebad.plugin.dto.EnvironnementDiscoverDto;
import org.pf4j.ExtensionPoint;

import java.util.List;

public interface EnvironnementConnectorPlugin extends ExtensionPoint {
    public List<EnvironnementDiscoverDto> discoverFromApp(String app);
}
