package com.cn.transport.dto.info.vo;

import lombok.Data;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/5
 * Time:21:17
 * <p>
 * Now, God only knows
 */
@Data
public class GetUserListVO {
    /**
     * guid
     */
    private Long guid;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 公司id
     */
    private Long comId;
    private String company;

    /**
     * 部门id
     */
    private Long depId;
    private String department;

    /**
     * 工号
     */
    private Integer number;

}
