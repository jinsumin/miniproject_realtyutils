package org.hwaner.realtyutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* api를 통해서 부동산중개수수료가 얼마라고 물어봤을때, 응답을 주는 기능 구현 */
/* 1. healthcheck: 서버 배포 후에 잘 실행이 되는지 헬스 체크를 하는데, 특정 api콜 (200을 받는지) */

@SpringBootApplication
public class RealtyUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealtyUtilsApplication.class, args);
    }

}
