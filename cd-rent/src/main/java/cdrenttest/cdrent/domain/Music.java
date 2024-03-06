package cdrenttest.cdrent.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Music {
    private String title;
    private int duration;
    private String composer;
    private Cd album;
    private int year;
}
