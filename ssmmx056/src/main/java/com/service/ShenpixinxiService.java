package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenpixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenpixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenpixinxiView;


/**
 * 审批信息
 *
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface ShenpixinxiService extends IService<ShenpixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenpixinxiVO> selectListVO(Wrapper<ShenpixinxiEntity> wrapper);
   	
   	ShenpixinxiVO selectVO(@Param("ew") Wrapper<ShenpixinxiEntity> wrapper);
   	
   	List<ShenpixinxiView> selectListView(Wrapper<ShenpixinxiEntity> wrapper);
   	
   	ShenpixinxiView selectView(@Param("ew") Wrapper<ShenpixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenpixinxiEntity> wrapper);
   	

}

