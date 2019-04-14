package com.baojuan.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baojuan.pojo.Airplane;
import com.baojuan.service.AirplaneService;
import com.baojuan.mapper.AirportMapper;
import com.baojuan.pojo.Airport;
import com.baojuan.service.AirportService;
import com.baojuan.util.MyBatisUtil;

public class AirportServiceImpl implements AirportService{

	@Override
	public List<Airport> showTakePort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selTakePort();
	}

	@Override
	public List<Airport> showLandPort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selLandPort();
	}

}
