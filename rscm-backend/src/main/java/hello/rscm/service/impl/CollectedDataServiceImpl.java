package hello.rscm.service.impl;

import hello.rscm.mapper.CollectedDataMapper;
import hello.rscm.model.CollectedDataVO;
import hello.rscm.service.CollectedDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectedDataServiceImpl implements CollectedDataService {

    private final CollectedDataMapper collectedDataMapper;

    @Transactional
    @Override
    public List<CollectedDataVO> saveAll(List<CollectedDataVO> collectedDataList) {
        for (CollectedDataVO collectedData : collectedDataList) {
            collectedDataMapper.insertCollectedData(collectedData);
        }
        return collectedDataList; // 데이터베이스에 저장 후, 저장된 객체 리스트를 반환
    }

    @Override
    public List<CollectedDataVO> findAll() {
        return collectedDataMapper.findAll();
    }
}


