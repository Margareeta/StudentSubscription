package com.studentsub.studentsubscription.service;

import com.studentsub.studentsubscription.model.TestKeyValue;
import com.studentsub.studentsubscription.repository.TestTableRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Data
@Service
@Slf4j
public class TestTableService {

    private final TestTableRepository repository;

    public TestTableService(TestTableRepository repository) {
        this.repository = repository;
    }

    public TestKeyValue get(long id) {
        validate(id);

        log.info("Try find KeyValue by id [{}]", id);
        TestKeyValue result = repository.getById(id);
        log.info("Found by id[{}]: [{}]", id, result);

        return result;
    }

    private void validate(long id) {
        log.info("Validating id:[{}]", id);
        if (id < 0) throw new IllegalArgumentException("Id less than zero");
    }
}
