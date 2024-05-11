package com.dao;

import com.entity.JiarubankeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiarubankeVO;
import com.entity.view.JiarubankeView;


/**
 * 加入班课
 * 
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface JiarubankeDao extends BaseMapper<JiarubankeEntity> {
	
	List<JiarubankeVO> selectListVO(@Param("ew") Wrapper<JiarubankeEntity> wrapper);
	
	JiarubankeVO selectVO(@Param("ew") Wrapper<JiarubankeEntity> wrapper);
	
	List<JiarubankeView> selectListView(@Param("ew") Wrapper<JiarubankeEntity> wrapper);

	List<JiarubankeView> selectListView(Pagination page,@Param("ew") Wrapper<JiarubankeEntity> wrapper);
	
	JiarubankeView selectView(@Param("ew") Wrapper<JiarubankeEntity> wrapper);
	

}
