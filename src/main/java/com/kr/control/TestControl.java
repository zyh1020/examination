package com.kr.control;

import com.kr.domain.TestDomain;
import com.kr.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/TestSpringMvc")
public class TestControl {
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public String test(){
        System.out.println("测试成功！");
        System.out.println(testService);
        List<TestDomain> testDomains = testService.finadAll();

        for (TestDomain testDomain : testDomains) {
            System.out.println(testDomain);
        }
        return "jsps/testSpringMvc";
    }
}
