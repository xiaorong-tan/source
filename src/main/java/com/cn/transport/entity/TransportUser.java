package com.cn.transport.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/5
 * Time:20:31
 * <p>
 * Now, God only knows
 * 用户表
 */
@Data
public class TransportUser {
    /**
     * 主键id
     */
    private Long guid;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 工号
     */
    private Integer number;

    /**
     * 公司
     */
    private Long comId;

    /**
     * 部门
     */
    private Long depId;

    /**
     * 添加人
     */
    private Long addUserId;
    private String addUser;
    private LocalDateTime addTime;

    /**
     * 修改人
     */
    private Long modUserId;
    private String modUser;
    private LocalDateTime modTime;

    /**
     * 0：未删除 1：删除
     */
    private boolean deleteFlag;
}
