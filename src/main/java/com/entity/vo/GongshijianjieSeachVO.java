package com.entity.vo;

import com.entity.GongshijianjieSeachEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公司简介
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-30
 */
@TableName("gongshijianjie_seach")
public class GongshijianjieSeachVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
