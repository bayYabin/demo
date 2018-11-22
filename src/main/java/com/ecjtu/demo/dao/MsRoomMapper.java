package com.ecjtu.demo.dao;

import com.ecjtu.demo.entity.MsRoom;

public interface MsRoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MsRoom record);

    int insertSelective(MsRoom record);

    MsRoom selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MsRoom record);

    int updateByPrimaryKey(MsRoom record);
}