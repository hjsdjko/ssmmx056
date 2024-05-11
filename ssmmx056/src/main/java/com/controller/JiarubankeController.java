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

import com.entity.JiarubankeEntity;
import com.entity.view.JiarubankeView;

import com.service.JiarubankeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 加入班课
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
@RestController
@RequestMapping("/jiarubanke")
public class JiarubankeController {
    @Autowired
    private JiarubankeService jiarubankeService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiarubankeEntity jiarubanke, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			jiarubanke.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			jiarubanke.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiarubankeEntity> ew = new EntityWrapper<JiarubankeEntity>();
		PageUtils page = jiarubankeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiarubanke), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiarubankeEntity jiarubanke, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			jiarubanke.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			jiarubanke.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiarubankeEntity> ew = new EntityWrapper<JiarubankeEntity>();
		PageUtils page = jiarubankeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiarubanke), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiarubankeEntity jiarubanke){
       	EntityWrapper<JiarubankeEntity> ew = new EntityWrapper<JiarubankeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiarubanke, "jiarubanke")); 
        return R.ok().put("data", jiarubankeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiarubankeEntity jiarubanke){
        EntityWrapper< JiarubankeEntity> ew = new EntityWrapper< JiarubankeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiarubanke, "jiarubanke")); 
		JiarubankeView jiarubankeView =  jiarubankeService.selectView(ew);
		return R.ok("查询加入班课成功").put("data", jiarubankeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiarubankeEntity jiarubanke = jiarubankeService.selectById(id);
        return R.ok().put("data", jiarubanke);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiarubankeEntity jiarubanke = jiarubankeService.selectById(id);
        return R.ok().put("data", jiarubanke);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiarubankeEntity jiarubanke, HttpServletRequest request){
    	jiarubanke.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiarubanke);

        jiarubankeService.insert(jiarubanke);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiarubankeEntity jiarubanke, HttpServletRequest request){
    	jiarubanke.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiarubanke);
    	jiarubanke.setUserid((Long)request.getSession().getAttribute("userId"));

        jiarubankeService.insert(jiarubanke);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiarubankeEntity jiarubanke, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiarubanke);
        jiarubankeService.updateById(jiarubanke);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiarubankeService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiarubankeEntity> wrapper = new EntityWrapper<JiarubankeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiarubankeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
