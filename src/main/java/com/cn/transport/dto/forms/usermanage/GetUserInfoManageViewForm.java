package com.cn.transport.dto.forms.usermanage;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/5
 * Time:21:05
 * <p>
 * Now, God only knows
 */
@Data
public class GetUserInfoManageViewForm {

    /**
     * guid
     */
    @NotNull(message = "guid不能为空！")
    private Long guid;
}
