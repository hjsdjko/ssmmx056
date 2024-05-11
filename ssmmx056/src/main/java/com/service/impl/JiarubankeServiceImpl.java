package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiarubankeDao;
import com.entity.JiarubankeEntity;
import com.service.JiarubankeService;
import com.entity.vo.JiarubankeVO;
import com.entity.view.JiarubankeView;

@Service("jiarubankeService")
public class JiarubankeServiceImpl extends ServiceImpl<JiarubankeDao, JiarubankeEntity> implements JiarubankeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiarubankeEntity> page = this.selectPage(
                new Query<JiarubankeEntity>(params).getPage(),
                new EntityWrapper<JiarubankeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiarubankeEntity> wrapper) {
		  Page<JiarubankeView> page =new Query<JiarubankeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiarubankeVO> selectListVO(Wrapper<JiarubankeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiarubankeVO selectVO(Wrapper<JiarubankeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiarubankeView> selectListView(Wrapper<JiarubankeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiarubankeView selectView(Wrapper<JiarubankeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
