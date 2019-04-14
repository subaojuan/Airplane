package com.baojuan.service.impl;

import java.util.List;

import com.baojuan.mapper.AirplaneMapper;
import com.baojuan.pojo.Airplane;
import com.baojuan.service.AirplaneService;
import com.baojuan.util.MyBatisUtil;

public class AirplaneServiceImpl implements AirplaneService {

	@Override
	public List<Airplane> show(int takeid, int landid) {
		return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid, landid);
	}
}

