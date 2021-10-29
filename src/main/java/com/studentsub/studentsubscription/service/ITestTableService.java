package com.studentsub.studentsubscription.service;

import com.studentsub.studentsubscription.model.TestTable;

import java.util.List;

public interface ITestTableService {
    List<TestTable> list();
    TestTable findById(Long id);
    TestTable create(TestTable table);
    TestTable update (TestTable table, Long id);
    void  delete(Long id);
    void deleteAll();
}
