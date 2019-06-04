package com.cn.transport.service.impl;

import com.cn.transport.dto.forms.bigmanage.*;
import com.cn.transport.dto.info.vo.GetBigManageListVO;
import com.cn.transport.entity.TransportManage;
import com.cn.transport.mapper.BigManageMapper;
import com.cn.transport.service.BigManageService;
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
public class BigManageServiceImpl implements BigManageService {

    @Autowired
    private BigManageMapper bigManageMapper;


    @Override
    public RestResponse add(addViewForm viewForm) {
        TransportManage transportManage = new TransportManage();
        transportManage.setStrandard(viewForm.getStrandard());
        transportManage.setAddTime(LocalDateTime.now());
        transportManage.setAddUser("self");
        transportManage.setAddUserId(1L);
        transportManage.setModTime(LocalDateTime.now());
        transportManage.setModUser("self");
        transportManage.setModUserId(1L);
        transportManage.setDeleteFlag(false);
        bigManageMapper.add(transportManage);
        return RestResponse.success("添加成功");
    }

    @Override
    public RestResponse delete(delViewForm viewForm) {
        TransportManage transportManage = new TransportManage();
        transportManage.setModTime(LocalDateTime.now());
        transportManage.setModUser("self");
        transportManage.setModUserId(1L);
        transportManage.setDeleteFlag(true);
        transportManage.setId(viewForm.getId());
        bigManageMapper.del(transportManage);
        return RestResponse.success("删除成功");
    }

    @Override
    public RestResponse update(updateViewForm viewForm) {
        TransportManage transportManage = new TransportManage();
        transportManage.setId(viewForm.getId());
        transportManage.setStrandard(viewForm.getStrandard());
        transportManage.setModTime(LocalDateTime.now());
        transportManage.setModUser("self");
        transportManage.setModUserId(1L);
        bigManageMapper.update(transportManage);
        return RestResponse.success("修改成功");
    }

    @Override
    public List<GetBigManageListVO> getList(getListViewForm viewForm) {
        List<GetBigManageListVO> list = bigManageMapper.getList();
        return list;
    }

    @Override
    public GetBigManageListVO getInfo(getInfoViewForm viewForm) {
        GetBigManageListVO vo = bigManageMapper.getInfo(viewForm.getId());
        return vo;
    }
}
