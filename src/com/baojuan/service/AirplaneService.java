package com.baojuan.service;

import java.util.List;

import com.baojuan.pojo.Airplane;

public interface AirplaneService {
	List<Airplane> show(int takeid,int landid);
}
