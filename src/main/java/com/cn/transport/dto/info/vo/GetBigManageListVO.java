package com.cn.transport.dto.info.vo;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class GetBigManageListVO {

    private Long id;
    private String strandard;

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
