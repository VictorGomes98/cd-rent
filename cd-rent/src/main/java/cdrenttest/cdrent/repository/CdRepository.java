package cdrenttest.cdrent.repository;

import cdrenttest.cdrent.domain.Cd;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CdRepository extends JpaRepository<Cd, Long> {
    public Optional<Cd> findCdByTitle(String title);
}