package org.hqu.production_ms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.Custom;
import org.hqu.production_ms.domain.CustomExample;

public interface CustomMapper {
	
	//扩展的mapper接口方法
	int deleteBatch(String[] ids);
	
	int changeStatus(String[] ids);
	
	int updateNote(Custom record);
	
	List<Custom> searchCustomByCustomName(String customName);
	
	List<Custom> searchCustomByCustomId(String customId);
	
	
    int countByExample(CustomExample example);

    int deleteByExample(CustomExample example);

    int deleteByPrimaryKey(String customId);

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(String customId);

    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}