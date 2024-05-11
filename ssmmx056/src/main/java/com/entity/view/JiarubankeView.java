package com.entity.view;

import com.entity.JiarubankeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加入班课
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
@TableName("jiarubanke")
public class JiarubankeView  extends JiarubankeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiarubankeView(){
	}
 
 	public JiarubankeView(JiarubankeEntity jiarubankeEntity){
 	try {
			BeanUtils.copyProperties(this, jiarubankeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
