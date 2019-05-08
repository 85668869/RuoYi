package com.ruoyi.web.service.impl;

import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.web.domain.ZzTest;
import com.ruoyi.web.mapper.biz.ZzTestMapper;
import com.ruoyi.web.service.IZzTestService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ruoyi.common.support.Convert;

/**
 * 测试 服务层实现
 *
 * @author null
 * @date 2019-05-08
 */
@Slf4j
@Service
public class ZzTestServiceImpl implements IZzTestService {
    @Autowired
    private ZzTestMapper zzTestMapper;
    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 查询测试信息
     *
     * @param id 测试ID
     * @return 测试信息
     */
    @Override
    public ZzTest selectZzTestById(Long id) {
        log.info("selectZzTestById id:{}",id);
        return zzTestMapper.selectZzTestById(id);
    }

    /**
     * 查询测试列表
     *
     * @param zzTest 测试信息
     * @return 测试集合
     */
    @Override
    public List<ZzTest> selectZzTestList(ZzTest zzTest) {
        return zzTestMapper.selectZzTestList(zzTest);
    }

    /**
     * 新增测试
     *
     * @param zzTest 测试信息
     * @return 结果
     */
    @Override
    public int insertZzTest(ZzTest zzTest) {
        return zzTestMapper.insertZzTest(zzTest);
    }

    /**
     * 修改测试
     *
     * @param zzTest 测试信息
     * @return 结果
     */
    @Override
    public int updateZzTest(ZzTest zzTest) {
        return zzTestMapper.updateZzTest(zzTest);
    }

    /**
     * 删除测试对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZzTestByIds(String ids) {
        return zzTestMapper.deleteZzTestByIds(Convert.toStrArray(ids));
    }

}
