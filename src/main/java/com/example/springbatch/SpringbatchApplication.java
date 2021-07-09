package com.example.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 위 사진과 같이 스프링 배치의 기능을 활성화하기 위해서 설정과 관련된 어노테이션(@EnableBatchProcessing)을 사용해줍니다.
 * */
@EnableScheduling //스케줄러 기능 활성화
@EnableBatchProcessing
@SpringBootApplication
public class SpringbatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbatchApplication.class, args);
    }

}
