package com.example.webframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class WebFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFrameworkApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> welcome(
            @RequestHeader HttpHeaders headers,
            @RequestParam Map<String, String> queryParameters) {

        String requestId = headers.getFirst("x-fc-request-id");
        System.out.printf("FC Invoke Start RequestId: %s%n", requestId);

        String currentTime = LocalDateTime.now(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String clientIp = headers.getFirst("x-forwarded-for");
        if (clientIp == null) {
            clientIp = "Unknown";
        }

        Map<String, Object> responseData = new HashMap<>();
        responseData.put("msg", "Hello, World! at " + currentTime);

        Map<String, Object> requestInfo = new HashMap<>();
        requestInfo.put("query", queryParameters.toString());
        requestInfo.put("path", "/");
        requestInfo.put("clientIp", clientIp);

        responseData.put("request", requestInfo);

        System.out.printf("FC Invoke End RequestId: %s%n", requestId);

        return ResponseEntity.status(HttpStatus.OK).body(responseData);
    }
}
