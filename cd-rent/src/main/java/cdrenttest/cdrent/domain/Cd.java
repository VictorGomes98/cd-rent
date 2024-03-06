package cdrenttest.cdrent.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@AllArgsConstructor
@Data
public class Cd {
    private String title;
    private int year;
    private String bandName;
    private String recordName;
    private Set<Music> musics;
    private String albumImgUri;
}