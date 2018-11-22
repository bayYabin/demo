package com.ecjtu.demo.web;

import com.ecjtu.demo.entity.MsRoom;
import com.ecjtu.demo.service.MsRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class MsRoomController {
    @Autowired
    private MsRoomService msRoomService;

    /**
     * 获取所有的区域信息
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        MsRoom msRoom= msRoomService.selectByPrimaryKey(16L);
        modelMap.put("msRoom", msRoom);
        return modelMap;
    }


}
