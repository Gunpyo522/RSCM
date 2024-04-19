package hello.rscm.controller;

import hello.rscm.model.ViewDataVO;
import hello.rscm.service.ViewDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ViewDataController {

    private final ViewDataService viewDataService;

    // 클라이언트로부터 ViewDataVO 객체를 받아 저장
    @PostMapping("/view-data")
    public ResponseEntity<ViewDataVO> createViewData(@RequestBody ViewDataVO viewDataVO) {
        ViewDataVO savedViewData = viewDataService.saveViewData(viewDataVO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedViewData);
    }

    @GetMapping("/view-data")
    public ResponseEntity<List<ViewDataVO>> getAllViewData() {
        return ResponseEntity.ok(viewDataService.getAllViewData());
    }
}

