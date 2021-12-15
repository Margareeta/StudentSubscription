package com.studentsub.studentsubscription.repository;

import com.studentsub.studentsubscription.model.TestKeyValue;
import org.springframework.stereotype.Repository;

@Repository
public class TestTableRepository {
    public TestKeyValue get(long id){
        return new TestKeyValue(id, "key"+id, "value"+id);
    }
}
