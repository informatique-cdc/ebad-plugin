package fr.icdc.ebad.plugin.plugin;

import fr.icdc.ebad.plugin.dto.ApplicationDiscoverDto;
import org.pf4j.ExtensionPoint;
import org.pf4j.PluginRuntimeException;

import java.util.List;

public interface ApplicationConnectorPlugin extends ExtensionPoint {
    public List<ApplicationDiscoverDto> discoverApp();
}
