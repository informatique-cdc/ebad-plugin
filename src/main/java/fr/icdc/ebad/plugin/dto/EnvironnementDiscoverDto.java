package fr.icdc.ebad.plugin.dto;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class EnvironnementDiscoverDto {
    private String name;
    private String code;
    private Long id;
    private String host;
    private String login;
    private String home;
    private String prefix;
    private OsKind kindOs;

    public enum OsKind {UNIX,WINDOWS,OTHER}
}
