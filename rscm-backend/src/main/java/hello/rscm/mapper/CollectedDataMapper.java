package hello.rscm.mapper;

import hello.rscm.model.CollectedDataVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectedDataMapper {
    void insertCollectedData(CollectedDataVO collectedDataVO);
    List<CollectedDataVO> findAll();
}

