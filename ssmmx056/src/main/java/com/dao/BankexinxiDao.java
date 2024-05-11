package com.dao;

import com.entity.BankexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BankexinxiVO;
import com.entity.view.BankexinxiView;


/**
 * 班课信息
 * 
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface BankexinxiDao extends BaseMapper<BankexinxiEntity> {
	
	List<BankexinxiVO> selectListVO(@Param("ew") Wrapper<BankexinxiEntity> wrapper);
	
	BankexinxiVO selectVO(@Param("ew") Wrapper<BankexinxiEntity> wrapper);
	
	List<BankexinxiView> selectListView(@Param("ew") Wrapper<BankexinxiEntity> wrapper);

	List<BankexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BankexinxiEntity> wrapper);
	
	BankexinxiView selectView(@Param("ew") Wrapper<BankexinxiEntity> wrapper);
	

}
