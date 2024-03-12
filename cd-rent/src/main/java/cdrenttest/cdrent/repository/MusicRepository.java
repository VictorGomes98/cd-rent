package cdrenttest.cdrent.repository;

import cdrenttest.cdrent.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MusicRepository extends JpaRepository<Music, Long> {
    public Optional<Music> findMusicById(Long id);

    public Optional<Music> findMusicByTitle(String title);

    public Optional<List<Music>> findMusicByAlbum(String album);
}