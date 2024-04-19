package hello.rscm.service;

import hello.rscm.model.CollectedDataVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CollectedDataService {
    List<CollectedDataVO> saveAll(List<CollectedDataVO> collectedDataList);
    List<CollectedDataVO> findAll();

}

