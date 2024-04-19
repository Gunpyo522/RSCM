package hello.rscm.controller;

import hello.rscm.model.CollectedDataVO;
import hello.rscm.service.CollectedDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CollectedDataController {

    private final CollectedDataService collectedDataService;

    @GetMapping("/collected-data")
    public List<CollectedDataVO> getAllCollectedData() {
        return collectedDataService.findAll();
    }

    @PostMapping("/collected-data")
    public ResponseEntity<List<CollectedDataVO>> saveCollectedData(@RequestBody List<CollectedDataVO> collectedDataList) {
        return new ResponseEntity<>(collectedDataService.saveAll(collectedDataList), HttpStatus.CREATED);
    }
}

