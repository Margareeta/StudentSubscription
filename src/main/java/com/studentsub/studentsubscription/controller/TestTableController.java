package com.studentsub.studentsubscription.controller;

import com.studentsub.studentsubscription.model.TestKeyValue;
import com.studentsub.studentsubscription.service.TestTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestTableController {

    public static final long DEFAULT_ID = 0;

    private final TestTableService service;

    public TestTableController(TestTableService service) {
        this.service = service;
    }

    @GetMapping("/get")
    @RequestBody
    public TestKeyValue getData(Long id) {

        long parsedId = id == null ? DEFAULT_ID : id;

        return service.get(parsedId);
    }
}
