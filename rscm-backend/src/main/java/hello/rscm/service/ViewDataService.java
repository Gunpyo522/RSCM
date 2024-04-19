package hello.rscm.service;

import hello.rscm.model.ViewDataVO;
import java.util.List;

public interface ViewDataService {
    ViewDataVO saveViewData(ViewDataVO viewDataVO);
    List<ViewDataVO> getAllViewData();
}

