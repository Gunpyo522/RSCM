package hello.rscm.dao;

import hello.rscm.model.CollectedDataVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CollectedDataDao {
    List<CollectedDataVO> findAll();
}


