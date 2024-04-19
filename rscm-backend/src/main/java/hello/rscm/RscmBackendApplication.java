package hello.rscm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("hello.rscm.mapper")
public class RscmBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RscmBackendApplication.class, args);
	}

}
//용태 오빠