package com.gx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.po.PassengerPo;

public interface PassengerDao {
		//分页模糊查询
	    public List<PassengerPo> pageFuzzyselect(@Param("name")String name,
	    		@Param("start")int start,@Param("pageSize")int pageSize);
	    //分页模糊查询总条数
	    public int countFuzzyselect(@Param("name")String name);
	 
	    //插入住客
	    public int insertAll(PassengerPo passengerPo);
	    //删除住客
	    public int deleteById(Integer id);
	    
	  //删除住客
	    public int updateById(PassengerPo passengerPo);
	    
	
}
