package com.studentsub.studentsubscription.service;

import com.studentsub.studentsubscription.model.TestTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestTableService implements ITestTableService{
    @Override
    public List<TestTable> list() {
        return null;
    }

    @Override
    public TestTable findById(Long id) {
        return null;
    }

    @Override
    public TestTable create(TestTable table) {
        return null;
    }

    @Override
    public TestTable update(TestTable table, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
