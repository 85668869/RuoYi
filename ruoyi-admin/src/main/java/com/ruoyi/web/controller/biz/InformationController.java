package com.ruoyi.web.controller.biz;



import com.ruoyi.common.json.JSON;
import com.ruoyi.common.utils.StringUtil;
import com.ruoyi.web.domain.Information;
import com.ruoyi.web.service.IInformationService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo ;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.ExcelUtil;

import java.io.IOException;
import java.util.List;

/**
 * 学员 信息操作处理
 *
 * @author null
 * @date 2019-05-08
 */
@Slf4j
@Controller
@RequestMapping("/biz/information")
public class InformationController extends BaseController {
    private String prefix = "biz/information" ;

    @Autowired
    private IInformationService informationService;

//    @RequiresPermissions("biz:information:view")
    @GetMapping()
    public String information() {
        return prefix + "/information" ;
    }

    /**
     * 查询学员列表
     */
//    @RequiresPermissions("biz:information:list")
    @RequestMapping("/list")
    @ResponseBody
    public TableDataInfo list(Information information) throws IOException {
        log.info(JSON.marshal(information));
        startPage();
        List<Information> list = informationService.selectInformationList(information);
        return getDataTable(list);
    }


    /**
     * 导出学员列表
     */
    @RequiresPermissions("biz:information:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Information information) {
        List<Information> list = informationService.selectInformationList(information);
        ExcelUtil<Information> util = new ExcelUtil<Information>(Information. class);
        return util.exportExcel(list, "information");
    }

    /**
     * 新增学员
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add" ;
    }

    /**
     * 新增保存学员
     */
    @RequiresPermissions("biz:information:add")
    @Log(title = "学员" , businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Information information) {
        return toAjax(informationService.insertInformation(information));
    }

    /**
     * 修改学员
     */
    @GetMapping("/edit/{iD1}")
    public String edit(@PathVariable("iD1") Integer iD1, ModelMap mmap) {
        Information information =informationService.selectInformationById(iD1);
        mmap.put("information" , information);
        return prefix + "/edit" ;
    }

    /**
     * 修改保存学员
     */
    @RequiresPermissions("biz:information:edit")
    @Log(title = "学员" , businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Information information) {
        return toAjax(informationService.updateInformation(information));
    }

    /**
     * 删除学员
     */
    @RequiresPermissions("biz:information:remove")
    @Log(title = "学员" , businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(informationService.deleteInformationByIds(ids));
    }

}
