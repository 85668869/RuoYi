package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.common.utils.StringUtil;
import com.ruoyi.web.domain.Information;
import com.ruoyi.web.mapper.biz.InformationMapper;
import com.ruoyi.web.service.IInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 学员 服务层实现
 *
 * @author null
 * @date 2019-05-08
 */
@Service
public class InformationServiceImpl implements IInformationService {
    @Autowired
    private InformationMapper informationMapper;

    /**
     * 查询学员信息
     *
     * @param iD1 学员ID
     * @return 学员信息
     */
    @Override
    public Information selectInformationById(Integer iD1) {
        return informationMapper.selectInformationById(iD1);
    }

    /**
     * 查询学员列表
     *
     * @param information 学员信息
     * @return 学员集合
     */
    @Override
    public List<Information> selectInformationList(Information information) {
        return informationMapper.selectList(information);
    }

    /**
     * 新增学员
     *
     * @param information 学员信息
     * @return 结果
     */
    @Override
    public int insertInformation(Information information) {
        return informationMapper.insertInformation(information);
    }

    /**
     * 修改学员
     *
     * @param information 学员信息
     * @return 结果
     */
    @Override
    public int updateInformation(Information information) {
        return informationMapper.updateInformation(information);
    }

    /**
     * 删除学员对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteInformationByIds(String ids) {
        return informationMapper.deleteInformationByIds(Convert.toStrArray(ids));
    }

}
