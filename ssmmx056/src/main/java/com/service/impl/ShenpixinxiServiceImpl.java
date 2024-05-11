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


import com.dao.ShenpixinxiDao;
import com.entity.ShenpixinxiEntity;
import com.service.ShenpixinxiService;
import com.entity.vo.ShenpixinxiVO;
import com.entity.view.ShenpixinxiView;

@Service("shenpixinxiService")
public class ShenpixinxiServiceImpl extends ServiceImpl<ShenpixinxiDao, ShenpixinxiEntity> implements ShenpixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenpixinxiEntity> page = this.selectPage(
                new Query<ShenpixinxiEntity>(params).getPage(),
                new EntityWrapper<ShenpixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenpixinxiEntity> wrapper) {
		  Page<ShenpixinxiView> page =new Query<ShenpixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenpixinxiVO> selectListVO(Wrapper<ShenpixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenpixinxiVO selectVO(Wrapper<ShenpixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenpixinxiView> selectListView(Wrapper<ShenpixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenpixinxiView selectView(Wrapper<ShenpixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
