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


import com.dao.BankexinxiDao;
import com.entity.BankexinxiEntity;
import com.service.BankexinxiService;
import com.entity.vo.BankexinxiVO;
import com.entity.view.BankexinxiView;

@Service("bankexinxiService")
public class BankexinxiServiceImpl extends ServiceImpl<BankexinxiDao, BankexinxiEntity> implements BankexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BankexinxiEntity> page = this.selectPage(
                new Query<BankexinxiEntity>(params).getPage(),
                new EntityWrapper<BankexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BankexinxiEntity> wrapper) {
		  Page<BankexinxiView> page =new Query<BankexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BankexinxiVO> selectListVO(Wrapper<BankexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BankexinxiVO selectVO(Wrapper<BankexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BankexinxiView> selectListView(Wrapper<BankexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BankexinxiView selectView(Wrapper<BankexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
