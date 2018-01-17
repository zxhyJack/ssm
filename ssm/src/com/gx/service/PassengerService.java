package com.gx.service;

import java.util.List;

import com.gx.page.Page;
import com.gx.po.PassengerPo;

public interface PassengerService {
	//分页需要
	public Page<PassengerPo> pageFuzzyselect(String name,Page<PassengerPo> vo);
	//插入住客
	
	public int insertAll(PassengerPo  passengerPo);
	//删除住客
	public int deleteById(Integer id);
	//修改旅客信息
	public int updateById(PassengerPo  passengerPo);
}
