package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BankexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BankexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BankexinxiView;


/**
 * 班课信息
 *
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
public interface BankexinxiService extends IService<BankexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BankexinxiVO> selectListVO(Wrapper<BankexinxiEntity> wrapper);
   	
   	BankexinxiVO selectVO(@Param("ew") Wrapper<BankexinxiEntity> wrapper);
   	
   	List<BankexinxiView> selectListView(Wrapper<BankexinxiEntity> wrapper);
   	
   	BankexinxiView selectView(@Param("ew") Wrapper<BankexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BankexinxiEntity> wrapper);
   	

}

