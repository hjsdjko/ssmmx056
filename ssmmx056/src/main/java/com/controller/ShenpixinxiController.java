package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShenpixinxiEntity;
import com.entity.view.ShenpixinxiView;

import com.service.ShenpixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 审批信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
@RestController
@RequestMapping("/shenpixinxi")
public class ShenpixinxiController {
    @Autowired
    private ShenpixinxiService shenpixinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenpixinxiEntity shenpixinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shenpixinxi.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shenpixinxi.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenpixinxiEntity> ew = new EntityWrapper<ShenpixinxiEntity>();
		PageUtils page = shenpixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenpixinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenpixinxiEntity shenpixinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shenpixinxi.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shenpixinxi.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenpixinxiEntity> ew = new EntityWrapper<ShenpixinxiEntity>();
		PageUtils page = shenpixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenpixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenpixinxiEntity shenpixinxi){
       	EntityWrapper<ShenpixinxiEntity> ew = new EntityWrapper<ShenpixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenpixinxi, "shenpixinxi")); 
        return R.ok().put("data", shenpixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenpixinxiEntity shenpixinxi){
        EntityWrapper< ShenpixinxiEntity> ew = new EntityWrapper< ShenpixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenpixinxi, "shenpixinxi")); 
		ShenpixinxiView shenpixinxiView =  shenpixinxiService.selectView(ew);
		return R.ok("查询审批信息成功").put("data", shenpixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenpixinxiEntity shenpixinxi = shenpixinxiService.selectById(id);
        return R.ok().put("data", shenpixinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenpixinxiEntity shenpixinxi = shenpixinxiService.selectById(id);
        return R.ok().put("data", shenpixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenpixinxiEntity shenpixinxi, HttpServletRequest request){
    	shenpixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenpixinxi);

        shenpixinxiService.insert(shenpixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenpixinxiEntity shenpixinxi, HttpServletRequest request){
    	shenpixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenpixinxi);
    	shenpixinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        shenpixinxiService.insert(shenpixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShenpixinxiEntity shenpixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenpixinxi);
        shenpixinxiService.updateById(shenpixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenpixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShenpixinxiEntity> wrapper = new EntityWrapper<ShenpixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shenpixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
