package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.GongshijianjieSeachDao;
import com.entity.GongshijianjieSeachEntity;
import com.service.GongshijianjieSeachService;
import com.entity.view.GongshijianjieSeachView;

/**
 * 公司简介 服务实现类
 * @author 
 * @since 2021-04-30
 */
@Service("gongshijianjieSeachService")
@Transactional
public class GongshijianjieSeachServiceImpl extends ServiceImpl<GongshijianjieSeachDao, GongshijianjieSeachEntity> implements GongshijianjieSeachService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<GongshijianjieSeachView> page =new Query<GongshijianjieSeachView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
