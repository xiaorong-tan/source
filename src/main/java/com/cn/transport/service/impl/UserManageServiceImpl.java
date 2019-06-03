package com.cn.transport.service.impl;

import com.cn.transport.dto.forms.usermanage.*;
import com.cn.transport.dto.info.vo.GetComListVO;
import com.cn.transport.dto.info.vo.GetDepListVO;
import com.cn.transport.dto.info.vo.GetUserListVO;
import com.cn.transport.entity.TransportUser;
import com.cn.transport.mapper.UserManageMapper;
import com.cn.transport.service.UserManageService;
import com.cn.transport.utils.response.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/5
 * Time:20:28
 * <p>
 * Now, God only knows
 */
@Service
@Slf4j
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserManageMapper userManageMapper;

    /**
     * 人员添加
     *
     * @param viewForm
     * @return
     */
    @Override
    public RestResponse addUser(AddUserManageViewForm viewForm) {
        TransportUser transportUser = new TransportUser();
        transportUser.setComId(viewForm.getComId());
        transportUser.setDepId(viewForm.getDepId());
        transportUser.setNumber(viewForm.getNumber());
        transportUser.setUserName(viewForm.getUserName());
        transportUser.setAddTime(LocalDateTime.now());
        transportUser.setAddUser("admin");
        transportUser.setAddUserId(0L);
        transportUser.setModTime(LocalDateTime.now());
        transportUser.setModUser("admin");
        transportUser.setModUserId(0L);
        transportUser.setDeleteFlag(false);
        Integer num = userManageMapper.addOrder(transportUser);
        if (num <= 0) {
            RestResponse.error().withMessage("添加失败！");
        }
        return RestResponse.success(transportUser.getGuid()).withMessage("添加成功");
    }

    /**
     * 删除员工
     *
     * @param viewForm
     * @return
     */
    @Override
    public RestResponse deleteUser(DelUserManageViewForm viewForm) {
        Integer num = userManageMapper.deleteUser(viewForm.getGuidList());
        if (num <= 0) {
            RestResponse.error().withMessage("删除失败！");
        }
        return RestResponse.success().withMessage("删除成功");
    }

    /**
     * 修改员工
     *
     * @param viewForm
     * @return
     */
    @Override
    public RestResponse updateUser(UpUserManageViewForm viewForm) {
        TransportUser transportUser = new TransportUser();
        transportUser.setGuid(viewForm.getGuid());
        transportUser.setComId(viewForm.getComId());
        transportUser.setDepId(viewForm.getDepId());
        transportUser.setNumber(viewForm.getNumber());
        transportUser.setUserName(viewForm.getUserName());
        transportUser.setModTime(LocalDateTime.now());
        transportUser.setModUser("admin");
        transportUser.setModUserId(0L);
        Integer num = userManageMapper.updateUser(transportUser);
        if (num <= 0) {
            RestResponse.error().withMessage("修改失败！");
        }
        return RestResponse.success().withMessage("修改成功");
    }

    /**
     * 获取员工List
     *
     * @param viewForm
     * @return
     */
    @Override
    public List<GetUserListVO> getUserList(GetUserListManageViewForm viewForm) {
        List<GetUserListVO> list = userManageMapper.getUserList();
        return list;
    }

    /**
     * 获取员工详情
     *
     * @param viewForm
     * @return
     */
    @Override
    public RestResponse getUserInfo(GetUserInfoManageViewForm viewForm) {
        GetUserListVO getUserListVO = userManageMapper.getUserInfo(viewForm.getGuid());
        return RestResponse.success(getUserListVO);
    }

    /**
     * 获取公司
     *
     * @param viewForm
     * @return
     */
    @Override
    public List<GetComListVO> getComList(GetComListManageViewForm viewForm) {
        List<GetComListVO> list = userManageMapper.getComList();
        return list;
    }

    /**
     * @param viewForm
     * @return
     */
    @Override
    public List<GetDepListVO> getDepList(GetDepListManageViewForm viewForm) {
        List<GetDepListVO> list = userManageMapper.getDepList();
        return list;
    }
}
