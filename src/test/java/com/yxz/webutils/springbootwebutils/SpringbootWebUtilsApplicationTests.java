package com.yxz.webutils.springbootwebutils;

import com.yxz.webutils.springbootwebutils.domain.ReqMappingBean;
import com.yxz.webutils.springbootwebutils.service.IRequestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebUtilsApplicationTests {
    @Autowired
    private IRequestService service;
    @Test
    public void contextLoads() {
        Map<String,ReqMappingBean> map = service.getAllReqMapping();
        System.out.println(map.size());
        System.out.println(map);
    }

}
