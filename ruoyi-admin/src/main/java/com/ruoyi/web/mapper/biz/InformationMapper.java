package com.ruoyi.web.mapper.biz;

import com.ruoyi.web.domain.Information;

import java.util.List;

/**
 * 学员 数据层
 *
 * @author null
 * @date 2019-05-08
 */
public interface InformationMapper {
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
     * 删除学员
     *
     * @param iD1 学员ID
     * @return 结果
     */
    public int deleteInformationById(Integer iD1);

    /**
     * 批量删除学员
     *
     * @param iD1s 需要删除的数据ID
     * @return 结果
     */
    public int deleteInformationByIds(String[] iD1s);

    /**
     * 查询列表，支持模糊搜索
     * @param information
     * @return
     */
    List<Information> selectList(Information information);


}