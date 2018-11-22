package com.ecjtu.demo.service.impl;

import com.ecjtu.demo.dao.MsRoomMapper;
import com.ecjtu.demo.entity.MsRoom;
import com.ecjtu.demo.service.MsRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MsRoomServiceImpl implements MsRoomService {



    @Autowired
    private MsRoomMapper msRoomMapper;


    @Override
    public MsRoom selectByPrimaryKey(Long id) {
        return msRoomMapper.selectByPrimaryKey(id);
    }
}