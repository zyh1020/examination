package com.kr.service;

import com.kr.dao.TestDao;
import com.kr.domain.TestDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImp implements TestService {

    @Autowired
    private TestDao testDao;

    public List<TestDomain> finadAll() {
        System.out.println("server测试成功");
        System.out.println(testDao);
        return testDao.findAllTestDomian();
    }
}
