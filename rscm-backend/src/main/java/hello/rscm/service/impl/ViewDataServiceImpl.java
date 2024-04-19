package hello.rscm.service.impl;

import hello.rscm.mapper.ViewDataMapper;
import hello.rscm.model.ViewDataVO;
import hello.rscm.service.ViewDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ViewDataServiceImpl implements ViewDataService {

    private final ViewDataMapper viewDataMapper;

    @Override
    @Transactional
    public ViewDataVO saveViewData(ViewDataVO viewDataVO) {
        viewDataMapper.insertViewData(viewDataVO);
        return viewDataVO; // 여기서 추가 로직을 적용하여 ID로 조회할 수 있습니다.
    }

    @Override
    public List<ViewDataVO> getAllViewData() {
        return viewDataMapper.findAllViewData();
    }
}

