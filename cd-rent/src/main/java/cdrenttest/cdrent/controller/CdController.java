package cdrenttest.cdrent.controller;

import cdrenttest.cdrent.domain.Cd;
import cdrenttest.cdrent.service.CdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cd")
@RequiredArgsConstructor
public class CdController {
    private final CdService cdService;

    @GetMapping("/{title}")
    public ResponseEntity<Cd> findCdByName(@PathVariable String title) {
        return ResponseEntity.ok(cdService.findCdByTitle(title));
    }

    @GetMapping("/find/{title}")
    public ResponseEntity<List<Cd>> searchByTitle(@PathVariable String title) {
        return ResponseEntity.ok(cdService.searchByTitle(title));
    }

    @GetMapping("find/band/{band}")
    public ResponseEntity<List<Cd>> findCdByBand(@PathVariable String bandName) {
        return ResponseEntity.ok(cdService.findCdByBand(bandName));
    }
}
