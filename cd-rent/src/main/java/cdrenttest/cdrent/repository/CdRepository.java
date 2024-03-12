package cdrenttest.cdrent.repository;

import cdrenttest.cdrent.domain.Cd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CdRepository extends JpaRepository<Cd, Long> {
    public Optional<Cd> findCdByTitle(String title);

    @Query("""
            SELECT TOP 30 c FROM CDRENT c WHERE c.TITLE LIKE '% :title %'
            """)
    public Optional<List<Cd>> searchCdByTitle(String title);

    @Query("""
            SELECT c FROM CDRENT c WHERE c.BANDNAME = :bandName
            """)
    public Optional<List<Cd>> findCdByBandName(String bandName);
}