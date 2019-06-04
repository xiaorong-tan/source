package com.cn.transport.service;

import com.cn.transport.dto.forms.bigmanage.*;
import com.cn.transport.dto.forms.usermanage.*;
import com.cn.transport.dto.info.vo.GetBigManageListVO;
import com.cn.transport.dto.info.vo.GetComListVO;
import com.cn.transport.dto.info.vo.GetDepListVO;
import com.cn.transport.dto.info.vo.GetUserListVO;
import com.cn.transport.utils.response.RestResponse;

import java.util.List;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/4
 * Time:18:31
 * <p>
 * Now, God only knows
 */
public interface BigManageService {
    /**
     * 人员添加
     *
     * @param viewForm
     * @return
     */
    RestResponse add(addViewForm viewForm);

    /**
     * 删除员工
     *
     * @param viewForm
     * @return
     */
    RestResponse delete(delViewForm viewForm);

    /**
     * 修改员工
     *
     * @param viewForm
     * @return
     */
    RestResponse update(updateViewForm viewForm);

    /**
     * 获取员工List
     *
     * @param viewForm
     * @return
     */
    List<GetBigManageListVO> getList(getListViewForm viewForm);

    /**
     * 获取员工详情
     *
     * @param viewForm
     * @return
     */
    GetBigManageListVO getInfo(getInfoViewForm viewForm);


}
