package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiarubankeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiarubankeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiarubankeView;


/**
 * 加入班课
 *
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface JiarubankeService extends IService<JiarubankeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiarubankeVO> selectListVO(Wrapper<JiarubankeEntity> wrapper);
   	
   	JiarubankeVO selectVO(@Param("ew") Wrapper<JiarubankeEntity> wrapper);
   	
   	List<JiarubankeView> selectListView(Wrapper<JiarubankeEntity> wrapper);
   	
   	JiarubankeView selectView(@Param("ew") Wrapper<JiarubankeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiarubankeEntity> wrapper);
   	

}

