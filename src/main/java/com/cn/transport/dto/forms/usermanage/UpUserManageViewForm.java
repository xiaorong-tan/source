package com.cn.transport.dto.forms.usermanage;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/4
 * Time:18:34
 * <p>
 * Now, God only knows
 */
@Data
public class UpUserManageViewForm {

    /**
     * guid
     */
    @NotNull(message = "guid不能为空！")
    private Long guid;

    /**
     * 员工姓名
     */
    @NotNull(message = "员工姓名不能为空！")
    private String userName;

    /**
     * 公司id
     */
    @NotNull(message = "公司id不能为空！")
    private Long comId;

    /**
     * 部门id
     */
    @NotNull(message = "部门id不能为空")
    private Long depId;

    /**
     * 工号
     */
    @NotNull(message = "工号不能为空！")
    private Integer number;

}
