package com.cn.transport.dto.forms.usermanage;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/5
 * Time:21:05
 * <p>
 * Now, God only knows
 */
@Data
public class DelUserManageViewForm {

    /**
     * guidList
     */
    @NotNull(message = "guidList不能为空")
    private List<Long> guidList;
}
