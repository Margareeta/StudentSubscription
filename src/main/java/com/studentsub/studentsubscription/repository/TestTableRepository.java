package com.studentsub.studentsubscription.repository;

import com.studentsub.studentsubscription.model.TestKeyValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TestTableRepository extends CrudRepository<TestKeyValue,Long> {
   TestKeyValue getAllBy(Long id);
}
