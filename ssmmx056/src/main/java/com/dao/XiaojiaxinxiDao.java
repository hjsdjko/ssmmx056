package com.dao;

import com.entity.XiaojiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaojiaxinxiVO;
import com.entity.view.XiaojiaxinxiView;


/**
 * 销假信息
 * 
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface XiaojiaxinxiDao extends BaseMapper<XiaojiaxinxiEntity> {
	
	List<XiaojiaxinxiVO> selectListVO(@Param("ew") Wrapper<XiaojiaxinxiEntity> wrapper);
	
	XiaojiaxinxiVO selectVO(@Param("ew") Wrapper<XiaojiaxinxiEntity> wrapper);
	
	List<XiaojiaxinxiView> selectListView(@Param("ew") Wrapper<XiaojiaxinxiEntity> wrapper);

	List<XiaojiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaojiaxinxiEntity> wrapper);
	
	XiaojiaxinxiView selectView(@Param("ew") Wrapper<XiaojiaxinxiEntity> wrapper);
	

}
