package cdrenttest.cdrent.service;

import cdrenttest.cdrent.domain.Cd;
import cdrenttest.cdrent.exceptions.cdexception.BadRequestException;
import cdrenttest.cdrent.repository.CdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CdService {
    private final CdRepository cdRepository;

    public Cd findCdByTitle(String title) {
        return cdRepository.findCdByTitle(title)
                .orElseThrow(
                        () -> new BadRequestException("CD can't be found")
                );
    }

    public List<Cd> searchByTitle(String title) {
        return cdRepository.searchCdByTitle(title)
                .orElseThrow(() -> new BadRequestException("None CD's with " + title + " found"));
    }
}