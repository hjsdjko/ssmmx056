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


import com.dao.XiaojiaxinxiDao;
import com.entity.XiaojiaxinxiEntity;
import com.service.XiaojiaxinxiService;
import com.entity.vo.XiaojiaxinxiVO;
import com.entity.view.XiaojiaxinxiView;

@Service("xiaojiaxinxiService")
public class XiaojiaxinxiServiceImpl extends ServiceImpl<XiaojiaxinxiDao, XiaojiaxinxiEntity> implements XiaojiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaojiaxinxiEntity> page = this.selectPage(
                new Query<XiaojiaxinxiEntity>(params).getPage(),
                new EntityWrapper<XiaojiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaojiaxinxiEntity> wrapper) {
		  Page<XiaojiaxinxiView> page =new Query<XiaojiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaojiaxinxiVO> selectListVO(Wrapper<XiaojiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaojiaxinxiVO selectVO(Wrapper<XiaojiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaojiaxinxiView> selectListView(Wrapper<XiaojiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaojiaxinxiView selectView(Wrapper<XiaojiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
