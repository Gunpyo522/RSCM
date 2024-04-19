package hello.rscm.serviceTests;

import hello.rscm.model.CollectedDataVO;
import hello.rscm.service.CollectedDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest
@Slf4j
public class CollectedDataServiceTest {

    @Autowired
    private  CollectedDataService collectedDataService;
        @Test
        public void softWareYunkiiiitTest(){
            List<CollectedDataVO> collectedDataList = collectedDataService.findAll();
            log.info("선혁아 해줘");

        }




}
