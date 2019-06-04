package com.cn.transport.controller;

import com.cn.transport.dto.forms.usermanage.*;
import com.cn.transport.dto.info.vo.GetUserListVO;
import com.cn.transport.service.UserManageService;
import com.cn.transport.utils.request.RestRequest;
import com.cn.transport.utils.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * Date:2019/4/4
 * Time:18:03
 * <p>
 * Now, God only knows
 * 人员管理
 */
@Controller
@RequestMapping("/web/userManage")
public class UserManageController {

    @Autowired
    private UserManageService userManageService;

    /**
     * 页面跳转
     *
     * @return
     */
    @GetMapping(value = "/goIndex")
    public String addUser() {
        return "index";
    }

    /**
     * 页面跳转
     *
     * @return
     */
    @GetMapping(value = "/goUserManage")
    public String get() {
        return "userManage";
    }


    /**
     * 添加员工
     *
     * @return
     */
    @PostMapping(value = "/addUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse addUser(@Validated @RequestBody AddUserManageViewForm viewForm) {
        return userManageService.addUser(viewForm);
    }

    /**
     * 删除员工
     *
     * @return
     */
    @PostMapping(value = "/deleteUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse deleteUser(@Validated @RequestBody RestRequest<DelUserManageViewForm> request) {
        DelUserManageViewForm viewForm = request.getBody();
        return userManageService.deleteUser(viewForm);
    }

    /**
     * 修改员工
     *
     * @return
     */

    @PostMapping(value = "/updateUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse updateUser(@Validated @RequestBody UpUserManageViewForm viewForm) {
        return userManageService.updateUser(viewForm);
    }

    /**
     * 获取员工List
     *
     * @return
     */
    @PostMapping(value = "/getUserList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<GetUserListVO> getUserList(@Validated @RequestBody GetUserListManageViewForm viewForm) {
        return userManageService.getUserList(viewForm);
    }

    /**
     * 获取员工详情
     *
     * @return
     */
    @PostMapping(value = "/getUserInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse getUserInfo(@Validated @RequestBody GetUserInfoManageViewForm viewForm) {
        return userManageService.getUserInfo(viewForm);
    }

    /**
     * 获取公司
     *
     * @return
     */
    @PostMapping(value = "/getComList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse getComList(@Validated @RequestBody GetComListManageViewForm viewForm) {
        return RestResponse.success(userManageService.getComList(viewForm));
    }

    /**
     * 获取部门
     *
     * @return
     */
    @PostMapping(value = "/getDepList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse getDepList(@Validated @RequestBody GetDepListManageViewForm viewForm) {
        return RestResponse.success(userManageService.getDepList(viewForm));
    }
}
