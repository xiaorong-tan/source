package com.cn.transport.controller;

import com.cn.transport.dto.forms.bigmanage.*;
import com.cn.transport.dto.info.vo.GetBigManageListVO;
import com.cn.transport.service.BigManageService;
import com.cn.transport.utils.request.RestRequest;
import com.cn.transport.utils.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/bigManage")
public class BigController {

    @Autowired
    private BigManageService bigManageService;
    /**
     * 页面跳转
     *
     * @return
     */
    @GetMapping(value = "/goBigManage")
    public String addUser() {
        return "bigManage";
    }

    /**
     * 添加员工
     *
     * @return
     */
    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse add(@Validated @RequestBody addViewForm viewForm) {
        return bigManageService.add(viewForm);
    }

    /**
     * 删除员工
     *
     * @return
     */
    @PostMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse delete(@Validated @RequestBody RestRequest<delViewForm> request) {
        delViewForm viewForm = request.getBody();
        return bigManageService.delete(viewForm);
    }

    /**
     * 修改员工
     *
     * @return
     */

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public RestResponse update(@Validated @RequestBody updateViewForm viewForm) {
        return bigManageService.update(viewForm);
    }

    /**
     * 获取员工List
     *
     * @return
     */
    @PostMapping(value = "/getList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<GetBigManageListVO> getList(@Validated @RequestBody getListViewForm viewForm) {
        return bigManageService.getList(viewForm);
    }

    /**
     * 获取员工详情
     *
     * @return
     */
    @PostMapping(value = "/getInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public GetBigManageListVO getInfo(@Validated @RequestBody getInfoViewForm viewForm) {
        return bigManageService.getInfo(viewForm);
    }
}
