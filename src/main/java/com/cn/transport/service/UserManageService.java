package com.cn.transport.service;

import com.cn.transport.dto.forms.usermanage.*;
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
public interface UserManageService {
    /**
     * 人员添加
     *
     * @param viewForm
     * @return
     */
    RestResponse addUser(AddUserManageViewForm viewForm);

    /**
     * 删除员工
     *
     * @param viewForm
     * @return
     */
    RestResponse deleteUser(DelUserManageViewForm viewForm);

    /**
     * 修改员工
     *
     * @param viewForm
     * @return
     */
    RestResponse updateUser(UpUserManageViewForm viewForm);

    /**
     * 获取员工List
     *
     * @param viewForm
     * @return
     */
    List<GetUserListVO> getUserList(GetUserListManageViewForm viewForm);

    /**
     * 获取员工详情
     *
     * @param viewForm
     * @return
     */
    RestResponse getUserInfo(GetUserInfoManageViewForm viewForm);

    /**获取公司
     * @param viewForm
     * @return
     */
    List<GetComListVO> getComList(GetComListManageViewForm viewForm);

    /**
     * @param viewForm
     * @return
     */
    List<GetDepListVO> getDepList(GetDepListManageViewForm viewForm);
}
