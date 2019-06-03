package com.cn.transport.mapper;

import com.cn.transport.dto.info.vo.GetComListVO;
import com.cn.transport.dto.info.vo.GetDepListVO;
import com.cn.transport.dto.info.vo.GetUserListVO;
import com.cn.transport.entity.TransportUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
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
public interface UserManageMapper {

    /**
     * 人员添加
     *
     * @param transportUser
     * @return
     */
    Integer addOrder(@Param("transportUser") TransportUser transportUser);

    /**
     * 删除员工
     *
     * @param guidList
     * @return
     */
    Integer deleteUser(@Param("guidList") List<Long> guidList);

    /**
     * 修改员工
     *
     * @param transportUser
     * @return
     */
    Integer updateUser(@Param("transportUser") TransportUser transportUser);

    /**
     * 获取员工List
     *
     * @return
     */
    List<GetUserListVO> getUserList();

    /**
     * 获取员工详情
     *
     * @param guid
     * @return
     */
    GetUserListVO getUserInfo(@Param("guid") Long guid);

    List<GetComListVO> getComList();

    List<GetDepListVO> getDepList();
}
