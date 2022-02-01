package com.studentsub.studentsubscription.controller;

import com.studentsub.studentsubscription.model.TestKeyValue;
import com.studentsub.studentsubscription.service.TestTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestTableController {

    public static final long DEFAULT_ID = 0;

    private final TestTableService service;

    public TestTableController(TestTableService service) {
        this.service = service;
    }

    @GetMapping("/get/{id}")
    public TestKeyValue getData(@PathVariable Long id) {
        log.info("Handle request: test/get/{}", id);
        long parsedId = id == null ? DEFAULT_ID : id;
        TestKeyValue result = service.get(parsedId);
        log.info("Result: [{}]", result);
        return result;
    }
}
