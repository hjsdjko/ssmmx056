package com.dao;

import com.entity.ShenpixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenpixinxiVO;
import com.entity.view.ShenpixinxiView;


/**
 * 审批信息
 * 
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface ShenpixinxiDao extends BaseMapper<ShenpixinxiEntity> {
	
	List<ShenpixinxiVO> selectListVO(@Param("ew") Wrapper<ShenpixinxiEntity> wrapper);
	
	ShenpixinxiVO selectVO(@Param("ew") Wrapper<ShenpixinxiEntity> wrapper);
	
	List<ShenpixinxiView> selectListView(@Param("ew") Wrapper<ShenpixinxiEntity> wrapper);

	List<ShenpixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenpixinxiEntity> wrapper);
	
	ShenpixinxiView selectView(@Param("ew") Wrapper<ShenpixinxiEntity> wrapper);
	

}
