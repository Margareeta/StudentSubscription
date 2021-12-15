package com.studentsub.studentsubscription.service;

import com.studentsub.studentsubscription.model.TestKeyValue;
import com.studentsub.studentsubscription.repository.TestTableRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class TestTableService {

    private final TestTableRepository repository;

    public TestTableService(TestTableRepository repository) {
        this.repository = repository;
    }

    public TestKeyValue get(long id) {
        validate(id);

        if(id == 0){
            return repository.get(-1);
        }

        return repository.get(id);
    }
}
