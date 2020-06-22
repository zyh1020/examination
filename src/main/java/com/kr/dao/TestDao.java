package com.kr.dao;

import com.kr.domain.TestDomain;

import java.util.List;

public interface TestDao {
    List<TestDomain> findAllTestDomian();
}
