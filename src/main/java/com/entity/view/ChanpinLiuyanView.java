package com.entity.view;

import com.entity.ChanpinLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-30
 */
@TableName("chanpin_liuyan")
public class ChanpinLiuyanView extends ChanpinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 chanpin
			/**
			* 产品名称
			*/
			private String chanpinName;
			/**
			* 产品类型
			*/
			private Integer chanpinTypes;
				/**
				* 产品类型的值
				*/
				private String chanpinValue;
			/**
			* 产品图片
			*/
			private String chanpinPhoto;
			/**
			* 产品介绍
			*/
			private String chanpinContent;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 录入时间
			*/
			private Date insertTime;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 出生日期
			*/
			private Date yonghuTime;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public ChanpinLiuyanView() {

	}

	public ChanpinLiuyanView(ChanpinLiuyanEntity chanpinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, chanpinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set chanpin
					/**
					* 获取： 产品名称
					*/
					public String getChanpinName() {
						return chanpinName;
					}
					/**
					* 设置： 产品名称
					*/
					public void setChanpinName(String chanpinName) {
						this.chanpinName = chanpinName;
					}
					/**
					* 获取： 产品类型
					*/
					public Integer getChanpinTypes() {
						return chanpinTypes;
					}
					/**
					* 设置： 产品类型
					*/
					public void setChanpinTypes(Integer chanpinTypes) {
						this.chanpinTypes = chanpinTypes;
					}


						/**
						* 获取： 产品类型的值
						*/
						public String getChanpinValue() {
							return chanpinValue;
						}
						/**
						* 设置： 产品类型的值
						*/
						public void setChanpinValue(String chanpinValue) {
							this.chanpinValue = chanpinValue;
						}
					/**
					* 获取： 产品图片
					*/
					public String getChanpinPhoto() {
						return chanpinPhoto;
					}
					/**
					* 设置： 产品图片
					*/
					public void setChanpinPhoto(String chanpinPhoto) {
						this.chanpinPhoto = chanpinPhoto;
					}
					/**
					* 获取： 产品介绍
					*/
					public String getChanpinContent() {
						return chanpinContent;
					}
					/**
					* 设置： 产品介绍
					*/
					public void setChanpinContent(String chanpinContent) {
						this.chanpinContent = chanpinContent;
					}
					/**
					* 获取： 录入时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 录入时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}




























				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 出生日期
					*/
					public Date getYonghuTime() {
						return yonghuTime;
					}
					/**
					* 设置： 出生日期
					*/
					public void setYonghuTime(Date yonghuTime) {
						this.yonghuTime = yonghuTime;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
