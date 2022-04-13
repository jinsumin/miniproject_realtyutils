package org.hwaner.realtyutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hwaner
 */

// api 호출하는 restcontroller
@RestController
public class HealthCheckController {

    // 경로호출 매핑 -> 헬스체크 api는 어디서나 만듦(아주 기본)
    @GetMapping("/api/ping")
    public String ping() {
        return "ok";
    }
}
