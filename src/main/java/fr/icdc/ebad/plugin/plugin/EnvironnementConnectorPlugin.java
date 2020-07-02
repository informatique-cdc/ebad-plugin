package fr.icdc.ebad.plugin.plugin;

import fr.icdc.ebad.plugin.dto.EnvironnementDiscoverDto;
import fr.icdc.ebad.plugin.dto.NormeDiscoverDto;
import org.pf4j.ExtensionPoint;
import org.pf4j.PluginRuntimeException;

import java.util.List;

public interface EnvironnementConnectorPlugin extends ExtensionPoint {
    public List<EnvironnementDiscoverDto> discoverFromApp(String app, String appName, List<NormeDiscoverDto> norms);
}
