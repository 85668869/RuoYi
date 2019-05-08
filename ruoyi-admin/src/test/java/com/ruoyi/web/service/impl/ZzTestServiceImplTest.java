package com.ruoyi.web.service.impl;

import static org.junit.Assert.*;

import com.ruoyi.RuoYiApplication;
import com.ruoyi.common.json.JSON;
import com.ruoyi.system.service.ISysUserService;
import com.ruoyi.web.service.IZzTestService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jingchun.zhang on 2019/5/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RuoYiApplication.class})
public class ZzTestServiceImplTest {
    Object ret = null;


    @Autowired
    IZzTestService testService;
    @Autowired
    ISysUserService userService;

    @After
    public void tearDown() throws Exception {
        System.out.println(JSON.marshal(ret));
    }

    @Test
    public void selectZzTestById() throws Exception {
        ret =testService.selectZzTestById(1L);
    }

    @Test
    public void selectZzTestList() throws Exception {
        ret = userService.selectUserById(1L);
    }

    @Test
    public void insertZzTest() throws Exception {
    }

    @Test
    public void updateZzTest() throws Exception {
    }

    @Test
    public void deleteZzTestByIds() throws Exception {
    }

}