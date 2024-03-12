package cdrenttest.cdrent.controller;

import cdrenttest.cdrent.domain.Music;
import cdrenttest.cdrent.service.MusicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@AllArgsConstructor
public class MusicController {
    private MusicService musicService;

    @GetMapping("/{id}")
    public Music findMusicById(@PathVariable Long id) {
        return musicService.findMusicById(id);
    }

    @GetMapping("/find/{title}")
    public Music searchMusicByTitle(@PathVariable String title) {
        return musicService.findMusicByTitle(title);
    }

    @GetMapping("/find/album/{album}")
    public List<Music> findMusicByAlbum(@PathVariable String album) {
        return musicService.findMusicByAlbum(album);
    }
}
