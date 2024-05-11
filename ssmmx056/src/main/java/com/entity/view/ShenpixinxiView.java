package com.entity.view;

import com.entity.ShenpixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 审批信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
@TableName("shenpixinxi")
public class ShenpixinxiView  extends ShenpixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenpixinxiView(){
	}
 
 	public ShenpixinxiView(ShenpixinxiEntity shenpixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shenpixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
