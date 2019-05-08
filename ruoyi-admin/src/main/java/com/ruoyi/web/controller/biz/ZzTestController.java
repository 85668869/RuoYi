package com.ruoyi.web.controller.biz;

import com.ruoyi.web.domain.ZzTest;
import com.ruoyi.web.service.IZzTestService;
import org.springframework.stereotype.Controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
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

/**
 * 测试 信息操作处理
 *
 * @author null
 * @date 2019-05-08
 */
@Controller
@RequestMapping("/biz/zzTest")
public class ZzTestController extends BaseController {
    private String prefix = "biz/zzTest" ;

    @Autowired
    private IZzTestService zzTestService;

    @RequiresPermissions("biz:zzTest:view")
    @GetMapping()
    public String zzTest() {
        return prefix + "/zzTest" ;
    }

    /**
     * 查询测试列表
     */
    @RequiresPermissions("biz:zzTest:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZzTest zzTest) {
        startPage();
        List<ZzTest> list = zzTestService.selectZzTestList(zzTest);
        return getDataTable(list);
    }


    /**
     * 导出测试列表
     */
    @RequiresPermissions("biz:zzTest:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZzTest zzTest) {
        List<ZzTest> list = zzTestService.selectZzTestList(zzTest);
        ExcelUtil<ZzTest> util = new ExcelUtil<ZzTest>(ZzTest. class);
        return util.exportExcel(list, "zzTest");
    }

    /**
     * 新增测试
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add" ;
    }

    /**
     * 新增保存测试
     */
    @RequiresPermissions("biz:zzTest:add")
    @Log(title = "测试" , businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZzTest zzTest) {
        return toAjax(zzTestService.insertZzTest(zzTest));
    }

    /**
     * 修改测试
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        ZzTest zzTest =zzTestService.selectZzTestById(id);
        mmap.put("zzTest" , zzTest);
        return prefix + "/edit" ;
    }

    /**
     * 修改保存测试
     */
    @RequiresPermissions("biz:zzTest:edit")
    @Log(title = "测试" , businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZzTest zzTest) {
        return toAjax(zzTestService.updateZzTest(zzTest));
    }

    /**
     * 删除测试
     */
    @RequiresPermissions("biz:zzTest:remove")
    @Log(title = "测试" , businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(zzTestService.deleteZzTestByIds(ids));
    }

}
