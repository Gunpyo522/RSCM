package hello.rscm.mapper;

import hello.rscm.model.ViewDataVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ViewDataMapper {
    void insertViewData(ViewDataVO viewDataVO);
    List<ViewDataVO> findAllViewData();
    // 추가적으로 필요한 메서드 정의 가능
}
