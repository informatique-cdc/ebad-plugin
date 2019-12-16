package fr.icdc.ebad.plugin.plugin;

import fr.icdc.ebad.plugin.dto.ApplicationDiscoverDto;
import fr.icdc.ebad.plugin.dto.EnvironnementDiscoverDto;
import fr.icdc.ebad.plugin.dto.NormeDiscoverDto;
import org.pf4j.ExtensionPoint;
import org.pf4j.PluginException;

import java.util.List;

public interface ApplicationConnectorPlugin extends ExtensionPoint {
    public List<ApplicationDiscoverDto> discoverApp() throws PluginException;
}
