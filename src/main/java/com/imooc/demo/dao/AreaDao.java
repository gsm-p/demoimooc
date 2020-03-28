package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import  java.util.List;
import javax.validation.constraints.Max;

public interface AreaDao {
//    列出区域列表
//    @return areaList
    List<Area> queryArea();
    //根据ID列出具体区域
    Area queryAreaById(int areaID);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);

}
