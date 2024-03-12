package cdrenttest.cdrent.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@AllArgsConstructor
@Data
@Entity
public class Cd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int year;
    private String bandName;
    private String recordName;
    private String albumImgUri;

    @ManyToOne(fetch = FetchType.EAGER)
    private Set<Music> musics;
}