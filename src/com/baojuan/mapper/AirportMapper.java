package com.baojuan.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baojuan.pojo.Airport;

public interface AirportMapper {
	@Select("select * from airport where id in (select distinct takeid from airplane)")
	List<Airport> selTakePort();
	@Select("select * from airport where id in (select distinct landid from airplane)")
	List<Airport> selLandPort();
}
