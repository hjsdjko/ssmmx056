package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaojiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaojiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaojiaxinxiView;


/**
 * 销假信息
 *
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface XiaojiaxinxiService extends IService<XiaojiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaojiaxinxiVO> selectListVO(Wrapper<XiaojiaxinxiEntity> wrapper);
   	
   	XiaojiaxinxiVO selectVO(@Param("ew") Wrapper<XiaojiaxinxiEntity> wrapper);
   	
   	List<XiaojiaxinxiView> selectListView(Wrapper<XiaojiaxinxiEntity> wrapper);
   	
   	XiaojiaxinxiView selectView(@Param("ew") Wrapper<XiaojiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaojiaxinxiEntity> wrapper);
   	

}

