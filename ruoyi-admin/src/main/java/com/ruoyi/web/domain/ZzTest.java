package com.ruoyi.web.domain;

import com.ruoyi.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

                    /**
 * 测试表 zz_test
 *
 * @author null
 * @date 2019-05-08
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="测试",parent=BaseEntity.class)
public class ZzTest extends BaseEntity{

    private static final long serialVersionUID=1L;
    
    @ApiModelProperty(value="",name="id")
    private Long id;
        
    @ApiModelProperty(value="",name="name")
    private String name;
        
    @ApiModelProperty(value="",name="age")
    private Integer age;
                
    @ApiModelProperty(value="",name="createUserId")
    private Long createUserId;
    
}
