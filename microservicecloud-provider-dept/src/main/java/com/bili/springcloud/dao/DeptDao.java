package com.bili.springcloud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.bili.springcloud.entities.Dept;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
