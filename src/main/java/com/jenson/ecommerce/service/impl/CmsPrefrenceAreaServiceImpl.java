package com.jenson.ecommerce.service.impl;

import com.jenson.ecommerce.service.CmsPrefrenceAreaService;
import com.jenson.ecommerce.mapper.CmsPrefrenceAreaMapper;
import com.jenson.ecommerce.model.CmsPrefrenceArea;
import com.jenson.ecommerce.model.CmsPrefrenceAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 *
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
