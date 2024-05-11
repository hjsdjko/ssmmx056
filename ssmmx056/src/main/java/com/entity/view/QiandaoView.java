package com.entity.view;

import com.entity.QiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 签到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-24 17:01:02
 */
@TableName("qiandao")
public class QiandaoView  extends QiandaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiandaoView(){
	}
 
 	public QiandaoView(QiandaoEntity qiandaoEntity){
 	try {
			BeanUtils.copyProperties(this, qiandaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
