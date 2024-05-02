package com.entity.model;

import com.entity.GongshijianjieSeachEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公司简介
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-30
 */
public class GongshijianjieSeachModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 公司名称
     */
    private String gongshijianjieSeachName;


    /**
     * 简介内容
     */
    private String gongshijianjieSeachContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：公司名称
	 */
    public String getGongshijianjieSeachName() {
        return gongshijianjieSeachName;
    }


    /**
	 * 设置：公司名称
	 */
    public void setGongshijianjieSeachName(String gongshijianjieSeachName) {
        this.gongshijianjieSeachName = gongshijianjieSeachName;
    }
    /**
	 * 获取：简介内容
	 */
    public String getGongshijianjieSeachContent() {
        return gongshijianjieSeachContent;
    }


    /**
	 * 设置：简介内容
	 */
    public void setGongshijianjieSeachContent(String gongshijianjieSeachContent) {
        this.gongshijianjieSeachContent = gongshijianjieSeachContent;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
