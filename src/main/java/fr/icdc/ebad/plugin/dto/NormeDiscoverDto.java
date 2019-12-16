package fr.icdc.ebad.plugin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NormeDiscoverDto {
    private Long id;
    private String name;
    private String commandLine;
    private String pathShellDirectory;
    private String fileDate;
}
