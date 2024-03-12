package cdrenttest.cdrent.service;

import cdrenttest.cdrent.domain.Music;
import cdrenttest.cdrent.exceptions.cdexception.BadRequestException;
import cdrenttest.cdrent.repository.MusicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MusicService {
    private MusicRepository musicRepository;

    public Music findMusicById(Long id) {
        return musicRepository.findMusicById(id)
                .orElseThrow(
                        () -> new BadRequestException("Music can't be found")
                );
    }

    public Music findMusicByTitle(String title) {
        return musicRepository.findMusicByTitle(title)
                .orElseThrow(
                        () -> new BadRequestException("Music can't be found")
                );
    }

    public List<Music> findMusicByAlbum(String album) {
        return musicRepository.findMusicByAlbum(album)
                .orElseThrow(
                        () -> new BadRequestException("Band not found")
                );
    }
}
