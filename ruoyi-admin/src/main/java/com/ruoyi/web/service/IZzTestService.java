package com.ruoyi.web.service;

import com.ruoyi.web.domain.ZzTest;

import java.util.List;

/**
 * 测试 服务层
 *
 * @author null
 * @date 2019-05-08
 */
public interface IZzTestService {
    /**
     * 查询测试信息
     *
     * @param id 测试ID
     * @return 测试信息
     */
    public ZzTest selectZzTestById(Long id);

    /**
     * 查询测试列表
     *
     * @param zzTest 测试信息
     * @return 测试集合
     */
    public List<ZzTest> selectZzTestList(ZzTest zzTest);

    /**
     * 新增测试
     *
     * @param zzTest 测试信息
     * @return 结果
     */
    public int insertZzTest(ZzTest zzTest);

    /**
     * 修改测试
     *
     * @param zzTest 测试信息
     * @return 结果
     */
    public int updateZzTest(ZzTest zzTest);

    /**
     * 删除测试信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZzTestByIds(String ids);

}
