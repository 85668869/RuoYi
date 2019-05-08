package com.ruoyi.web.service;

import com.ruoyi.web.domain.Information;

import java.util.List;

/**
 * 学员 服务层
 *
 * @author null
 * @date 2019-05-08
 */
public interface IInformationService {
    /**
     * 查询学员信息
     *
     * @param iD1 学员ID
     * @return 学员信息
     */
    public Information selectInformationById(Integer iD1);

    /**
     * 查询学员列表
     *
     * @param information 学员信息
     * @return 学员集合
     */
    public List<Information> selectInformationList(Information information);

    /**
     * 新增学员
     *
     * @param information 学员信息
     * @return 结果
     */
    public int insertInformation(Information information);

    /**
     * 修改学员
     *
     * @param information 学员信息
     * @return 结果
     */
    public int updateInformation(Information information);

    /**
     * 删除学员信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInformationByIds(String ids);

}
