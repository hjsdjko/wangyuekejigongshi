package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 公司简介
 *
 * @author 
 * @email
 * @date 2021-04-30
 */
@TableName("gongshijianjie_seach")
public class GongshijianjieSeachEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongshijianjieSeachEntity() {

	}

	public GongshijianjieSeachEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 公司名称
     */
    @TableField(value = "gongshijianjie_seach_name")

    private String gongshijianjieSeachName;


    /**
     * 简介内容
     */
    @TableField(value = "gongshijianjie_seach_content")

    private String gongshijianjieSeachContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：公司名称
	 */
    public String getGongshijianjieSeachName() {
        return gongshijianjieSeachName;
    }


    /**
	 * 获取：公司名称
	 */

    public void setGongshijianjieSeachName(String gongshijianjieSeachName) {
        this.gongshijianjieSeachName = gongshijianjieSeachName;
    }
    /**
	 * 设置：简介内容
	 */
    public String getGongshijianjieSeachContent() {
        return gongshijianjieSeachContent;
    }


    /**
	 * 获取：简介内容
	 */

    public void setGongshijianjieSeachContent(String gongshijianjieSeachContent) {
        this.gongshijianjieSeachContent = gongshijianjieSeachContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GongshijianjieSeach{" +
            "id=" + id +
            ", gongshijianjieSeachName=" + gongshijianjieSeachName +
            ", gongshijianjieSeachContent=" + gongshijianjieSeachContent +
            ", createTime=" + createTime +
        "}";
    }
}
