package com.cn.transport.mapper;

import com.cn.transport.dto.info.vo.GetBigManageListVO;
import com.cn.transport.entity.TransportManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:Nobody When I wrote this, only God and I understood what I was doing
 * <p>
 * Date:2019/4/5
 * Time:20:29
 * <p>
 * Now, God only knows
 */
@Mapper
@Repository
public interface BigManageMapper {
    void add(@Param("transportManage") TransportManage transportManage);

    void del(@Param("transportManage") TransportManage transportManage);

    void update(@Param("transportManage") TransportManage transportManage);

    List<GetBigManageListVO> getList();

    GetBigManageListVO getInfo(@Param("id") Long id);
}
