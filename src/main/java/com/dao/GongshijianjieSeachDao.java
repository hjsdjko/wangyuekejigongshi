package com.dao;

import com.entity.GongshijianjieSeachEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongshijianjieSeachView;

/**
 * 公司简介 Dao 接口
 *
 * @author 
 * @since 2021-04-30
 */
public interface GongshijianjieSeachDao extends BaseMapper<GongshijianjieSeachEntity> {

   List<GongshijianjieSeachView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
